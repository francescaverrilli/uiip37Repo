#Polamento DB Archivio

INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita)
	values (1,  'Guardabascio', 'Daniela', 'Via Monticchio' , '83031', 'Ariano Irpino', '1985-09-19', 'Avellino'),
		   (2,  'Santoro', 'Francesca'   , 'Via Pasteni'    , '83023', 'Grottaminarda', '1989-06-10', 'Avellino'),
		   (3,  'Grasso', 'Giovanni'     , 'Via Manna'      , '83013', 'Melito Irpino', '1990-08-13', 'Avellino'),
		   (4,  'Minicozzi', 'Michele'   , 'Via Camporeale' , '83043', 'Flumeri'      , '1991-09-24', 'Avellino'),
		   (5,  'Schiavo', 'Saverio'     , 'Via Serra'      , '83053', 'Benevento'    , '1979-10-14', 'Avellino');

INSERT INTO telefono (numero, candidato)
    VALUES  ('3279900432',1), 
			('3333938356',2),
			('3287083791',3);
        
INSERT INTO attivita (codice, mansione) VALUES
			(10,'insegnante'),
            (12,'Ingenere'),
            (14,'consulente ir'),
            (16,'avvocato');
            
INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda)
    VALUES (1, 1, 10, '2018-07-12', '2018-10-21', 'soprasteria'),
		   (2, 2, 14, '2016-07-12', '2018-05-10', 'accenture'),
		   (3, 4, 12, '2015-07-12', '2017-08-10', 'poste italiane');
           

INSERT INTO titolostudio (codice, descrizione)
     VALUES (1, 'ingeneria informatica'),
			(2, 'magistrale ingegenria informatica'),
            (3, 'giurisprudenza'),
            (4, 'chimica');
            
            
INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto)
	VALUES (1, 2, 1, '110/110', '2012-07-16', 'Unisannio'),
			(2, 2, 2, '108/110', '2016-10-12', 'Unisannio'),
			(3, 3, 3, '92/110', '2016-09-10', 'Bicocca'),
			(4, 4, 4, '105/110', '2014-12-05', 'Bocconi');