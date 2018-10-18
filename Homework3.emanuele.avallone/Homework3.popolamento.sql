INSERT INTO candidato (codice, cognome, nome,viaresidenza,capresidenza,cittaresidenza,datanascita,luogonascita)
VALUES		(0001,"Avallone","Emanuele","via del tintoretto 28",41100,"Modena",'1992-05-18',"Cava de'Tirreni"),
			(0002,"Annichiarico","Chiara","via San Cesario",83030,"Avellino",'1990-04-16',"Zungoli"),
            (0003,"Abbatangelo","Francesco","via isca longa",83036,"Mirabella",'1992-06-11',"Mirabella"),
            (0004,"Barabato","Silvio","via contrada pino 13",82100,"Benevento",'1991-09-06',"Benevento"),
            (0005,"Di Pietro","Angela","via Palaldino 45",81055,"Caserta",'1985-08-08',"Caserta"),
            (0006,"Guastaferro","Andrea","via Prezzolini 15",82190,"Benevento",'1991-07-17',"Benevento"),
            (0007,"Santoro","Sergio","via  Chiaia 32",85100,"Bari",'1991-09-06',"Bari");
            
INSERT INTO telefono (numero, candidato)
VALUES 	("3458643567",0001),
		("3468678567",0002),
        ("3488622567",0004),
        ("3498611567",0005),
        ("3338456567",0006),
        ("3288643789",0007);
            
INSERT INTO attivita(codice,mansione)
VALUES 		(1357,"Cameriere"),
			(5790,"PR"),
            (2468,"Commesso"),
            (8642,"Cameriere"),
            (1325,"Animatore"),
            (8964,"Allenatore"),
            (9548,"Commesso");
            
            
INSERT INTO titolostudio(codice,descrizione)
VALUES		(1000,"Laurea Triennale-ingegneria"),
			(2000,"Laurea Triennale-filosofia"),
            (3000,"Laurea Magistrale-storia"),
            (4000,"Laurea Triennale-informatica"),
            (5000,"Laurea Magistralee-ingegneria"),
            (6000,"Laurea Triennale-economia"),
            (7000,"Laurea Magistrale-economia");
            
INSERT INTO istruzione(codice,candidato,titolo,voto,data,istituto)
VALUES			(8000,0001,1000,100,'2018-05-12',"Federico II"),
			(9000,0002,2000,100,'2017-06-14',"Univerista del Sannio"),
            (0100,0003,3000,100,'2018-10-12',"Federico II"),
            (0200,0004,4000,100,'2017-03-11',"Univerista del Sannio"),
            (0300,0005,5000,100,'2018-09-17',"Unisa"),
            (0400,0007,6000,100,'2016-12-12',"Federico II"),
            (0500,0007,7000,100,'2015-05-03',"Unisa");
            
INSERT INTO esperienza (codice,candidato,attivita,datainizio,datafine,azienda)
VALUES				(234,0001,1357,'2016-06-14','2017-06-14', "La Toretta"),
                    (456,0002,5790,'2016-07-15','2017-07-15', "Grottix"),
                    (789,0003,2468,'2015-07-11','2017-06-09', "Apple"),
                    (012,0004,8642,'2014-02-14','2018-06-14', "Aquila d'oro"),
                    (345,0005,1325,'2015-07-21','2017-04-22', "Palinem"),
                    (678,0006,8964,'2017-08-13','2016-02-12', "Sony");