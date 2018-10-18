# CREAZIONE DATABASE MUSICA
create database if not exists Musica;

USE Musica;

# CREAZIONE TABELLA STRUMENTO
CREATE TABLE IF NOT EXISTS Strumento (
	nome varchar(20) not null,
    categoria varchar(20) default "Non specificato",
    primary key(nome)
    );
    
 
# CREAZIONE TABELLA MUSICISTA
CREATE TABLE IF NOT EXISTS Musicista (
	codiceFiscale varchar(16) not null,
    nome varchar (20) not null,
    cognome varchar(20) not null ,
    dataNascita date not null,
    sesso enum ('M','F'),
    primary key(codiceFiscale)
    );
     
	
# CREAZIONE TABELLA ABILITA
CREATE TABLE IF NOT EXISTS Abilita (
    musicista varchar(16) not null,
    strumento varchar(20) not null,
    constraint fk_musicista foreign key (musicista) references musicista(codiceFiscale),
    constraint fk_strumento foreign key (strumento) references strumento(nome)
    );

  