SELECT * FROM smartphone; # Tutti gli smartphone presenti nel DB (19)


# Tutti gli smartphone, mostrando solo quelle caratteristiche (proiezione)
SELECT name, ram, size, cpu FROM smartphone;


# Mostra il nome degli smartphone che hanno quella risoluzione (7)
SELECT name FROM smartphone
	WHERE displayResolution = "1080x1920";
    

# Mostra il nome degli smartphone che hanno quella risoluzione  e quella Ram (1)
SELECT name FROM smartphone
	WHERE displayResolution = "1080x1920" && ram = "3Gb";

# Mostra tutti gli smartphone nel cui nome è presente la parola Galaxy (6)
SELECT * FROM smartphone
	WHERE name LIKE '%Galaxy%';
    
    
# Mostra tutti gli smartphone nel cui nome è presente la parola Galaxy e hanno il dual-core (3)
SELECT * FROM smartphone
	WHERE name LIKE '%Galaxy%' && cpu LIKE '%dual-core%';

# Mostra tutti gli smartphone che hanno un peso maggiore o uguale a 150 g (6)
SELECT * FROM smartphone
	WHERE weight >= 150;

# Mostra tutti gli smartphone che hanno un peso minore a 150 g (13)
SELECT * FROM smartphone
	WHERE weight < 150;

# Ordina tutti gli smartphone per displayPpi in modo ascendente
SELECT * FROM smartphone
	ORDER BY displayPpi ASC;
    

# Ordina tutti gli smartphone per displayPpi in modo discendente
SELECT * FROM smartphone
	ORDER BY displayPpi DESC;

# Mostra tutti gli smartphone con il nome del relativo Brand
SELECT s.name, b.name FROM smartphone AS s, brand AS b
	where s.brand = b.id;


# Ordina tutti gli smartphone per displayPpi in modo ascendente
SELECT s.name, sy.description FROM smartphone AS s, opsys AS sy
	WHERE s.opsys = sy.id
	ORDER BY opsys ASC, name ASC;


# Mostra tutti gli smartphone android e il relativo sistema operativo ordinati per peso discendente
SELECT s.name, sy.description FROM smartphone AS s, opsys AS sy
	WHERE s.opsys = sy.id && sy.description = "Android"
	ORDER BY weight DESC;

# Mostra tutti gli smartphone con il relativo brand e nazionalità
SELECT s.name, b.name , c.name FROM smartphone AS s, country AS c, brand AS b
	WHERE s.brand = b.id && b.country = c.code
	ORDER BY c.name ASC, b.name ASC, s.name ASC;

# Conta gli smartphone che hanno 3Gb di ram (2)
SELECT count(id) AS Telefoni3gb FROM smartphone
	WHERE ram = "3Gb";

# Conta gli smartphone in base al sistema operativo
SELECT count(s.id) AS numeroTelefoni , o.description FROM smartphone AS s, opsys AS o
	WHERE s.opSys = o.id
    GROUP BY opsys;


# Conta gli smartphone in base al country
SELECT count(s.id) AS numeroTelefoni , c.name AS Nazione 
	FROM smartphone AS s, brand AS b, country as c
		WHERE s.brand = b.id AND b.country = c.code
		GROUP BY c.name;


# Conta gli smartphone in base al country (con INNER JOIN)
SELECT count(s.id) AS numeroTelefoni , c.name 
FROM smartphone AS s
	INNER JOIN brand AS b ON b.id = s.brand
    INNER JOIN country AS c ON c.code = b.country  
    GROUP BY c.name;


