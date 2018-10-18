INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 1,'Caserta','Vincenzo', 'via cesinola', '83018', 'S. Martino V. C.', '1991-11-27', 'Benevento');
INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 2,'Guastaferro','Andrea', 'via rocco', '81018', 'Taurasi', '1991-10-16', 'Benevento');
INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 3,'Barbato','Silvio', 'via Morcone', '73018', 'Benevento', '1991-08-14', 'Benevento');
INSERT INTO candidato (codice,cognome,nome,viaresidenza,capresidenza,cittaresidenza, datanascita,luogodinascita) 
		VALUES ( 4,'De Gennaro','Carlo', 'via Teresa', '22038', 'Napoli', '1987-03-04', 'Napoli');


INSERT INTO telefono (numero,candidato) VALUES ('3208072990', 1);
INSERT INTO telefono (numero,candidato) VALUES ('3203452234', 2);
INSERT INTO telefono (numero,candidato) VALUES ('5467834232', 3);
INSERT INTO telefono (numero,candidato) VALUES ('5467834232', 3);

INSERT INTO attivita (codice,mansione) VALUES (23, 'Programmatore');
INSERT INTO attivita (codice,mansione) VALUES (11, 'HR');
INSERT INTO attivita (codice,mansione) VALUES (14, 'Ricercatore');

INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (1,1,23,'2017-08-20', '2018-05-10', 'Enel');
INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (2,1,11,'2017-08-20', null, 'Tim');
INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (4,2,23,'2015-01-05', '2017-03-09', 'CNR');
INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda) 
		VALUES (5,4,14,'2012-01-05', '2015-03-09', 'SUN');
	
INSERT INTO titolostudio (codice,descrizione) VALUES (1, 'Ing. Informatico');
INSERT INTO titolostudio (codice,descrizione) VALUES (2, 'Ing. Energetico');
INSERT INTO titolostudio (codice,descrizione) VALUES (3, 'Ing. Meccanico');
INSERT INTO titolostudio (codice,descrizione) VALUES (4, 'Informatico');

INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (1,1,1,'95/110', '2017-12-14', 'Università degli studi del Sannio');        
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (2,2,2,'100/110', '2017-12-14', 'Università degli studi del Sannio');
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (3,3,3,'105/110', '2015-09-26', 'Università degli studi di Salerno');
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (4,3,4,'110/110', '2018-05-14', 'Università degli studi di Napoli');
INSERT INTO istruzione (codice,candidato,titolo,voto,data,istituto) 
		VALUES (5,4,1,'101/110', '2012-12-14', 'Università degli studi di Caserta');