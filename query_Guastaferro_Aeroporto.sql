Select citta from aeroporto
	where npiste Is null;
    
Use aeroporto;
 
 #otteno la nazione da cui partono e arrivano i voli aventi id=1
Select  a1.nazione As cittaArr, a2.nazione As cittaPart from volo as v
	Inner join aeroporto As a1 On v.cittaPart= a1.citta
    Inner Join aeroporto As a2 On v.cittaArr= a2.citta
    where v.idVolo= "1";
	 
#ottengo i tipi di aerei usati nei voli che partono da roma
Select Distinct a.tipoAereo from volo As v
	Inner join aereo As a on v.tipoAereo= a.tipoAereo
    where v.cittaPart like '%roma%';

# ottengo tipi di aereo e numero passeggeri per i voli che partono da roma
Select a.tipoAereo As TipoAereo, a.nPass As NumPassggeri from volo As v
	Inner Join aereo As a On v.tipoAereo= a.tipoAereo
    where v.cittaPart like '%roma%';
    
#ottengo le città da cui partono voli per Amsterdam ordinate alfabeticamente
Select distinct v.cittaPart AS CittaDiPartenza from volo As v
	where v.cittaArr like '%Amsterdam%'
    order by cittaArr desc;

Use aeroporto;
#ottengo il numero di voli che partono il venerdì da napoli
Select Count(v.idVolo) from volo As v
	where v.cittaPart like '%Napoli%' && v.giornoSett like '%venerdì%';

#città italiane da cui partono almeno due voli a settimana per l'Olanda
Select a1.citta As citta from volo As v
	Inner Join aeroporto AS a1 on v.cittaPart = a1.citta
    Inner Join aeroporto As a2 on v.cittaArr = a2.citta
    where a1.nazione like '%Italia%' and a2.nazione like  '%Olanda%'
    group by a1.citta having Count(*)  >= 2;


#città da cui parte l'aereo caratterizzato dal maggior numero di passeggeri
select Distinct v.cittaPart As cittaDiPartenza from volo AS v 
	inner Join aereo as a On v.tipoAereo = a.tipoAereo 
	where a.nPass = (Select Max(nPass) from aereo);
    
#città di arrivo dell'aereo caratterizzato dal massimo numero di passeggeri
Select Distinct v.cittaArr As cittaDiArrivo from volo As v
	Inner join aereo As a On v.tipoAereo= a. tipoAereo
    where a.nPass= (Select Max(nPass) from aereo);

#città servite dall'aereo caratterizzato dal massimo numero di passeggeri
Select Distinct v.cittaArr As cittaDiArrivo, v.cittaPart As cittaDiPartenza from volo As v
	Inner Join aereo  As a On v.tipoAereo= a. tipoAereo
    where a.nPass= (Select Max(nPass) from aereo);


