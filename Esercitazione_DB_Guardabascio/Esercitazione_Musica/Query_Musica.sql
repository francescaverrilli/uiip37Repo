#INTERROGAZIONI DB

#1.	Restituire il nome degli strumenti suonati 
#esclusivamente da musicisti di sesso maschile;
# 4 righe
SELECT distinct strumento.nome from strumento 
inner join abilita on strumento.nome=abilita.strumento inner join musicista on abilita.musicista= musicista.codiceFiscale and musicista.sesso='M'
and strumento.nome not in ( select strumento.nome from strumento 
inner join abilita on strumento.nome=abilita.strumento
inner join musicista on abilita.musicista= musicista.codiceFiscale and musicista.sesso='F');

#2.	Per ogni musicista che suoni strumenti della categoria ‘Ottoni’ restituire il nome,
#il cognome, la data di nascita e gli strumenti della categoria 'Ottoni' da lui suonati 
# 4 righe
select musicista.nome , musicista.cognome , musicista.dataNascita from musicista
inner join abilita on abilita.musicista=musicista.codiceFiscale
inner join strumento on strumento.nome=abilita.strumento and strumento.categoria="Ottoni";

#3.	Restituire nome, cognome e data di nascita dei musicisti
#che suonano almeno 5 strumenti;
# 1 riga 
select count(abilita.musicista) AS conteggio , musicista.nome , 
musicista.cognome , musicista.dataNascita from musicista, abilita where 
musicista.codiceFiscale=abilita.musicista group by musicista.nome having conteggio>=5;


#4.	Restituire il nome degli strumenti suonati da esattamente due musicisti;
#5.	Restituire il nome ed il cognome del musicista più vecchio (o dei musicisti più vecchi, se ci sono musicisti nati nello stesso giorno) 
#6.	Restituire il nome ed il cognome del musicista più giovane (o dei musicisti più giovani, se ci sono musicisti nati nello stesso giorno)  fra quelli che suonano almeno uno strumento, e gli strumenti da lui (da loro) suonati.
#7.	Restituire il numero di strumenti suonati da ciascun musicista.
