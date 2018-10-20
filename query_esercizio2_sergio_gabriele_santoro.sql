

SELECT smartphone.name, brand.name
FROM smartphone INNER JOIN brand
ON smartphone.brand = brand.id;

select smartphone.name , opsys.description
from smartphone INNER JOIN opsys
on smartphone.opsys=opsys.id order by opsys.description,smartphone.name;

select smartphone.name , opsys.description, smartphone.weight
from smartphone INNER JOIN opsys
on smartphone.opsys=opsys.id and opsys.description='Android' order by weight desc;

select country.name, brand.name, smartphone.name from smartphone, brand, country
where smartphone.brand=brand.id and brand.country=country.code order by country.name,brand.name,smartphone.name;

select count(*) from smartphone where ram='3Gb';

select count(*),opsys.description from smartphone inner join opsys on smartphone.opsys=opsys.id
group by smartphone.opsys;


select count(*),country.name from smartphone, brand, country
where smartphone.brand=brand.id  and brand.country=country.code group by country.code;


select country.name,brand.name from country left join brand on country.code=brand.country;

























