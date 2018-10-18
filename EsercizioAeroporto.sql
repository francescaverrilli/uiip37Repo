CREATE DATABASE IF NOT EXISTS Viaggio
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
    use Viaggio;
    
	drop table if exists aeroporto; 
    create table aeroporto (
	citta varchar (20),
    nazione VARCHAR (20), 
    npiste int (11),
    primary key (citta)
    );
    
    
    #AEREO(tipoAereo, nPass, quantitaMerci) 
    drop table if exists aereo;
	CREATE TABLE aereo ( 
    tipoAereo varchar (4) ,
    nPass int, 
    quantitaMerci int, 
    primary key (tipoAereo)
    );
    
    #VOLO(idVolo,giornoSett,cittaPart, cittaArr, tipoAereo,oraPartenza,oraArrivo) 
	drop table if exists volo;
	CREATE TABLE volo ( 
    idVolo int,
    giornoSett varchar (10), 
    cittaPart varchar (20),
    cittaArr varchar (20),
    tipoAereo varchar (20),
    oraPartenza int (2),
    oraArrivo int (2),
    primary key (idVolo, giornoSett)
    );
    
    alter table volo 
    add constraint fk_aereo  foreign key (tipoAereo) references aereo(tipoAereo);
    
    alter table volo
    add constraint fk_aeroportoArr foreign key(cittaArr) references aeroporto (citta);
    
    alter table volo
    add constraint fk_aeroportoPart foreign key(cittaPart) references aeroporto (citta);
    
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
        
        
        
# 1. Le città con un aeroporto di cui non è noto il numero di piste; 
   select aeroporto.citta from aeroporto
   where npiste is null;
       
#2. Le nazioni da cui parte e arriva il volo con codice AZ274;
select A.nazione, B.nazione from (aeroporto as A inner join volo on A.citta = volo.cittaPart) inner join aeroporto as B on B.citta = volo.cittaArr 
where volo.idVolo = 1;

 #3. I tipi di aereo usati nei voli che partono da Roma; 
	select aereo.tipoAereo from aeroporto inner join volo on aeroporto.citta = volo.cittaPart inner join aereo on aereo.tipoAereo = volo.tipoAereo
	where volo.cittaPart = 'Roma';
	
#4. I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma. 
	select aereo.tipoAereo, aereo.nPass from aeroporto inner join volo on aeroporto.citta = volo.cittaPart inner join aereo on aereo.tipoAereo = volo.tipoAereo
	where volo.cittaPart = 'Roma';
    
#5. Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente; 
	select aeroporto.citta, volo.cittaPart from aeroporto inner join volo on aeroporto.citta = volo.cittaArr 
    where volo.cittaArr = 'amsterdam'
    order by volo.cittaArr asc;

#6. Il numero di voli che partono il venerdì da Napoli;  
	select count(idVolo) as count from aeroporto inner join volo on aeroporto.citta = volo.cittaPart 
    where volo.giornoSett = 'venerdì' and volo.cittaPart = 'napoli';
    
#7. Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda;
    select A.citta from (aeroporto as A inner join volo on A.citta = volo.cittaPart) inner join aeroporto as B on B.citta = volo.cittaArr
	where A.nazione like 'italia' and B.nazione like 'olanda' group by A.citta having count(*) >=2;
	
 
#8. Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
	select cittaPart from volo inner join aereo on volo.tipoAereo = aereo.tipoAereo
	where nPass = (select max(nPass) from aereo);


#9. Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
	select cittaArr from volo inner join aereo on volo.tipoAereo = aereo.tipoAereo
	where nPass = (select max(nPass) from aereo);

#10. Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;
	select cittaPart, cittaArr from volo inner join aereo on volo.tipoAereo = aereo.tipoAereo
    where nPass = (select max(nPass) from aereo);
        