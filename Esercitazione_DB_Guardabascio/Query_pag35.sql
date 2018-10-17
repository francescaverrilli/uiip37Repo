#1Select name and brand of all smartphones in the database;
# 19 righe 
select smartphone.name , brand.name from smartphone 
inner join brand on smartphone.brand= brand.id;

#2.Select name and opSys of all smartphones in the database sorted by opSys, name;
# 19 righe
select smartphone.name , opsys.description from smartphone 
inner join opsys on smartphone.opsys= opsys.id 
order by opsys.description , smartphone.name;

#3.Select name and opSys of all Android smartphones in the
#database descendant sorted by weight;
#12 righe
select smartphone.name , opsys.description from smartphone 
inner join opsys on smartphone.opsys= opsys.id and opsys.description like "%Android%"
order by smartphone.weight desc;

#4.Select name, brand, country of all smartphones in the 
#database sorted by country, brand, name;
# 19 righe
select smartphone.name ,brand.name, country.name from smartphone 
inner join brand on smartphone.brand= brand.id 
inner join country on brand.country=country.code
order by country.name , brand.name , smartphone.name ;

#5.Select count of smartphones in the database with 3Gb ram;
#2
select count(*) as numero from smartphone where ram like "%3Gb%";

#6.Select count of smartphones for each opSysin the database;
#4 righe
select count(*) as number ,opsys.description 
from smartphone
inner join opsys on smartphone.opsys=opsys.id group by opsys.id;

#7.Select count of smartphones for each country in the database;
# 5 righe
select count(*) as number , country.name 
from smartphone
inner join brand on  smartphone.brand=brand.id
inner join country on  brand.country=country.code group by country.name ;

#8 - Selezionare il nome di tutte le country ed i relativi brand se presenti, 
#se presenti far riferimento ai brand
#14 righe
select country.name , brand.name
from country left join
brand on brand.country=country.code;
