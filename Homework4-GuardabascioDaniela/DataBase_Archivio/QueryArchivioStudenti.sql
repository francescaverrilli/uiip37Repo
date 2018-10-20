#Query Archivio studenti

#	visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono
# 3 candidati
Select cognome , nome , telefono.numero from candidato
inner join telefono on telefono.candidato=candidato.codice;

#visualizzare, per ogni candidato, il cognome, il nome, ed il numero di telefono,
# includendo nell’elenco anche i candidati di cui non si conosce il numero di telefono 
#
Select cognome , nome , telefono.numero from candidato
left join telefono on telefono.candidato=candidato.codice;


#	visualizzare nome e cognome dei candidati che hanno almeno 
#due titoli di studio
#
select count(istruzione.candidato) AS conteggio ,candidato.nome, candidato.cognome 
from istruzione, candidato where 
candidato.codice=istruzione.candidato group by candidato.nome having conteggio>=2;

