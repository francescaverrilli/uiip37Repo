/*
1. Le città con un aeroporto di cui non è noto il numero di piste;
*/
select citta
from aeroporto
where npiste is null;

/*
2. Le nazioni da cui parte e arriva il volo con codice AZ274; 1
Bisogna dare la possibilità di sistinguere la nazione di un aeroporto e la nazione di un'altra
*/

select distinct a1.nazione as cittaPartenza, a2.nazione as cittaArrivo
from volo as v inner join aeroporto as a1 on v.cittaPart = a1.citta
inner join aeroporto as a2 on v.cittaArr=a2.citta
where v.idVolo = '1';

/*
3. I tipi di aereo usati nei voli che partono da Roma; 
*/
select distinct a.tipoAereo
from aereo as a inner join volo as v on a.tipoAereo = v.tipoAereo
where cittaPart = 'Roma';

/*
4. I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma. 
*/
select distinct a.tipoAereo, a.npass
from aereo as a inner join volo as v on a.tipoAereo = v.tipoAereo
where v.cittaPart = 'Roma';

/*
5. Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente;
Quando la città di arrivo è Amsterdam dammi la città di partenza
*/
select distinct v.cittaPart
from volo as v 
where v.cittaArr='Amsterdam'
order by v.cittaPart ASC;

/*
6. Il numero di voli che partono il venerdì da Napoli;  
*/
select count(idVolo) as ncountNapoliVenerdi
from volo
where giornoSett = "venerdì" and cittaPart = "Napoli";

/*
7. Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda;
*/
select a1.citta as cittaItaliane
from aeroporto as a1 inner join volo on a1.citta=volo.cittaPart
inner join aeroporto as a2 on a2.citta=volo.cittaArr
where a1.nazione = "Italia" and a2.nazione = "Olanda"
group by a1.citta
having count(*)>=2;
#having vuole sempre il group by poichè è una condizione sul raggruppamento



/*
8. Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
*/
select distinct a1.citta as cittaPartNumMaxPasseggeri
from aeroporto as a1 inner join volo as v on a1.citta=v.cittaPart
inner join aeroporto as a2 on a2.citta=v.cittaArr
inner join aereo on aereo.tipoAereo=v.tipoAereo
where aereo.nPass in
(select max(nPass) from aereo);

/*
9. Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
*/
select distinct a2.citta as cittaArrMaxNumPasseggeri
from aeroporto as a1 inner join volo as v on a1.citta=v.cittaPart
inner join aeroporto as a2 on a2.citta=v.cittaArr
inner join aereo on aereo.tipoAereo=v.tipoAereo
where aereo.nPass in
(select max(nPass) from aereo);

/*
10. Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;
*/
select distinct a1.citta as cittaPart, a2.citta as cittaArr
from aeroporto as a1 inner join volo as v on a1.citta=v.cittaPart
inner join aeroporto as a2 on a2.citta=v.cittaArr
inner join aereo on aereo.tipoAereo=v.tipoAereo
where aereo.nPass in
(select max(nPass) from aereo);