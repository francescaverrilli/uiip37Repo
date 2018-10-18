drop database if exists Curricula;
create database Curricula
default character set latin1
default collate latin1_general_ci;
Use Curricula;

drop table if exists candidato;
create table candidato(
codice INT(11),
cognome varchar(50) not null,
nome varchar(50) not null,
viaresidenza varchar(100) not null,
capresidenza varchar(5) not null,
cittaresidenza varchar(30) not null,
datanascita date not null,
luogonascita varchar(30) not null,
primary key (codice)
);

drop table if exists istruzione;
create table istruzione(
codice INT(11) not null,
candidato INT(11) not null,
titolo INT(11) not null,
voto varchar(10) not null,
data date not null,
istituto varchar(100) not null,
primary key (codice)
);

drop table if exists esperienza;
create table esperienza(
codice INT(11),
candidato INT(11) not null,
attivita INT(11) not null,
datainizio date not null,
datafine date,
azienda varchar(100) not null,
primary key (codice)
);

drop table if exists telefono;
create table telefono(
numero varchar(15),
candidato INT(11) not null,
primary key (numero)
);

drop table if exists attivita;
create table attivita(
codice INT(11) not null,
mansione varchar(100) not null,
primary key (codice)
);

drop table if exists titoloStudio;
create table titoloStudio(
codice INT(11) not null,
descrizione varchar(50) not null,
primary key (codice)
);


alter table telefono 
add constraint fk_candidato2 foreign key (candidato) references candidato(codice);

alter table esperienza
add constraint fk_attivita foreign key (attivita) references attivita(codice),
add constraint fk_candidato3 foreign key (candidato) references candidato(codice);

alter table istruzione
add constraint fk_titolo foreign key (titolo) references titoloStudio(codice),
add constraint fk_candidato foreign key (candidato) references candidato(codice);


# visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono
select candidato.cognome, candidato.nome, telefono.numero from candidato inner join telefono on candidato.codice=telefono.candidato;

# visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono, includendo nell’elenco anche i candidati di cui non si conosce il numero di telefono 
select candidato.cognome, candidato.nome, telefono.numero from candidato left join telefono on candidato.codice=telefono.candidato;

# visualizzare nome e cognome dei candidati che hanno almeno due titoli di studio
select  candidato.nome, candidato.cognome from candidato inner join istruzione on candidato.codice=istruzione.candidato inner join titoloStudio on istruzione.titolo=titoloStudio.codice
group by candidato.codice having count(*) >=2;


