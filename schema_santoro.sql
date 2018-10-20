#Create database phone;

#create table if not exists country;




CREATE TABLE smartphone(
	id int(11) auto_increment, 
    ram varchar(5) not null,
    cpu varchar(64) not null,
    displayPpi int(11) not null,
    displaySize varchar(12) not null,
    displayResolution varchar(64) not null,
    size varchar(64) not null,
    weight int(4),
    notes varchar(1024),
    brand int(11),
    opsys int (11),
    
    primary key(id),
    CONSTRAINT fk_brand FOREIGN KEY (brand) REFERENCES brand(id),
	CONSTRAINT fk_opSys FOREIGN KEY (opsys) REFERENCES opsys(id)
    
);

















