		INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita)
 values (1, "Mario", "Rossi", "via Irlanda", "80456", "Ravenna", '1987-12-12', "Ravenna"), 
		(3, "Roberto","Bianchi", "via Olanda", "80567", "Pisa", '1988-04-09', "Pisa" ),
		(5, "Giovanni", "Verdi", "via Roma", "81356", "Otranto", '1990-03-28', "Otranto"),
        (7, "Ciro","Biondi", "via Giovanni Paolo", "81745", "Catania", '1989-05-09',"Catania"),
        (9, " Diego","Blu", "via Francia", "81456", "Napoli", '1991-11-24', "Napoli");
        
        
		INSERT INTO titolostudio (codice, descrizione)
 VALUES (21, "medicina"), 
		(27, "medicina"),
		(25, "ingegneria"),
        (23, "giurisprudenza"),
        (29, "economia");
        
		INSERT INTO attivita (codice, mansione)
VALUES (1111,"insegnante"), 
		(2222, "ingegnere"),
		(3333,"avvocato"),
        (4444, "medico"),
        (5555, "commercialista");
        

		INSERT INTO telefono (numero, candidato)
 VALUES ("3279900432",1), 
		("3298756473",3),
        ("3314598735",7),
        ("3287657498",9);
        
		INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda)
 VALUES (111, 1, 1111, '2012-04-04', '2015-05-05', "soprasteria"), 
		(115, 3, 3333,'2016-08-08', '2018-09-09',  "accenture"),
		(117, 5, 5555,'2017-01-01', '2018-10-10', "deloitte"),
        (119, 7, 2222, '2016-09-21', '2018-03-03', "kpmg"),
        (113, 9, 4444, '2017-11-23', '2018-09-10', "pwc");
        
        
        INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto)
 VALUES (77, 1, 21, "100/110", '2018-07-16', "Luigi Vanvitelli"), 
		(88, 3, 23, "105/110", '2017-09-05', "Luigi Vanvitelli"),
		(99, 5, 25, "99/110", '2018-08-02',"Federico II"),
        (55, 5, 27, "110/110", '2018-01-29', "Luigi Vanvitelli"),
        (75, 7, 21, "102/110", '2018-04-30', " Normale"),
        (33, 9, 29, "97/110", '2011-09-10', " Normale");
        
        
        
        
