#1 - Select all smartphones in the database;
# 19 righe
select * from smartphone;

#2 - Select all smartphones in the database with projection: name, ram, sizeand cpu;
# 19 righe
select name, ram, size, cpu from smartphone;

#3 - Select name of smartphones with display resolution equal to 1080x1920;
# 7 righe
select name, displayResolution from smartphone where displayResolution ="1080x1920";

#4 - Select name of smartphones with display resolution equal to 1080x1920 and 3Gb ram;
# 1 riga
select name , displayResolution , ram from smartphone where displayResolution ="1080x1920" and ram="3Gb";

# 5 Select all Galaxy smartphones;
# 6righe
select * from smartphone where name like "Galaxy%";

#6 Select all Galaxy smartphones with dual-core cpu;
# 3 righe
select * from  smartphone where name like "Galaxy%" and cpu like "%dual-core%";

#7 Select all smartphones with weight greater than or equal 150 grams;
#6 righe
select * from smartphone where weight>150;

#8.Select all smartphones with weight less than 150 grams;
#13 righe
select * from smartphone where weight<150;

#9.Select all smartphones sorted by display ppi;
# 19 righe
select * from smartphone order by displayPpi;

#10.Select all smartphones descendant sorted by display ppi;
# 19 righe
select * from smartphone order by displayPpi desc;