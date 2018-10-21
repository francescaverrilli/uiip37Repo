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


        insert into candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita)
 values (4, "Annicchiarico", "Chiara", "via Pascoli", "83030", "Zungoli", '1991-09-9', "Avellino"), 
		(10, "Barbato","Silvio", "via dante", "3425", "Benevento", '1990-5-19', "Benevento" ),
		(7, "Abbatangelo", "Francesco", "via pasolini", "1223", "Milano", '1989-3-31', "Brescia"),
        (2, "Caserta","Vincenzo", "via pascoli", " 8932", "Avellino", '1991-5-12', "Avellino"),
        (25, "Guastaferro","Andrea", "via martiri", "0956", "Torino", '1899-12-31', "Torino");
        
        
 insert into telefono (numero, candidato)
 values ("345778899",7), 
		("234567895",4),
        ("987654321",2),
        ("567894321",10);
        
        
         insert into attivita (codice, mansione)
 values (267,"ingegnere"), 
		(350, "medico"),
		(179,"geometra"),
        (478, "perito"),
        (535, "informatico");
        
        
	     insert into titolostudio (codice, descrizione)
 values (121, "ingegneria"), 
		(212, "medicina"),
		(323, "comunicazione"),
        (434, "teologia"),
        (545, "biologia");
        
        
		insert into istruzione (codice, candidato, titolo, voto, data, istituto)
 values (73, 4, 323, "100/110", '2017-06-13', "unisannio"), 
		(82, 10, 545, "110/110",'2015-08-23', "unimol"),
		(91, 25, 121, "98/110", '2018-05-17', "unina"),
        (59, 7, 434, "95/110", '2010-04-21', "unisalerno"),
        (37, 2, 212, "99/110", '1989-07-21', "unimilano"),
		(56, 2, 545, "105/110", '1989-07-21', "unimilano");
        
        
        
         insert into esperienza (codice, candidato, attivita, datainizio, datafine, azienda)
 values (334, 10, 535, '2017-11-11', '2057-09-12', "soprasteria"), 
		(217, 4, 179,'1987-9-21','1988-04-21',  "fiat"),
		(935, 2, 478, '1893-4-12', '1934-09-23', "ferrero"),
        (543, 7, 267, '2010-4-23', '2018-10-18', "google"),
        (187, 25, 350, '1989-5-29', '1999-06-21', "apple");
        


select candidato.cognome, candidato.nome, telefono.numero from candidato inner join telefono on candidato.codice=telefono.candidato;


select candidato.cognome, candidato.nome, telefono.numero from candidato left join telefono on candidato.codice=telefono.candidato;

select candidato.cognome, candidato.nome from candidato inner join istruzione on candidato.codice=istruzione.candidato having count(*)>=2;


select titolostudio.descrizione from (candidato inner join istruzione on candidato.codice=istruzione.candidato)
inner join titolostudio on istruzione.titolo=titolostudio.codice where candidato.codice=4;