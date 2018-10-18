drop database if exists curricula;

CREATE DATABASE curricula
DEFAULT CHARACTER SET latin1
default collate latin1_general_ci;
USE curricula;

DROP table if exists candidato;
create table candidato (
codice INT(11) AUTO_INCREMENT,
cognome VARCHAR(50) not null,
nome VARCHAR(50) not null,
viaresidenza VARCHAR(100) not null,
capresidenza VARCHAR(5) not null,
cittaresidenza VARCHAR(30) not null,
datanascita DATE not null,
luogonascita VARCHAR(30) not null,
primary key(codice)
);

DROP table if exists titolostudio;
create table titolostudio (
codice INT(11) AUTO_INCREMENT,
descrizione varchar(50) not null,
primary key (codice)
);

DROP table if exists attivita;
create table attivita (
codice INT(11) AUTO_INCREMENT,
mansione varchar(100) not null,
primary key (codice)
);


DROP table if exists telefono;
create table telefono (
numero varchar(15),
candidato INT(11) not null,
primary key (numero),
constraint fk_candicato2 foreign key (candidato) references candidato(codice)
);

DROP table if exists esperienza;
create table esperienza (
codice INT(11) AUTO_INCREMENT,
candidato INT(11) not null,
attivita INT(11) not null,
datainizio DATE not null,
datafine DATE,
azienda VARCHAR(100) not null,
primary key (codice),
constraint fk_attivita foreign key (attivita) references attivita (codice),
constraint fk_candidato3 foreign key (candidato) references candidato (codice)
);

DROP table if exists istruzione;
create table istruzione (
codice INT(11) AUTO_INCREMENT,
candidato INT(11) not null,
titolo INT(11) not null,
voto VARCHAR(10) not null,
data DATE not null,
istituto varchar(100) not null,
primary key (codice),
constraint fk_titolo foreign key (titolo) references titolostudio (codice),
constraint fk_candidato foreign key (candidato) references candidato (codice)
);


/*
•	visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono
*/
select c.nome, c.cognome, t.numero
from candidato as c inner join telefono as t on c.codice = t.candidato;

/*
•	•	visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono,
includendo nell’elenco anche i candidati di cui non si conosce il numero di telefono 
*/
select c.nome, c.cognome, t.numero
from candidato as c left join telefono as t on c.codice=t.candidato;

/*
•	visualizzare nome e cognome dei candidati che hanno almeno due titoli di studio
*/
select c.nome, c.cognome
from candidato as c inner join istruzione as i on c.codice = i.candidato
inner join titolostudio as t on t.codice = i.titolo
group by c.nome, c.cognome
having count(*)>=2;
