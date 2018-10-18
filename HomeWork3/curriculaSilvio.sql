DROP DATABASE IF EXISTS Curricula;

CREATE DATABASE Curricula
DEFAULT CHARACTER SET latin1
DEFAULT COLLATE latin1_general_ci;

USE Curricula;


drop table if  exists candidato;
create table candidato(
codice int (11) not null,
cognome VARCHAR(50) not null,
nome VARCHAR(50) not null,
viaresidenza varchar(100) not null,
capresidenza varchar(5) not null,
cittaresidenza varchar(30) not null,
datanascita date not null,
luogonascita varchar (30) not null,
primary key(codice)
);

drop table if exists telefono;
create table telefono(
numero varchar(15) not null,
candidato int (11) not null,
primary key(numero),
constraint fk_candidato2 foreign key (candidato) references candidato(codice)
);

drop table if exists titolostudio;
create table titolostudio(
codice Int(11) not null,
descrizione varchar(50) not null,
primary key(codice)
);

drop table if exists istruzione;
create table istruzione(
codice int(11) not null,
candidato int(11) not null,
titolo int(11) not null,
voto varchar (10),
data date not null,
istituto varchar (100) not null,
primary key (codice),
constraint fk_candidato foreign key (candidato) references candidato(codice),
constraint fk_titolo foreign key (titolo) references titolostudio(codice)
);



drop table if exists attivita;
create table attivita(
codice int(11) not null,
mansione varchar (100) not null,
primary key(codice)
);


drop table if exists esperienza;
create table esperienza(
codice int(11) not null,
candidato int (11) not null,
attivita int(11) not null,
datainizio date not null,
datafine date,
azienda varchar(100) not null,
primary key(codice),
constraint fk_attivita foreign key (attivita) references attivita(codice),
constraint fk_candidato3 foreign key (candidato) references candidato(codice)
);


select candidato.cognome, candidato.nome, telefono.numero from candidato inner join telefono on candidato.codice=telefono.candidato;


select candidato.cognome, candidato.nome, telefono.numero from candidato left join telefono on candidato.codice=telefono.candidato;

 select candidato.cognome, candidato.nome from candidato inner join istruzione on candidato.codice=istruzione.candidato having count(*)>=2;

 
