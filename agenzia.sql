

create database if not exists agenzia;

create table if not exists aereoporto(
citta varchar(20) not null primary key,
nazione varchar(20) not null,
npiste int
);


create table if not exists aereo(
	tipoAereo varchar(4) not null primary key,
	nPass int not null,
	quantitaMerci int not null
);

create table if not exists volo(
	idVolo int not null,
    giornoSett varchar(10) not null,
    cittaPart varchar(20) not null,
    cittaArr varchar(20) not null,
    tipoAereo varchar(4) not null,
    oraPartenza int(2) not null,
    oraArrivo int(2) not null,
    primary key(idVolo,giornoSett),
    CONSTRAINT fk_cittaPart FOREIGN KEY (cittaPart) REFERENCES aereoporto(citta),
    CONSTRAINT fk_cittaArr FOREIGN KEY (cittaArr) REFERENCES aereoporto(citta),
    CONSTRAINT fk_tipoAereo FOREIGN KEY (tipoAereo) REFERENCES aereo(tipoAereo)
);



select aereoporto.citta from aereoporto 
where aereoporto.npiste is null;

select distinct (aereoporto.nazione) from aereoporto inner join volo 
on volo.cittaArr=aereoporto.citta and volo.idVolo=1
union
select distinct (aereoporto.nazione) from aereoporto inner join volo 
on volo.cittaPart=aereoporto.citta and volo.idVolo=1;


select volo.tipoAereo from volo inner join aereo 
on volo.cittaPart=aereoporto.citta ;


select distinct volo.tipoaereo from volo,aereo,aereoporto 
where volo.tipoAereo=aereo.tipoAereo and volo.cittaPart=aereoporto.citta and aereoporto.citta='Roma';

select distinct volo.tipoaereo,aereo.nPass from volo,aereo,aereoporto 
where volo.tipoAereo=aereo.tipoAereo and volo.cittaPart=aereoporto.citta and aereoporto.citta='Roma';

select distinct aereoporto.citta from aereoporto inner join volo
where volo.cittaArr='amsterdam'  and aereoporto.citta=volo.cittaPart order by aereoporto.citta;

select count(distinct(volo.idVolo)) from volo inner join aereoporto on volo.cittaPart='Napoli' and volo.cittaPart=aereoporto.citta;

select count(volo.idVolo) as num from volo inner join aereoporto 
on volo.cittaPart=aereoporto.citta and volo.cittaPart in (select distinct aereoporto.citta from aereoporto where aereoporto.nazione = 'Italia') 
and volo.cittaArr=aereoporto.citta and volo.cittaArr = (select distinct aereoporto.citta from aereoporto where aereoporto.nazione = 'Olanda')
having num>=2;

select count(volo.idVolo) as num,aereoporto.citta from volo inner join aereoporto
on volo.cittaPart = aereoporto.citta and volo.cittaArr=volo.cittaArr and volo.cittaPart in 
(select aereoporto.citta from aereoporto where aereoporto.nazione='Italia') 
and volo.cittaArr=(select aereoporto.citta from aereoporto where aereoporto.nazione='Olanda');


select volo.cittaPart,max(aereo.nPass) from aereoporto,aereo,volo 
where volo.tipoAereo=aereo.tipoAereo and volo.cittaPart=aereoporto.citta 
and aereo.nPass=(select max(aereo.nPass) from aereo);



select distinct(volo.cittaArr)from aereoporto,aereo,volo 
where volo.tipoAereo=aereo.tipoAereo and volo.cittaArr=aereoporto.citta 
and aereo.nPass=(select max(aereo.nPass) from aereo);



select volo.cittaPart,max(aereo.nPass) from aereoporto,aereo,volo 
where volo.tipoAereo=aereo.tipoAereo and volo.cittaPart=aereoporto.citta 
and aereo.nPass=(select max(aereo.nPass) from aereo)
union
select volo.cittaArr,max(aereo.nPass) from aereoporto,aereo,volo 
where volo.tipoAereo=aereo.tipoAereo and volo.cittaArr=aereoporto.citta 
and aereo.nPass=(select max(aereo.nPass) from aereo);












