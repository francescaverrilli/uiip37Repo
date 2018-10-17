INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('AERHRN60C70L783T','Angela','Hewitt','1955-03-30','F');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('CERCRN60C70L783T','Cecilia','Chaily','1971-12-15','F');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('BERBRN60C70L783T','Billie','Holiday','1915-04-07','F');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('CERBRN60C70L783T','Chet','Baker','1929-12-23','M');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('CMRFRN50C70L783Y','Pat','Metheny','1954-08-12','M');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('LMRFRN60C70L783Y','Keith','Richards','1943-12-18','M');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('PMRFRN60C70L783X','Mike','Oldfield','1949-11-20','M');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('QMRFRN60C70L783T','Janis','Joplin','1943-01-19','F');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('JERFRN60C70L783T','John','Coltrane','1926-08-20','M');
INSERT INTO MUSICISTA (CodiceFiscale,Nome,Cognome,datanascita,Sesso) VALUES ('MERFRN60C70L783T','Miles','Davis','1926-05-26','M');

-- Si noti che il formato date prevede che le date siano inserite nella forma yyyy-mm-dd, cioe' anno-mese-giorno.

INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Chitarra','A Corde');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Pianoforte','A Corde');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Arpa','A Corde');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Sax Tenore','Ottoni');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Tromba','Ottoni');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Batteria','Ritmica');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Basso','A Corde');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Percussioni','Ritmica');
INSERT INTO STRUMENTO (Nome,Categoria) VALUES ('Violino','A Corde');

INSERT INTO ABILITA (Musicista,Strumento) VALUES ('AERHRN60C70L783T','Pianoforte');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('CERCRN60C70L783T','Arpa');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('CERBRN60C70L783T','Tromba');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('CMRFRN50C70L783Y','Chitarra');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('LMRFRN60C70L783Y','Chitarra');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('PMRFRN60C70L783X','Pianoforte');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('PMRFRN60C70L783X','Chitarra');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('PMRFRN60C70L783X','Batteria');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('BERBRN60C70L783T','Basso');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('PMRFRN60C70L783X','Percussioni');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('PMRFRN60C70L783X','Tromba');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('QMRFRN60C70L783T','Chitarra');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('JERFRN60C70L783T','Sax Tenore');
INSERT INTO ABILITA (Musicista,Strumento) VALUES ('MERFRN60C70L783T','Tromba');