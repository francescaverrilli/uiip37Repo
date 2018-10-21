create database if not exists phone
default character set latin1
default collate latin1_general_ci;

USE phone;

#drop TABLE if exists  OPSYS;
create TABLE if not exists opsys(
ID INT NOT NULL auto_increment,
DESCRIPTION VARCHAR(64),
COMPANY VARCHAR(64),
OPENSOURCE TINYINT(1),
PRIMARY KEY (ID)
);

#drop table if exists COUNTRY;
create table if not exists country(
code VARCHAR(2)  NOT NULL,
NAME VARCHAR(32) NOT NULL,
PRIMARY KEY (code)
);


#drop TABLE if exists Brand;
create table if not exists Brand(
ID INT NOT NULL auto_increment,
NAME VARCHAR(32),
COUNTRY VARCHAR(2) not null,
CONSTRAINT PK_ID PRIMARY  KEY (ID),
constraint FK_COUNTRY FOREIGN KEY (COUNTRY) REFERENCES country(code)
);

#alter table Brand 
#add constraint FK_COUNTRY FOREIGN KEY (COUNTRY) REFERENCES country(code);


CREATE table if not exists SmartPhone(
ID INT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(64) NOT NULL,
RAM VARCHAR(5) NOT NULL,
CPU VARCHAR(64) NOT NULL,
DISPLAYPPI INT(11),
DISPLAYSIZE VARCHAR(12),
DISPLAYRESOLUTION VARCHAR(64),
SIZE VARCHAR(64),
WEIGHT INT (4),
NOTES VARCHAR(1024),
BRAND INT (11) not null,
OPSYS INT (11) not null,
CONSTRAINT PK_ID PRIMARY  KEY (ID),
constraint FK_BRAND FOREIGN KEY (BRAND) REFERENCES BRAND (ID),
constraint FK_OPSYS FOREIGN KEY (OPSYS) REFERENCES OPSYS (ID)
);

/*
alter table SmartPhone 
modify brand int(11) not null,
modify opsys int (11) not null;
*/
# #####################
# DUMPING DATA PHONE 
# #####################

INSERT INTO country (code, name) VALUES
					('KR', 'South Korea'),
					('JP', 'Japan'),
					('CA', 'Canada'),
					('CH', 'China'),
					('SW', 'Sweden'),
					('US', 'United States'),
					('IT', 'Italy'),
                    ('FR', 'France');
                    
INSERT INTO brand (id, name, country) VALUES
				(1, 'SAMSUNG', 'KR'),
				(2, 'ACER', 'KR'),
				(3, 'AMOI', 'CH'),
				(4, 'HTC', 'KR'),
				(5, 'APPLE', 'US'),
				(6, 'HP', 'US'),
				(7, 'LG', 'KR'),
				(8, 'SONY', 'JP'),
				(9, 'MOTOROLA', 'US'),
				(10, 'NOKIA', 'SW'),
				(11, 'BLACKBERRY', 'CA'),
				(12, 'BBK', 'CH'),
				(13, 'WIKO', 'FR');

INSERT INTO OpSys (id, description, company, openSource) VALUES
				(1, 'Android', 'Google', 1),
				(3, 'iOS', 'Apple Inc.', 0),
				(9, 'Windows Phone 8', 'Microsoft', 0),
				(11, 'BlackBerry', 'BlackBerry', 0);

INSERT INTO Smartphone (id, name, ram, cpu, displayPpi, displaySize, displayResolution, size, weight, notes, brand, opSys) VALUES
						(1, 'HTC One M8', '2Gb', '2.3 GHz quad-core CPU', 468, '4.7', '1080x1920', '146x70x9', 160, ' ', 4, 1),
						(2, 'Iphone 5S', '1Gb', '1.3 GHz dual-core CPU', 326, '4', '640x1136', '123x58x8', 112, ' ', 5, 3),
						(3, 'Galaxy Note 3', '3Gb', '2.3 GHz Quad core CPU', 386, '5.7', '1080x1920', '151x79x8', 168, ' ', 1, 1),
						(4, 'Galaxy S4', '2Gb', '1.9 GHz Quad core CPU', 441, '5.0', '1080x1920', '136x69x8', 130, ' ', 1, 1),
						(5, 'Galaxy S5', '2Gb', '2.5 GHz Quad core CPU', 432, '5.1', '1080x1920', '142x72x8', 145, 'Water, Dust resistant', 1, 1),
						(6, 'Galaxy S4 mini', '1.5Gb', '1.7 GHz dual-core CPU', 256, '4.3', '540x960', '125x61x9', 107smartphone, ' ', 1, 1),
						(7, 'Moto X', '2Gb', '1.7 GHz dual-core CPU', 326, '4.7', '720x1280', '129x65x6', 130, ' ', 9, 1),
						(8, 'Lumia 1020', '2Gb', '1.5 GHz dual-core CPU', 386, '5.7', '768x1280', '130x71x10', 158, ' ', 10, 1),
						(9, 'Nexus 5', '2Gb', '2.3 GHz Quad core CPU', 445, '4.95', '1080x1920', '138x69x8', 130, ' ', 7, 1),
						(10, 'G2', '2Gb', '2.26 GHz Quad core CPU', 424, '5.2', '1080x1920', '138x71x9', 143, '', 7, 1),
						(11, 'Lumia 930', '2Gb', '2.2 GHz quad-core CPU', 441, '5.0', '1080x1920', '137x71x10', 167, ' ', 10, 9),
						(12, 'Galaxy S III', '2Gb', '1.5 Ghz dual-core', 306, '4.8', '720x1280', '136x70x8', 133, '', 1, 1),
						(13, 'Galaxy S II', '1Gb', '1.2 GHz dual-core', 218, '4.3', '480x800', '123x66x8.5', 116, '', 1, 1),
						(14, 'Blackberry Z30', '2Gb', '1.7 Ghz', 295, '5', '1280x768', '140x72x9.4', 170, '', 11, 11),
						(15, 'Vivo Xplay 3S', '3Gb', '2.3Ghz Quad core', 490, '6.0', '1440x2560', '158x82x8', 172, '', 12, 1),
						(16, 'Lumia 520', '512Mb', '1 GHz dual-core ', 235, '4', '480x800', '119x64x10', 124, '', 10, 9),
						(17, '8S', '512Mb', '1 GHz Dual-core', 233, '4', '480x800', '120x63x10', 113, '', 4, 9),
						(18, 'Ativ S Neo', '1Gb', '1.4 GHz dual-core', 308, '4.77', '720x1280', '135x69x9', 144, '', 1, 9),
						(19, '8X', '1Gb', '1.5 GHz dual-core', 342, '4.3', '720x1280', '32,35 x 66,2 x 10,12', 130, '', 4, 9);

SELECT  * FROM SMARTPHONE;
SELECT name, ram, size,cpu FROM SMARTPHONE;
SELECT NAME FROM SMARTPHONE 
WHERE DISPLAYRESOLUTION= "1080X1920";
SELECT NAME FROM SMARTPHONE 
WHERE DISPLAYRESOLUTION= "1080X1920" AND RAM= "3Gb";


SELECT *  FROM SMARTPHONE
WHERE NAME like "%Galaxy%";


SELECT * FROM SMARTPHONE
WHERE name like "Galaxy%" AND CPU like "%dual-core%";

SELECT * FROM SMARTPHONE 
WHERE WEIGHT>=150;

SELECT * FROM SMARTPHONE 
WHERE WEIGHT<150;

select * from smartphone
order by displayppi;

select * from smartphone
order  by  displayppi desc;
#esercizio 2
SELECT name, brand FROM SMARTPHONE;

Select name, opSys from smartphone
order by name,opsys;

Select name, opSys from smartphone
order by weight desc;


Select smartphone.name, brand.name, country.name from (smartphone inner join brand on smartphone.brand=brand.id) inner join country on country.code= brand.country
order by smartphone.name, brand.name, country.name;

select count(id) from smartphone where ram like "%3Gb%";

Select count(*), opsys.description #lei mi ci ha fatto mettere pure la descrizione
from smartphone inner join opsys on smartphone.opsys=opsys.id
group by smartphone.opsys;

Select count(*) 
from (smartphone inner join brand on smartphone.brand=brand.id) inner join country on country.code= brand.country
group by country;
