select name
from smartphone; 

select name, ram, size, cpu
from smartphone; 

select name
from smartphone
where displayResolution = '1080x1920'; 

select name
from smartphone
where displayResolution = '1080x1920' and ram = '3Gb';

select name
from smartphone
where name like 'galaxy%'; 

select name
from smartphone
where cpu like '%dual-core CPU' and name like 'galaxy'; 

select name
from smartphone
where weight > 150; 

select name
from smartphone
where weight < 150; 

select name
from smartphone
order by displayPpi asc; #19

select name
from smartphone
order by displayPpi desc; #19

select s.name as nomeSmartphone, b.name as nomeBrand
from smartphone as s inner join brand as b on s.brand = b.id; #19

select s.name as nomeSmartphone, o.id as sistemaOperativo
from smartphone as s inner join opsys as o on s.opsys = o.id #19
order by o.id, s.name;


select s.name as nomeSmartphone, o.id as sistemaOperativo
from smartphone as s inner join opsys as o on s.opsys = o.id
where o.description = 'Android' #12
order by s.weight DESC;

select s.name as nomeSmartphone, b.name as nomeBrand, c.name as nomeCountry
from smartphone as s inner join brand as b on s.brand = b.id
inner join country as c on b.country = c.code
order by c.name, b.name, s.name;

select count(id) as count
from smartphone
where ram = '3Gb';

select count(s.id) as count, o.description
from smartphone as s inner join opsys as o on s.opsys = o.id
group by s.opsys;

select count(s.id) as count, c.name as nomeCountry
from smartphone as s inner join brand as b on s.brand = b.id
inner join country as c on b.country = c.code
group by c.name;


/*
Selezionare il nome di tutte le country e se presenti(full outer join) i relativi brand
*/
select c.name , b.name
from country as c left outer join brand as b on c.code = b.country

