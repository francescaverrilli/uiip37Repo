# CREAZIONE DATABASE AEREOPORTO
create database if not exists archivio;

USE archivio;

# CREAZIONE TABELLA CANDIDATO
CREATE TABLE IF NOT EXISTS Candidato (
    codice int(11),
    cognome varchar(50) not null,
    nome varchar(50) not null,
    viaresidenza varchar(100) not null,
    capresidenza varchar(5)not null,
    cittaresidenza varchar(30) not null,
    datanascita date not null,
    luogonascita varchar(30) not null,
    primary key (codice)
    );
 
 # CREAZIONE TABELLA TITOLO STUDIO
CREATE TABLE IF NOT EXISTS TitoloStudio (
    codice int(11),
    descrizione varchar(50) not null,
    primary key (codice)
    );
  
    # CREAZIONE TABELLA ATTIVITA
CREATE TABLE IF NOT EXISTS Attivita (
codice int(11),
mansione varchar(100) not null,
primary key (codice)
);
    
 # CREAZIONE TABELLA TELEFONO
CREATE TABLE IF NOT EXISTS Telefono (
	numero varchar(15),
    candidato int(11) not null,
    primary key(numero),
	constraint fk_candidato2 foreign key (candidato) references candidato(codice)
    );
    

# CREAZIONE TABELLA ISTRUZIONE
CREATE TABLE IF NOT EXISTS Istruzione (
	codice int(11),
    candidato int(11) not null,
    titolo int(11) not null,
    voto varchar(10) not null ,
    data date not null,
    istituto varchar(100) not null,
    primary key(codice),
    constraint fk_titolo foreign key (titolo) references titolostudio(codice),
	constraint fk_candidato foreign key (candidato) references candidato(codice)
    );
    
    
# CREAZIONE TABELLA ESPERIENZA
CREATE TABLE IF NOT EXISTS Esperienza (
	codice int(11),
    candidato int(11) not null,
    attivita int(11) not null,
    datainizio date not null ,
    datafine date,
    azienda varchar(100) not null,
    primary key(codice),
    constraint fk_attivita foreign key (attivita) references attivita(codice),
	constraint fk_candidato3 foreign key (candidato) references candidato(codice)
    );
    