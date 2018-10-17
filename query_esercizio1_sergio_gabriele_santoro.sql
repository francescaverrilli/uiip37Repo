
select * from smartphone;

select name,ram,size,cpu from smartphone;

select name from smartphone where displayResolution='1080x1920';

select name from smartphone where displayResolution='1080x1920' and ram='3Gb';

select *from smartphone where name like 'Galaxy%';

select *from smartphone where name like 'Galaxy%' and cpu like '%dual-core';

select *from smartphone where weight>=150;

select *from smartphone where weight<150;

select *from smartphone order by displayPpi;

select *from smartphone order by displayPpi desc;



