create database if not exists aeroportodb;
use aeroportodb;

drop table if exists aeroporto;
create table if not exists aeroporto (
citta varchar(20),
nazione varchar(20),
npiste int,
primary key (citta)
);

drop table if exists aereo;
create table if not exists aereo (
tipoaereo varchar(4),
npass int,
quantitamerci int,
primary key (tipoaereo)
);
drop table if exists volo;
create table volo (
idvolo int,
giornosett varchar(10),
cittapart varchar(20),
cittaarr varchar(20),
tipoaereo varchar(4),
orapartenza int (2),
oraarrivo int(2),
primary key (idvolo,giornosett),
constraint fk_aereo foreign key (tipoaereo) references aereo(tipoaereo),
constraint fk_aeroportop foreign key (cittapart) references aeroporto(citta),
constraint fk_aeroportoa foreign key (cittaarr) references aeroporto(citta)
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
        
        #query 1 Le città con un aeroporto di cui non è noto il numero di piste
        select citta from aeroporto
        where npiste is null;
        
        #query2 Le nazioni da cui parte e arriva il volo con codice AZ274
        select a1.nazione,a2.nazione 
        from  volo inner join aeroporto as a1 on volo.cittapart=a1.citta
		inner join aeroporto as a2 on volo.cittaarr=a2.citta
        where idvolo =1;
        
        #query3  tipi di aereo usati nei voli che partono da Roma; 
        select aereo.tipoaereo from volo inner join aereo on volo.tipoaereo=aereo.tipoaereo
        where cittapart like "Roma";
        
        #query4 I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma
        select aereo.tipoaereo,npass from volo inner join aereo on volo.tipoaereo=aereo.tipoaereo
        where cittapart like "Roma";
        #query5 Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente; 
        select cittapart from volo 
        where cittaarr like "Amsterdam"
        order by cittapart asc;
        
        #6 Il numero di voli che partono il venerdì da Napoli;  
		select count(*) from volo 
        where cittapart like "Napoli" and giornosett= "venerdì";
        
        #7 Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda;
        select a1.citta, a2.citta from volo inner join aeroporto as a1 on volo.cittapart=a1.citta
		inner join aeroporto as a2 on volo.cittaarr=a2.citta
        where a1.nazione like "Italia" and a2.nazione like "Olanda" group by a1.citta
        having count(idvolo)>=2;
        
        
        #8 Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri
         select cittapart from volo inner join aereo on volo.tipoaereo=aereo.tipoaereo
        where npass=(select max(npass) from aereo);
        
        #9 Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri
        select cittaarr from volo inner join aereo on volo.tipoaereo=aereo.tipoaereo
		where npass=(select max(npass) from aereo);
        
        #10 Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri
        select cittaarr,cittapart from volo inner join aereo on volo.tipoaereo=aereo.tipoaereo
        where npass=(select max(npass) from aereo);
        