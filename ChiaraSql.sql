#Select all smartphones in the database;
select * from smartphone;

#Select all smartphones in the database with projection: name, ram, size and cpu;
select name, ram, size, cpu from smartphone;

#Select name of smartphones with display resolution equal to 1080x1920;
select name from smartphone
where displayResolution = '1080x1920';

#Select name of smartphones with display resolution equal to 1080x1920 and 3Gb ram;
select name from smartphone
where displayResolution = '1080x1920' and ram = '3gb';

#Select all Galaxy smartphones;
select name  from smartphone 
where name like '%Galaxy%';

#Select all Galaxy smartphones with dual-core cpu;
select B.name, B.cpu from smartphone as B
where B.name = 'Galaxy' and B.cpu = 'dual-core';

#Select all smartphones with weight greater than or equal 150 grams;
select * from smartphone
where weight >= 150;

#Select all smartphones with weight less than 150 grams;
select * from smartphone
where weight < 150;

#Select all smartphones sorted by display ppi;
select * from smartphone
order by displayPpi asc;

#Select all smartphones descendant sorted by display ppi;
select * from smartphone
order by displayPpi desc;

#1.Select name and brand of all smartphones in the database;
select name, brand from smartphone;

#2.Select name and opSysof all smartphones in the database sorted by opSys, name;
select name, opSys from smartphone
order by opSys, name asc;

#3.Select name and opSysof all Android smartphones in the database descendant sorted by weight;
select name, opsys from smartphone, opsys
where smartphone.opSys = opsys.id
and description like '%Android%'
order by weight desc;

#4.Select name, brand, country of all smartphones in the database sorted by country, brand, name;
select smartphone.name, brand.name, country.name from (smartphone inner join brand on smartphone.brand = brand.id) inner join country on brand.country = country.code
order by country.name, brand.name, smartphone.name;

#5.Select count of smartphones in the database with 3Gb ram;
select count(smartphone.id) from smartphone
where ram = '3Gb';

#6.Select count of smartphones for each opSysin the database;
select count(smartphone.id) , opsys description from smartphone
inner join opsys on smartphone.opSys = opsys.id
group by opSys.description;

#7.Select count of smartphones for each country in the database;
select count(smartphone.id), country.name from smartphone
inner join brand on smartphone.brand = brand.id
inner join country on country.code = brand.country
group by country.name;