DROP DATABASE IF EXISTS Voli;

CREATE DATABASE Voli
DEFAULT CHARACTER SET latin1
DEFAULT COLLATE latin1_general_ci;

USE Voli;

DROP TABLE IF EXISTS Aeroporto;
CREATE TABLE Aeroporto(
citta VARCHAR(20) NOT NULL,
nazione VARCHAR(20) not null,
npiste int,
PRIMARY KEY (citta)
);


drop table if  exists aereo;
create table aereo(
tipoaereo varchar(4) not null,
npass int(10) not null,
quantitamerci int (10),
primary key(tipoaereo)
);

drop table if exists volo;
create table volo(
id int not null,
giornosett varchar(10) not null,
cittaPartenza varchar(20) not null,
cittaArr varchar (20) not null,
tipoaereo varchar(4) not null,
oraPartenza int (2) not null,
oraArrivo int(2) not null,
primary key(id, giornosett),
constraint fk_cittaarr foreign key (cittaArr) references Aeroporto(citta),
constraint fk_cittapartenza foreign key (cittapartenza) references Aeroporto(citta),
constraint fk_aereo foreign key (tipoaereo) references aereo(tipoaereo)
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
        
        
	
/*1*/select aeroporto.citta from aeroporto where npiste=null;

/*2*/select a.nazione, c.nazione from (aeroporto as a inner join volo  as b on a.citta=b.cittapartenza) inner join aeroporto as c on b.cittaarr=c.citta where b.id=1;

/*3*/select a.tipoaereo from (aereo as a inner join volo as b on a.tipoaereo=b.tipoaereo) where b.cittapartenza='Roma';


/*4*/select aereo.tipoaereo, aereo.npass from (aereo inner join volo on aereo.tipoaereo=volo.tipoaereo) where volo.cittapartenza='Roma';


/*5*/select volo.cittapartenza from volo where cittaarr='Amsterdam' order by volo.cittapartenza;

/*6*/select count(*) from volo where cittapartenza='Napoli' && giornosett='venerdì';



/*8*/select volo.cittapartenza from ((volo inner join aeroporto as aa on volo.cittapartenza=aa.citta) inner join aeroporto as a2 on volo.cittaarr=a2.citta) inner join aereo on aereo.tipoaereo=volo.tipoaereo where aereo.npass=(select max(npass) from aereo);

/*9*/select volo.cittaarr from ((volo inner join aeroporto as aa on volo.cittaarr=aa.citta) inner join aeroporto as a2 on volo.cittapartenza=a2.citta) inner join aereo on aereo.tipoaereo=volo.tipoaereo where aereo.npass=(select max(npass) from aereo);


/*10*/select volo.cittapartenza from ((volo inner join aeroporto as aa on volo.cittapartenza=aa.citta) inner join aeroporto as a2 on volo.cittaarr=a2.citta) inner join aereo on aereo.tipoaereo=volo.tipoaereo where aereo.npass=(select max(npass) from aereo) union
(select volo.cittaarr from ((volo inner join aeroporto as aa on volo.cittaarr=aa.citta) inner join aeroporto as a2 on volo.cittapartenza=a2.citta) inner join aereo on aereo.tipoaereo=volo.tipoaereo where aereo.npass=(select max(npass) from aereo));

/*7*/ select v1.cittapartenza from (volo as v1 inner join aeroporto as aer1 on v1.cittaarr=aer1.citta) inner join aeroporto as aer2 on v1.cittapartenza=aer2.citta where aer1.nazione= 'Olanda' && aer2.nazione= 'Italia' having count(*)>=2;






