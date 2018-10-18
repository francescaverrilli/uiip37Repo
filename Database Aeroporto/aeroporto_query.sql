# 1. Le città con un aeroporto di cui non è noto il numero di piste; 
SELECT citta FROM aeroporto
	WHERE npiste IS NULL;
    
# 2. Le nazioni da cui parte e arriva il volo con codice AZ274;
SELECT distinct a1.nazione AS cittaPartenza, a2.nazione AS cittaArrivo FROM volo  AS v
	INNER JOIN aeroporto AS a1 ON v.cittaPart = a1.citta
    INNER JOIN aeroporto AS a2 ON v.cittaArr = a2.citta
    WHere v.idVolo = "2";

# 3. I tipi di aereo usati nei voli che partono da Roma; 
SELECT distinct ae.tipoAereo FROM volo as v
	INNER JOIN aereo as ae ON v.tipoAereo = ae.tipoAereo
    WHere v.cittaPart = "Roma";

# 4. I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma. 
SELECT distinct ae.tipoAereo, ae.nPass FROM aereo AS ae
	INNER JOIN volo as v ON v.tipoAereo = ae.tipoAereo
    where v.cittaPart = "ROMA";
    

# 5. Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente; 
SELECT DISTINCT v.cittaPart FROM volo as v
	WHERE v.cittaArr = "Amsterdam"
    ORDER BY v.cittaPart ASC;

# 6. Il numero di voli che partono il venerdì da Napoli;  
SELECT count(v.idVolo) FROM volo as v
	WHERE v.giornoSett = "Venerdì" AND v.cittaPart = "Napoli";
    
    
# 7. Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda; 
SELECT a1.citta AS citta FROM volo AS v
	INNER JOIN aeroporto AS a1 ON v.cittaPart = a1.citta
	INNER JOIN aeroporto AS a2 ON v.cittaArr = a2.citta
    Where a1.nazione = "Italia" AND a2.nazione = "Olanda"
    HAVING count(*) >= 2;
    
# 8. Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT DISTINCT v.cittaPart FROM aereo as a
	INNER JOIN volo as v ON v.tipoAereo = a.tipoAereo
    WHERE a.npass = (SELECT MAX(nPass) FROM aereo);
    

# 9. Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
SELECT DISTINCT v.cittaArr FROM aereo as a
	INNER JOIN volo as v ON v.tipoAereo = a.tipoAereo
    WHERE a.npass = (SELECT MAX(nPass) FROM aereo);


# 10. Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;
SELECT DISTINCT v.cittaArr AS Citta FROM aereo as a
	INNER JOIN volo as v ON v.tipoAereo = a.tipoAereo
    WHERE a.npass = (SELECT MAX(nPass) FROM aereo)
UNION
SELECT DISTINCT v.cittaPart FROM aereo as a
	INNER JOIN volo as v ON v.tipoAereo = a.tipoAereo
    WHERE a.npass = (SELECT MAX(nPass) FROM aereo);