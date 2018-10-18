#1. Le città con un aeroporto di cui non è noto il numero di piste; 
# 1
select citta from aeroporto where npiste is null;

#2. Le nazioni da cui parte e arriva il volo con codice 1;
# 2 nazioni
select distinct aeroporto.nazione from aeroporto 
inner join volo on volo.cittaArr= aeroporto.citta and volo.idVolo='1'
union 
select distinct aeroporto.nazione from aeroporto 
inner join volo on volo.cittaPart= aeroporto.citta and volo.idVolo='1'
;

#3. I tipi di aereo usati nei voli che partono da Roma; 
#2 righe
select aereo.tipoAereo from aereo
inner join volo on volo.tipoAereo=aereo.tipoAereo
inner join aeroporto on volo.cittaPart=aeroporto.citta and aeroporto.citta="Roma";

#4. I tipi di aereo e il corrispondente numero di passeggeri per i voli che partono da Roma. 
#2 righe
select aereo.tipoAereo , aereo.nPass from  aereo
inner join volo on volo.tipoAereo=aereo.tipoAereo
inner join aeroporto on volo.cittaPart=aeroporto.citta and aeroporto.citta="Roma";

#5. Le città da cui partono voli diretti ad Amsterdam, ordinate alfabeticamente; 
# 2
select distinct citta from aeroporto
inner join volo on aeroporto.citta=volo.cittaPart and volo.cittaArr="Amsterdam" order by citta;

#6. Il numero di voli che partono il venerdì da Napoli;  
# 1 volo
select count(*) as cont from volo where volo.giornoSett="venerdi";

#7. Le città italiane da cui partono almeno 2 voli alla settimana diretti in Olanda; 
#Roma
select count(volo.cittaPart) as cont ,volo.cittaPart , volo.cittaArr from  volo
inner join aeroporto as a1 on a1.nazione="Italia" and volo.cittaPart=a1.citta
inner join aeroporto as a2 on a2.nazione="Olanda" and volo.cittaArr=a2.citta having cont>=2;

#8. Le città da cui parte l'aereo caratterizzato dal massimo numero di passeggeri;
# 678 passeggeri da NewYork
select aereo.nPass , volo.cittaPart from aereo
inner join volo on volo.tipoAereo=aereo.tipoAereo
where nPass=(select max(nPass) as massimo  from aereo)
;

#9. Le città su cui è diretto l'aereo caratterizzato dal massimo numero di passeggeri;
# 678 passeggeri Ad Amsterdam
select distinct aereo.nPass , volo.cittaArr from aereo
inner join volo on volo.tipoAereo=aereo.tipoAereo
where nPass=(select max(nPass) as massimo  from aereo)
;

#10. Le città che sono servite dall'aereo caratterizzato dal massimo numero di passeggeri;
# 678 passeggeri Ad Amsterdam/ newyork
select aereo.nPass , volo.cittaPart from aereo
inner join volo on volo.tipoAereo=aereo.tipoAereo
where nPass=(select max(nPass) as massimo  from aereo)
union
select aereo.nPass , volo.cittaArr from aereo
inner join volo on volo.tipoAereo=aereo.tipoAereo
where nPass=(select max(nPass) as massimo  from aereo)
;