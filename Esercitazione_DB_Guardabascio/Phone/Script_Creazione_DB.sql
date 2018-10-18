
#create database if not exists Phone;

USE Phone;

#DROP TABLE country;
CREATE TABLE IF NOT EXISTS country (
	code varchar(2) not null,
    name varchar(32) not null,
    primary key(code)
    );
    
#DROP TABLE brand;
CREATE TABLE IF NOT EXISTS brand (
	id int(11) not null auto_increment,
    name varchar(32) not null,
    country varchar(2) not null,
    constraint pk_id primary key(id),
    constraint fk_country foreign key (country) references country(code)
    );

#DROP TABLE opsys;
CREATE TABLE IF NOT EXISTS opsys (
	id int(11) not null auto_increment,
    description varchar(64) not null,
    company varchar(64) not null,
    openSource tinyint(1) not null,
    constraint pk_id primary key(id)
    );

#DROP TABLE smartphone;
CREATE TABLE IF NOT EXISTS smartphone (
	id int(11) not null auto_increment,
    name varchar(64) not null,
    ram varchar(5) not null,
    cpu varchar(64) not null,
    displayPpi int(11) not null,
    displaySize varchar(12) not null,
    displayResolution varchar(64) not null,
    size varchar(64) not null,
    weight int(4) not null,
    notes varchar(1024) not null,
    brand int(11) not null,
    opsys int(11) not null,
    constraint pk_id primary key(id),
    constraint fk_brand foreign key (brand) references brand(id),
    constraint fk_opSys foreign key (opsys) references opsys(id)
    );

