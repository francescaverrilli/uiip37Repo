# 1. Visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono
SELECT cognome, nome, numero FROM candidato 
		INNER JOIN telefono ON candidato = codice;
        
# 2. Visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono, includendo 
#    nell’elenco anche i candidati di cui non si conosce il numero di telefono. 
SELECT cognome, nome, numero FROM candidato 
		LEFT JOIN telefono ON candidato = codice;
        
# 3. Visualizzare nome e cognome dei candidati che hanno almeno due titoli di studio
SELECT c.nome, c.cognome FROM candidato AS c
	INNER JOIN istruzione AS i ON i.candidato = c.codice
    INNER JOIN titolostudio AS t ON t.codice = i.titolo
    GROUP BY (c.codice)
    HAVING COUNT(*) >= 2;