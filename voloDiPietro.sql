drop database if exists PartenzeArrivi;
create database PartenzeArrivi
default character set latin1
default collate latin1_general_ci;
Use PartenzeArrivi;

drop table if exists Aeroporto;
create table Aeroporto(
città varchar(20),
nazione varchar(20),
npiste int(11),
primary key (città)
);


#AEREO(tipoAereo, nPass, quantitaMerci) varchar 4,int int
drop table if exists Aereo;
create table Aereo(
tipoAereo varchar(4),
nPass int,
quantitaMerci int,
primary key (tipoAereo)
);

#VOLO(idVolo,giornoSett,cittaPart, cittaArr, tipoAereo,oraPartenza,oraArrivo) int, var 10,var20,var20,--,int 2,int2
drop table if exists Volo;
create table Volo(
idVolo int,
giornoSett varchar(10) not null,
cittaPart varchar(20) not null,
cittaArr varchar(20) not null,
tipoAereo varchar(4),
oraPartenza int(2),
oraArrivo int(2),
primary key (idVolo, giornoSett)
);



alter table Volo 
add constraint fk_Aereo foreign key (tipoAereo) references Aereo(tipoAereo);

alter table Volo 
add constraint fk_aeroportoA foreign key (cittaArr) references aeroporto(città);

alter table Volo
add constraint fk_aeroportoP foreign key (cittaPart) references aeroporto(città);

INSERT INTO Aeroporto (città,nazione,npiste)
 VALUES ("Napoli","Italia",5), 
		("Roma","Italia",10),
		("Amsterdam","Olanda",null),
        ("Barcellona","Spagna",8),
        ("NewYork","Stati Uniti",20);
        
INSERT INTO Aereo 
VALUES ("F35",250,1000),
		("shut",300,7564),
        ("B747",678,73643);
        
INSERT INTO Volo
VALUES  (1,"lunedì","Roma","Amsterdam","F35",12,15),
		(1,"martedì'","Napoli","Roma","shut",9,10),
        (2,"mercoledì","NewYork","Amsterdam","B747",14,15),
        (1,"giovedì","Roma","Amsterdam","F35",12,15),
		(1,"venerdì","Napoli","Roma","shut",9,10),
        (2,"sabato","NewYork","Amsterdam","B747",14,15);
        
/*1. Le città con un aeroporto di cui non è noto il numero di piste; 
2. Le nazioni da cui parte e arriva il volo con codice AZ274;
 3. I tipi di aereo usati nei voli che partono da Roma; 
4. I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma. 
5. Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente; 
6. Il numero di voli che partono il venerdì da Napoli;  
7. Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda; 
8. Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
9. Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
10. Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;*/

#1. Le città con un aeroporto di cui non è noto il numero di piste; 
select Aeroporto.città from Aeroporto
where npiste is null;

#2. Le nazioni da cui parte e arriva il volo con codice AZ274;
select a1.nazione, a2.nazione from Aeroporto as a1 inner join Volo on a1.città=Volo.cittaPart inner join aeroporto as a2 on a2.città=Volo.cittaArr
where Volo.idVolo = 1;

# 3. I tipi di aereo usati nei voli che partono da Roma; 
select Aereo.tipoAereo from Aeroporto inner join Volo on Aeroporto.città=Volo.cittaPart inner join Aereo on Aereo.tipoAereo=Volo.tipoAereo
where Volo.cittaPart= "Roma";

#4. I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma. 
select Aereo.tipoAereo, aereo.nPass from Aeroporto inner join Volo on Aeroporto.città=Volo.cittaPart inner join Aereo on Aereo.tipoAereo=Volo.tipoAereo
where Volo.cittaPart= "Roma";

#5. Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente; 
select distinct volo.cittaPart from Aeroporto inner join Volo on Aeroporto.città=Volo.cittaPart inner join Aereo on Aereo.tipoAereo=Volo.tipoAereo
where Volo.cittaArr= "Amsterdam"
order by Volo.cittaArr Asc;

#6. Il numero di voli che partono il venerdì da Napoli;  
select count(idVolo) from volo inner join aeroporto on volo.cittaPart=aeroporto.città
where volo.giornoSett="venerdì" and volo.cittaPart="Napoli";

#7. Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda; 
select a1.città from Aeroporto as a1 inner join Volo on a1.città=Volo.cittaPart inner join aeroporto as a2 on a2.città=Volo.cittaArr
where a1.nazione like "Italia" and a2.nazione like"Olanda" group by a1.città having count(*) >=2;

#8. Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
select Volo.cittaPart from Volo inner join aereo on aereo.tipoAereo=Volo.tipoAereo
where nPass=(select max(nPass) from aereo) ;

#9. Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
select Volo.cittaArr from Volo inner join aereo on aereo.tipoAereo=Volo.tipoAereo
where nPass=(select max(nPass) from aereo) ;

#10. Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;
select Volo.cittaArr,Volo.cittaPart from Volo inner join aereo on aereo.tipoAereo=Volo.tipoAereo
where nPass=(select max(nPass) from aereo) ;
