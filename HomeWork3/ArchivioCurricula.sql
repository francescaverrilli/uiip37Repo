 INSERT INTO telefono (numero, candidato)
 VALUES ("3279900432",5), 
		("3286145038",10),
		("3339082654",29),
        ("3297744653",20);
        
         INSERT INTO candidato (codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza, datanascita, luogonascita)
 values (10, "Annicchiarico", "Chiara", "via Pascoli", "83030", "Zungoli", '1904-12-4', "Avellino"), 
		(20, "Buonopane","Giovanni", "via Dante", "83098", "Villanova", '2017-03-09', "Napoli" ),
		(5, "Bellariva", "Francesco", "via Vaticano", "60785", "Ariano", '1980-11-17', "Torino"),
        (8, "Rossi","Pietro", "via Calvario ", "89023", "Mirabella",'2008-06-12', "Milano"),
        (29, "Bianchi","Biancamaria", "via San Cesare", "49563","Flumeri", '2006-08-29', "Bologna");
        
        
         INSERT INTO attivita (codice, mansione)
 VALUES (1234,"insegnante"), 
		(5678, "operaio"),
		(1974, "imbianchino"),
        (3908, "benzinaio"),
        (9543, "commessa");
        
        
        
         INSERT INTO esperienza (codice, candidato, attivita, datainizio, datafine, azienda)
 VALUES (123, 20, 9543, '1806-07-12', '1988-03-28', "soprasteria"), 
		(765, 10, 1974, '1999-09-11', '2012-05-18', "maserati"),
		(912, 8, 3908, '2000-06-14', '2008-10-23', "fiat"),
        (834, 5, 1234, '1998-10-18', '1999-01-21', "ford"),
        (109, 29, 5678, '2003-02-04', '2010-09-01', "BMV");
        
        
        INSERT INTO istruzione (codice, candidato, titolo, voto, data, istituto)
 VALUES (77, 10, 003, "100/110", '2018-07-16', "Università degli studi di Napoli"), 
		(88, 20, 005, "110/110", '2011-09-12', "Università degli studi di Roma"),
		(99, 29, 001, "109/110", '2016-11-18', "Università degli studi di Palermo"),
        (55, 5, 004, "104/110", '2009-04-16', " Università degli studi di Salerno"),
        (33, 8, 002, "108/110", '2006-05-09', "Università Federico II"),
        (37, 8, 004, "105/110", '2015-12-25',"Università degli studi del Sannio"),
        (32, 10, 004, "105/110", '2015-12-25',"Università degli studi del Sannio");
        
        
        
        INSERT INTO titolostudio (codice, descrizione)
 VALUES (001, "medicina"), 
		(002, "ingegneria informatica"),
		(003, "giurisprudenza"),
        (004, "lettere classiche"),
        (005, "scienze biologiche");
         
         
#1 visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono
	select candidato.cognome, candidato.nome, telefono.numero from candidato 
    inner join telefono on candidato.codice=telefono.candidato;

#2 visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono, includendo nell’elenco anche i candidati di cui non si conosce il numero di telefono 
	select candidato.cognome, candidato.nome, telefono.numero from candidato 
    left join telefono on candidato.codice=telefono.candidato;

#3 visualizzare nome e cognome dei candidati che hanno almeno due titoli di studio
	select  candidato.nome, candidato.cognome from candidato 
	inner join istruzione on candidato.codice=istruzione.candidato 
	inner join titoloStudio on istruzione.titolo=titoloStudio.codice
	group by candidato.codice having count(*) >=2;