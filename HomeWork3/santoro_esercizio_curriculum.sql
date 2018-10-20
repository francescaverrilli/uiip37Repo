create database if not exists curriculum;

create table if not exists candidato(

	codice int(11) not null primary key,
	cognome varchar(50) not null,
    nome varchar(50) not null,
	viaresidenza varchar(100) not null,
	capresidenza varchar(5) not null,
    cittaresidenza varchar(30) not null,
	datenascita date not null,
	luogonascta varchar(30)

);

create table if not exists telefono(
	numero varchar(15) not null primary key,
	candidato int(11),
    
    CONSTRAINT fk_candidato2 FOREIGN KEY (candidato) REFERENCES candidato(codice)


);

create table if not exists attivita(
	codice int(11) not null primary key,
	mansione varchar(100) not null


);



create table if not exists esperienza(
	codice int(11) not null primary key,
	candidato int(11),
    attivita int(11),
    datainizio date,
    datafine date,
    azienda varchar(100),
    
    CONSTRAINT fk_attivita FOREIGN KEY (attivita) REFERENCES attivita(codice),
    CONSTRAINT fk_candidato3 FOREIGN KEY (candidato) REFERENCES candidato(codice)	

);


create table if not exists titolostudio(
	codice int(11) not null primary key,
	descrizione varchar(50) not null


);

create table if not exists istruzione(
	codice int(11) not null primary key,
	candidato int(11),
    titolo int(11),
    voto varchar(10),
    data date,
    istituto varchar(100),
    
    CONSTRAINT fk_titolo FOREIGN KEY (titolo) REFERENCES titolostudio(codice),
    CONSTRAINT fk_candidato FOREIGN KEY (candidato) REFERENCES candidato(codice)	

);


insert into candidato (

	codice,
    cognome,
    nome,
    viaresidenza,
    capresidenza,
    cittaresidenza,
    datenascita,
    luogonascita

)values(

	1,
    'santoro',
    'sergio',
    'via bari 28',
    '72013',
    'ceglie messapica',

    '1991-12-21',
    'ceglie messapica'


);


insert into candidato (

	codice,
    cognome,
    nome,
    viaresidenza,
    capresidenza,
    cittaresidenza,
    datenascita,
    luogonascita

)values(

	2,
    'caliandro',
    'rocco',
    'via roma 2',
    '72021',
    'roma',
    '1992-03-03',
    'roma'


);


insert into candidato (

	codice,
    cognome,
    nome,
    viaresidenza,
    capresidenza,
    cittaresidenza,
    datenascita,
    luogonascita

)values(

	3,
    'marco',
    'zizzi',
    'via milano 3',
    '72234',
    'milano',
    '1993-04-03',
    'milano'


);

insert into candidato (

	codice,
    cognome,
    nome,
    viaresidenza,
    capresidenza,
    cittaresidenza,
    datenascita,
    luogonascita

)values(

	4,
    'avallone',
    'emanuele',
    'via napoli 5',
    '72222',
    'napoli',
    '1994-06-06',
    'napoli'


);

insert into candidato (

	codice,
    cognome,
    nome,
    viaresidenza,
    capresidenza,
    cittaresidenza,
    datenascita,
    luogonascita

)values(

	5,
    'rossi',
    'francesco',
    'via caserta 5',
    '77777',
    'brindisi',
    '1997-06-06',
    'brindisi'


);


insert into telefono (

	numero,
    candidato

)values(

	123456,
    1

);

insert into telefono (

	numero,
    candidato

)values(

	654321,
    2

);

insert into telefono (

	numero,
    candidato

)values(

	654456,
    3

);


insert into telefono (

	numero,
    candidato

)values(

	987789,
    4

);


insert into attivita (

	codice,
    mansione

)values(

	1,
    "ricercatore"

);

insert into attivita (

	codice,
    mansione

)values(

	2,
    "programmatore"

);

insert into attivita (

	codice,
    mansione

)values(

	3,
    "biologo"

);

insert into attivita (

	codice,
    mansione

)values(

	4,
    "medico"

);

insert into esperienza (

	codice,
    candidato,
    attivita,
    datainizio,
    datafine,
    azienda

)values(

	1,
    1,
    2,
    '2012-03-03',
	'2018-01-01',
    'apple'
);

insert into esperienza (

	codice,
    candidato,
    attivita,
    datainizio,
    datafine,
    azienda

)values(

	3,
    3,
    3,
    '2015-03-03',
	'2018-01-01',
    'clinicaz3'
);

insert into esperienza (

	codice,
    candidato,
    attivita,
    datainizio,
    datafine,
    azienda

)values(

	4,
    4,
    4,
    '2016-03-03',
	'2018-01-01',
    'clinica gemelli'
);



insert into titolostudio (

	codice,
    descrizione
)values(

	1,
    'laurea triennale informatica'


);

insert into titolostudio (

	codice,
    descrizione
)values(

	2,
    'laurea specialistica informatica'


);

insert into titolostudio (

	codice,
    descrizione
)values(

	3,
    'laurea triennale biologia'


);

insert into titolostudio (

	codice,
    descrizione
)values(

	4,
    'laurea medicina'


);


insert into istruzione (

	codice,
    candidato,
    titolo,
    voto,
    data,
    istituto
)values(

	1,
    1,
    1,
    103,
	'2000-03-03',
	'università di bari'
);


insert into istruzione (

	codice,
    candidato,
    titolo,
    voto,
    data,
    istituto
)values(

	2,
    2,
    2,
    100,
	'2001-03-03',
	'università di bari'
);


insert into istruzione (

	codice,
    candidato,
    titolo,
    voto,
    data,
    istituto
)values(

	5,
    2,
    4,
    110,
	'2011-03-03',
	'università di bari'
);


insert into istruzione (

	codice,
    candidato,
    titolo,
    voto,
    data,
    istituto
)values(

	4,
    4,
    4,
    110,
	'2005-03-03',
	'università di pavia'
);

insert into istruzione (

	codice,
    candidato,
    titolo,
    voto,
    data,
    istituto
)values(

	6,
    5,
    1,
    110,
	'2006-03-03',
	'università di pavia'
);

insert into istruzione (

	codice,
    candidato,
    titolo,
    voto,
    data,
    istituto
)values(

	7,
    5,
    2,
    110,
	'2008-03-03',
	'università di pavia'
);

insert into istruzione (

	codice,
    candidato,
    titolo,
    voto,
    data,
    istituto
)values(

	8,
    5,
    4,
    110,
	'2010-03-03',
	'università di pavia'
);

select candidato.nome,candidato.cognome,telefono.numero from candidato 
inner join telefono on candidato.codice=telefono.candidato;


select candidato.nome,candidato.cognome, telefono.numero from candidato left join 
telefono on candidato.codice=telefono.candidato;


select candidato.nome,candidato.cognome,count(*) as num 
from candidato,titolostudio,istruzione where istruzione.candidato=candidato.codice and
istruzione.titolo=titolostudio.codice group by istruzione.candidato having num>=2;





























	