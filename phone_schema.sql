CREATE DATABASE IF NOT EXISTS phone
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE phone;

CREATE TABLE IF NOT EXISTS brand(
	id int (11) NOT NULL ,
	name varchar(32) NOT NULL,
	country varchar(2) NOT NULL,
	primary key(id),
	constraint fk_country foreign key (country) references country(code) 
);

CREATE TABLE IF NOT exists country(
	code varchar(2) not null,
	name varchar(32) not null,
	primary key (code)
);

create table if not exists opSys(
	id int (11) not null,
	description varchar (64) not null,
	company varchar (64) not null,
	openSource tinyint(1),
	primary key(id)
);

create table if not exists smartphone(
	id int (11) not null,
	name varchar(64) not null,
	ram varchar(5) not null,
	cpu varchar(64)not null,
	displayPpi int (11) not null,
	displaysize varchar(12) not null,
	displayResolution varchar(64) not null,
	size varchar(64) not null,
	weight int (4) not null,
	notes varchar(1024) not null,
	brand int (11) not null,
	opSys int (11) not null,
	primary key(id),
	constraint fk_brand foreign key(brand) references brand(id),
	constraint fk_opSys foreign key(opSys) references opSys(id) 
);
