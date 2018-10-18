# CREAZIONE DATABASE AEREOPORTO
create database if not exists agenzia;

USE agenzia;

# CREAZIONE TABELLA ABILITA
CREATE TABLE IF NOT EXISTS Aeroporto (
    citta varchar(20) not null,
    nazione varchar(20) not null,
    npiste int(11), 
    primary key (citta)
    );
    
# CREAZIONE TABELLA ABILITA
CREATE TABLE IF NOT EXISTS Aereo (
    tipoAereo varchar(4) not null,
    nPass int(11) not null,
    quantitaMeerci int (11) not null,
    primary key (tipoAereo)
    );
    
# CREAZIONE TABELLA ABILITA
CREATE TABLE IF NOT EXISTS Volo (
	idVolo int(11) not null,
    giornoSett varchar(10) not null,
    cittaPart varchar(20) not null,
    cittaArr varchar(20) not null ,
    tipoAereo varchar(4) not null,
    oraPartenza int (11) not null,
    oraArrivo int(11) not null,
    primary key(idVolo, giornoSett),
    constraint fk_cittaPartenza foreign key (cittaPart) references aeroporto(citta),
    constraint fk_cittaArrivo foreign key (cittaArr) references aeroporto(citta),
	constraint fk_tipoAereo foreign key (tipoAereo) references aereo(tipoAereo)
    );
    