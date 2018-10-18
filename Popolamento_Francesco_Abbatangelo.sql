/* Popolamento */
INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita)
 VALUES  (1, "Abbatangelo","Francesco", "CDA Difesa Grande 52/B", "83031", "Ariano Irpino", '1991-05-10', "Ariano Irpino" ),
		(2, "Avallone", "Emanuele", "via Roma", "83400", "Salerno", '1992-05-18', "Salerno"),
        (3, "Annicchiarico", "Chiara", "via Pascoli", "83030", "Zungoli", '1904-12-04', "Avellino"), 
        (4, "Di Pietro","Angelo", "via Tevere 12", "75660", "Mirabella", '1992-06-11', "Avellino"),
        (5, "Guastaferro","Andrea", "via Veneto 34", "84000", "Taurasi", '1991-09-24', "Avellino");
        
        
INSERT INTO telefono (numero, candidato)
 VALUES ("3343079015",1), 
	    ("3356789123",2),
        ("3356123447",4),
        ("3459088712",5);
        
        
INSERT INTO attivita (codice, mansione)
 VALUES (1,"insegnante"), 
		(2, "pastore"),
		(3,"ingegnere"),
        (4, "lattaio"),
        (5, "agricoltore");
        
            
INSERT INTO titolostudio (codice, descrizione)
 VALUES (1, "Ingegneria Informatica"), 
		(2, "Ingegneria Elettronica"),
		(3, "Ingegneria Energetica"),
        (4, "Ingegneria Biomedica"),
        (5, "Ingegneria Civile");
         
         
INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto)
 VALUES (1, 1, 1, "100/110", '2018-07-16', "Unisa"), 
		(2, 2, 4, "90/110", '2018-05-29', "Unisa"),
		(3, 3, 3, "110/110",'2017-09-29', "Unisannio"),
        (4, 4, 2, "79/110",  '2016-08-28', "Unisalento"),
        (5, 5, 5, "99/110", '2015-03-07', "Unina"),
		(6, 1, 2, "103/110",'2016-09-23', "Uniba");
        
        
INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda)
 VALUES (1, 1, 3,'2015-07-12', '2018-03-28',"soprasteria"), 
		(2, 2, 1,'2010-09-14' ,'2012-05-06',"azienda agricola abbatangelo"),
		(3, 3, 2,'2012-12-28' , '2013-08-23',"hp"),
        (4, 4, 5,'2008-03-15', '2009-07-18',"acer"),
        (5, 5, 4,'2016-01-01', '2018-10-18',"accenture");
        
 
        
        
        
    