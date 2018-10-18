INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita)
VALUES  (8, "Di Pietro", "Angela", "via Iscalonga", "83036", "MirabellaEclano", '1992-06-11', "Benevento"), 
		(9, "Barbato","Silvio", "contada Pino", "82100", "Benevento", '1991-06-09', "Benevento" ),
		(10, "Annicchiarico", "Chiara", "via Pascoli", "83030", "Zungoli", '1990-12-4', "Avellino"),
        (23, "Avallone","Emanuele", "via Prezzolini", "84013", "Salerno", '1992-05-18', "Salerno"),
        (29, "Caserta","Vincenzo", "via Cesinola", "83018", "San Martino Valle Caudina",'1992-11-27', "Benevento");

 INSERT INTO telefono (numero, candidato)
 VALUES ("3394957273",8), 
		("3475789123",10),
		("3289485858",29),
        ("3472898389",23);
        
INSERT INTO attivita (codice, mansione)
VALUES (2537,"ingegnere"), 
		(1356, "docente"),
		(2355,"avvocato"),
        (8464, "biologo"),
        (1536, "infermiere");
        
INSERT INTO titolostudio (codice, descrizione)
 VALUES (001, "ingegnere civile"), 
		(002, "giurisprudenza"),
		(003, "scienze della formazione"),
        (004, "diploma da Geometra"),
        (005, "scienze infermieristiche"),
        (006, "biologia");   
        
INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda)
VALUES  (345, 29, 2355,'2018-11-11','2018-12-31', "Tribunale Ariano Irpino"), 
		(453, 23, 8464,'2018-10-15','2020-4-26',  "Biogem"),
		(876, 10, 1356,'2018-10-12','2019-6-16', "Pubblica Istruzione"),
        (432, 8, 2537,'2018-10-12','2019-4-12', "Soprasteria"),
        (856, 9, 1536,'2018-4-13','2021-6-19', "Ospedale Rummo");
        
        
INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto)
VALUES (43, 8, 001, "110/110", '2018-06-07', "Università degli Studi del Sannio"), 
       (56, 23, 005, "85/110",'2018-05-08', "Cattolica"),
	   (99, 29, 002, "109/110",'2018-04-15',"Unisa"),
	   (106, 9, 006, "99/110",'2018-5-29', "FedericoII"),
	   (77, 8, 004, "80/100",'2018-06-07', "Ruggero II CAT"),
	   (18, 10, 003, "100/110",'2018-03-12', "UniMol");
        
