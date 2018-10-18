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




