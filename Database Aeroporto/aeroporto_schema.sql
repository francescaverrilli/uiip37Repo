CREATE DATABASE IF NOT EXISTS aereoporto
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_general_ci;
    
USE aereoporto;

CREATE TABLE IF NOT EXISTS aereoporto(
	citta varchar(20) NOT NULL ,
	nazione varchar(20) NOT NULL,
    npiste int NOT NULL,
	primary key(citta)
);

# tipoAereo 4
# quantitaMerci
CREATE TABLE IF NOT EXISTS aereo(
	tipoAereo varchar(4) NOT NULL ,
	nPass int NOT NULL,
    quantitaMerci  int NOT NULL,
	primary key(tipoAereo)
);


CREATE TABLE IF NOT EXISTS volo(
	idVolo int NOT NULL ,
	giornoSett varchar(10) NOT NULL,
    cittaPart varchar(20) NOT NULL,
    cittaArr varchar(20) NOT NULL,
    tipoAereo varchar(4) NOT NULL,
    oraPartenza int(2) NOT NULL,
    oraArrivo int(2) NOT NULL,
	primary key(idVolo, giornoSett),
    constraint fk_aereoportoP foreign key(cittaPart) references aereoporto(citta),
	constraint fk_aereoportoA foreign key(cittaArr) references aereoporto(citta),
    constraint fk_aereo foreign key(tipoAereo) references aereo(tipoAereo)
);
