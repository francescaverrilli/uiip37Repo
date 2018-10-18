create database if not exists Aeroporto;
Use Aeroporto;


create table if not exists Aeroporto (
citta varchar(20) PRIMARY KEY,
nazione varchar(20),
npiste int
);

create table if not exists Aereo (
tipoAereo varchar(4) PRIMARY KEY,
nPass INT,
quantitaMerci INT
);


create table if not exists Volo (
idVolo int,
giornoSett varchar(10),
cittaPart varchar(20),
cittaArr varchar(20),
tipoAereo varchar(4),
oraPartenza int(2),
oraArrivo int(2),
primary key(idVolo,giornoSett)
);


alter table volo
add constraint fk_cittaPart foreign key(cittaPart) references aeroporto(citta);

alter table volo
add constraint fk_cittaArr foreign key(cittaArr) references aeroporto(citta);

alter table volo
add constraint fk_tipoAereo foreign key(tipoAereo) references aereo(tipoAereo);


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



/* Query */
/* 1 */
select citta from aeroporto where npiste is null;

/* 2 */
select a1.citta,a1.nazione from (aeroporto as a1 inner join volo  on a1.citta=volo.cittaPart) inner join aeroporto as a2 on a2.citta=volo.cittaArr  where volo.idVolo =1;

/* 3 */
select aereo.tipoAereo from aereo inner join volo on aereo.tipoAereo=volo.tipoAereo where volo.cittaPart like "%Roma%";

/* 4 */
select aereo.tipoAereo, aereo.nPass from aereo inner join volo on aereo.tipoAereo=volo.tipoAereo where volo.cittaPart like "%Roma%";

/* 5 */
select distinct aeroporto.citta from aeroporto inner join volo on aeroporto.citta=volo.cittaPart where volo.cittaArr like "%Amsterdam%" order by aeroporto.citta asc;

/* 6 */
select count(*) from volo where giornoSett like "%Venerdì%" and cittaPart like "%Napoli%";

/* 7 */
select a1.citta from (aeroporto as a1 inner join volo  on a1.citta=volo.cittaPart) inner join aeroporto as a2 on a2.citta=volo.cittaArr where a1.nazione like "%Italia%" and a2.nazione like "%Olanda%" group by a1.citta having count(*)>=2;

/* 8 */
select distinct a1.citta from ((aeroporto as a1 inner join volo  on a1.citta=volo.cittaPart) inner join aeroporto as a2 on a2.citta=volo.cittaArr) inner join aereo on aereo.tipoAereo=volo.tipoAereo where aereo.nPass= (select max(nPass) from aereo);

/* 9 */
select distinct a2.citta from ((aeroporto as a1 inner join volo  on a1.citta=volo.cittaPart) inner join aeroporto as a2 on a2.citta=volo.cittaArr) inner join aereo on aereo.tipoAereo=volo.tipoAereo where aereo.nPass= (select max(nPass) from aereo);

/* 10 */
select distinct a1.citta,a2.citta from ((aeroporto as a1 inner join volo  on a1.citta=volo.cittaPart) inner join aeroporto as a2 on a2.citta=volo.cittaArr) inner join aereo on aereo.tipoAereo=volo.tipoAereo where aereo.nPass= (select max(nPass) from aereo);

