select * from smartphone;

select name,ram,size,cpu from smartphone;

select name from smartphone
where displayResolution='1080x1920';

select name from smartphone
where displayResolution='1080x1920'and ram='3Gb';


select S.name from smartphone AS S
where S.name like'%Galaxy%';

select S.name, S.cpu from smartphone AS S
where S.name like '%Galaxy%' && S.cpu like 'dual-core';

select * from smartphone
where weight>=150;

#8. Select all smartphones with weight less than 150 grams;
select * from smartphone
where weight<150;

#9. Select all smartphones sorted by display ppi;
select * from smartphone
order by displayPpi asc;

#10. Select all smartphones descendant sorted by display ppi;*/
select * from smartphone
order by displayPpi desc;

#Select name and brand of all smartphones in the database;
select name, brand from smartphone;

#Select name and opSys of all smartphones in the database sorted by opSys, name;
select name, opsys from smartphone
order by opsys,name asc;

 #Select name and opSys of all Android smartphones in the database descendant sorted
select name, opsys from opsys,smartphone
where smartphone.opsys=opsys.id
and description like'%Android%'
order by weight desc;

#Select name, brand, country of all smartphones in the database sorted by country,brand, name;
select smartphone.name, brand.name,country.name from (smartphone inner join brand on smartphone.brand=brand.id) inner join country on brand.country=country.code
order by country.name,brand.name,smartphone.name;

#Select count of smartphones in the database with 3Gb ram;
select count(smartphone.id) from smartphone
where ram='3Gb';

#Select count of smartphones for each opSys in the database;
select count(smartphone.id), opsys.description from smartphone 
	inner join opsys on smartphone.opsys = opsys.id
group by opsys.description;

#Select count of smartphones for each country in the database;
select count(smartphone.id), country.name from (smartphone inner join brand on smartphone.brand=brand.id) inner join country on brand.country=country.code
group by country.name;

