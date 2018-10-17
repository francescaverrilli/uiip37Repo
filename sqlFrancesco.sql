CREATE DATABASE IF NOT EXISTS Phone;
USE Phone; 



create table if not exists Brand (
id INT(11) AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(32) NOT NULL,
country VARCHAR(2)NOT NULL
);


create table if not exists country (
code VARCHAR(2) PRIMARY KEY,
name VARCHAR(32) NOT NULL
);


create table if not exists smartphone (
id INT(11) auto_increment PRIMARY KEY,
name VARCHAR(64) NOT NULL,
ram VARCHAR(5) NOT NULL,
cpu VARCHAR(64) NOT NULL,
displayPpi INT(11) NOT NULL,
displaySize VARCHAR(12) NOT NULL,
displayResolution VARCHAR(64) NOT NULL,
size VARCHAR(64) NOT NULL,
weight INT(4) NOT NULL,
notes VARCHAR(1024) NOT NULL,
brand INT(11) NOT NULL,
opSys INT(11) NOT NULL);



create table if not exists opsys (
id INT(11) auto_increment PRIMARY KEY,
description VARCHAR(64) NOT NULL,
company VARCHAR(64) NOT NULL,
openSource tinyint(1) NOT NULL);



alter table brand 
add constraint fk_country foreign key(country) references country(code)


alter table smartphone
add constraint fk_brand foreign key(brand) references brand(id)


alter table smartphone
add constraint fk_opSys foreign key(opSys) references opsys(id)



1) select * from smartphone //19

2) select name,ram,size,cpu from smartphone //19

3) select name from smartphone where displayResolution="1080X1920"  // 7

4) select name from smartphone where displayResolution="1080X1920" and ram="3Gb"  // 1

5) select * from smartphone where name like "%Galaxy%"  //6

6) select * from smartphone where name like "%Galaxy%" and cpu like "%dual-core%" //3

7) select * from smartphone where weight>=150  //6

8) select * from smartphone where weight<150  //13

9) select * from smartphone order by displayPpi // 19

10) select * from smartphone order by displayPpi desc // 19



1) select smartphone.name,brand.name from smartphone inner join brand on smartphone.brand=brand.id //19

2) select smartphone.name,opSys.description from smartphone inner join opsys on smartphone.opSys=opsys.id order by smartphone.name,opSys.description //19

3) select smartphone.name,opSys.description from smartphone inner join opsys on smartphone.opSys=opsys.id where opSys.description like "%Android%" order by smartphone.weight DESC  
//12

4) select smartphone.name,brand.name,country.name from (smartphone inner join brand on smartphone.brand=brand.id) inner join country on brand.country=country.code order by country.name,brand.name,smartphone.name
//19

5) select count(id) from smartphone where ram="3Gb" // 2

6) select count(opSys),opsys.description from smartphone inner join opsys on smartphone.opSys=opsys.id group by opSys 
// Android 12 Ios 1 WP 5 BlackBerry 1 

7) select count(country.code),country.name from (smartphone inner join brand on smartphone.brand=brand.id) inner join country on brand.country=country.code group by country.code 
//South Korea 12 USA 2 Sweden 3 Canada 1 Cina 1


8) select country.name,brand.name from country left join brand on country.code=brand.country // 14