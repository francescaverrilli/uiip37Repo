/* Crea Database*/
create database if not exists archivio;
use archivio;

/* Crea Candidato */
create table if not exists candidato (
codice INT(11) AUTO_INCREMENT PRIMARY KEY,
cognome VARCHAR(50),
nome VARCHAR(50),
viaresidenza VARCHAR(100),
capresidenza VARCHAR(5),
cittaresidenza VARCHAR(30),
datanascita DATE,
luogonascita VARCHAR(30)
);

/* Crea Esperienza */
create table if not exists esperienza (
codice INT(11) AUTO_INCREMENT PRIMARY KEY,
candidato INT(11),
attivita INT(11),
datainizio DATE,
datafine DATE,
azienda VARCHAR(100)
);

/* Crea Attivita */
create table if not exists attivita (
codice INT(11) AUTO_INCREMENT PRIMARY KEY,
mansione varchar(100)
);

/* Crea Telefono */
create table if not exists telefono (
numero varchar(15) PRIMARY KEY,
candidato INT(11)
);

/* Crea Istruzione */
create table if not exists istruzione (
codice INT(11) AUTO_INCREMENT PRIMARY KEY,
candidato INT(11),
titolo INT(11),
voto VARCHAR(10),
data DATE,
istituto varchar(100)
);

/* Crea TitoloStudio */
create table if not exists titolostudio (
codice INT(11) AUTO_INCREMENT PRIMARY KEY,
descrizione varchar(50)
);


/* Vincoli Referenziali */
alter table telefono
add constraint fk_candidato2 foreign key(candidato) references candidato(codice);

alter table istruzione
add constraint fk_candidato foreign key(candidato) references candidato(codice);

alter table istruzione
add constraint fk_titolo foreign key(titolo) references titolostudio(codice);

alter table esperienza
add constraint fk_candidato3 foreign key(candidato) references candidato(codice);

alter table esperienza
add constraint fk_attivita foreign key(attivita) references attivita(codice);


/* Query */
/* 1 */
select candidato.cognome, candidato.nome, telefono.numero from candidato inner join telefono on candidato.codice=telefono.candidato;

/* 2 */
select candidato.cognome, candidato.nome, telefono.numero from candidato left join telefono on candidato.codice=telefono.candidato;

/* 3 */
select  candidato.cognome, candidato.nome from candidato 
inner join istruzione on candidato.codice=istruzione.candidato 
inner join titoloStudio on istruzione.titolo=titoloStudio.codice
group by candidato.codice having count(*) >=2;