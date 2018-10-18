CREATE DATABASE IF NOT EXISTS curriculum
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE curriculum;

CREATE TABLE IF NOT EXISTS attivita(
	codice INT(11) NOT NULL ,
	mansione VARCHAR(100) NOT NULL,
	primary key(codice)
);

CREATE TABLE IF NOT EXISTS candidato(
	codice INT(11) NOT NULL ,
	cognome VARCHAR(50)  NOT NULL,
    nome VARCHAR(50)  NOT NULL,
    viaresidenza VARCHAR(100)  NOT NULL,
    capresidenza VARCHAR(5)  NOT NULL,
    cittaresidenza VARCHAR(30)  NOT NULL,
    datanascita DATE  NOT NULL,
    luogodinascita VARCHAR(30)  NOT NULL,
	primary key(codice)
);

CREATE TABLE IF NOT EXISTS telefono(
	numero VARCHAR(15) NOT NULL ,
	candidato INT(11) NOT NULL,
	primary key(numero),
    constraint fk_candidato2 foreign key(candidato) references candidato(codice)
);



CREATE TABLE IF NOT EXISTS esperienza(
	codice INT(11) NOT NULL ,
    candidato INT(11) NOT NULL,
	attivita INT(11) NOT NULL,
    datainizio DATE  NOT NULL,
    datafine DATE,
    azienda VARCHAR(100)  NOT NULL,
	primary key(codice),
    constraint fk_attivita foreign key(attivita) references attivita(codice),
    constraint fk_candidato3 foreign key(candidato) references candidato(codice)
);



CREATE TABLE IF NOT EXISTS titolostudio(
	codice INT(11) NOT NULL ,
    descrizione VARCHAR(50)  NOT NULL,
	primary key(codice)
);


CREATE TABLE IF NOT EXISTS istruzione(
	codice INT(11) NOT NULL ,
    candidato INT(11) NOT NULL,
	titolo INT(11) NOT NULL,
    voto VARCHAR(10)  NOT NULL,
    data DATE  NOT NULL,
    istituto VARCHAR(100)  NOT NULL,
	primary key(codice),
    constraint fk_titolo foreign key(titolo) references titolostudio(codice),
    constraint fk_candidato foreign key(candidato) references candidato(codice)
);

INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 1,'Caserta','Vincenzo', 'via grotta', '01925', 'S. Martino V. C.', '1991-11-27', 'Benevento');
INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 2,'Guastaferro','Andrea', 'via f. tedesco', '25363', 'Taurasi', '1991-09-24', 'Benevento');
INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 3,'Barbato','Silvio', 'via moro', '72288', 'Benevento', '1991-12-12', 'Benevento');
INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 4,'De Gennaro','Carlo', 'via manoc', '35464', 'Caserta', '1987-05-29', 'Napoli');


INSERT INTO telefono (numero,candidato) VALUES ('3453829200', 1);
INSERT INTO telefono (numero,candidato) VALUES ('3801837484', 2);
INSERT INTO telefono (numero,candidato) VALUES ('5234556662', 3);

INSERT INTO attivita (codice,mansione) VALUES (23, 'Ingegnere');
INSERT INTO attivita (codice,mansione) VALUES (11, 'Progettista');
INSERT INTO attivita (codice,mansione) VALUES (14, 'Problem solver');

INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (1,1,23,'2019-10-10', '2028-10-11', 'LMP');
INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (2,1,11,'2019-11-11', null, 'Sopra');
INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (4,2,23,'2018-09-09', '2021-04-04', 'Cern');
INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (5,4,14,'2018-12-12', '2022-10-16', 'Apple');
	
INSERT INTO titolostudio (codice,descrizione) VALUES (1, 'Ing. Informatico');
INSERT INTO titolostudio (codice,descrizione) VALUES (2, 'Ing. elettronico');
INSERT INTO titolostudio (codice,descrizione) VALUES (3, 'Ing. Meccanico');
INSERT INTO titolostudio (codice,descrizione) VALUES (4, 'Ing. gestionale');

INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (1,1,1,'100/110', '2017-12-14', 'Università degli studi del Sannio');        
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (2,2,2,'101/110', '2017-12-14', 'Università degli studi di Milano');
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (3,3,3,'108/110', '2016-05-15', 'Università degli studi di Roma');
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (4,3,4,'102/110', '2017-03-05', 'Università degli studi di Napoli');
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (5,4,3,'91/110', '2018-08-22', 'Università degli studi di Caserta');