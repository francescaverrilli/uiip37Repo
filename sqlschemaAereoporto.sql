drop database if exists torreControllo;

CREATE DATABASE torreControllo
DEFAULT CHARACTER SET latin1
default collate latin1_general_ci;
USE torreControllo;

DROP table if exists aeroporto;

CREATE table aeroporto(
citta varchar(20),
nazione varchar(20) not null,
npiste int(3),
primary key (citta)
);

DROP table if exists aereo;

Create table aereo(
tipoAereo varchar(4), #qui ovviamente auto-increment non va essendo un varchar
nPass int(20) not null,
quantitaMerci varchar(20) not null,
primary key (tipoAereo)
);


DROP table if exists volo;
Create table volo(
idVolo int(10),
giornoSett varchar(10),
cittaPart varchar(20) not null,
cittaArr varchar(20) not null,
tipoAereo varchar(4),
oraPartenza int(2),
oraArrivo int(2),
primary key (idVolo, giornoSett),
foreign key (cittaPart) references aeroporto(citta),
foreign key (cittaArr) references aeroporto(citta),
foreign key (tipoAereo) references aereo(tipoAereo)

);

INSERT INTO aeroporto (citta,nazione,npiste)
 VALUES ("Napoli","Italia",5), 
		("Roma","Italia",10),
		("Amsterdam","Olanda",null),
        ("Barcellona","Spagna",8),
        ("NewYork","Stati Uniti",20);
        
INSERT INTO aereo 
VALUES ("F35",250,1000),
		("shut",300,7564),
        ("B747",678,73643);
        
INSERT INTO volo
VALUES (1,"lunedì","Roma","Amsterdam","F35",12,15),
		(1,"martedì'","Napoli","Roma","shut",9,10),
        (2,"mercoledì","NewYork","Amsterdam","B747",14,15),
        (1,"giovedì","Roma","Amsterdam","F35",12,15),
		(1,"venerdì","Napoli","Roma","shut",9,10),
        (2,"sabato","NewYork","Amsterdam","B747",14,15);
        

        
	