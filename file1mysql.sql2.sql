select * from smartphone; # mi restituisce tutti gli smartphone che sono presenti sul database

select name, ram, size, cpu from smartphone; #mi restituisce il nome, la ram, la cpu e la grandezza di uno smartphone

select name from smartphone
		where displayResolution= "1080x1920"; # qui estraiamo gli smartphone avente risoluzione del display come riportato;
        
select name from smartphone
		where displayResolution= "1080x1920" && ram="3Gb";
 
select name from smartphone
		where name like '%Galaxy%';
        
select name from smartphone
		where name like '%Galaxy%' && cpu like '%dual-core%';

select * from smartphone
		where weight>=150;

select * from smartphone
where weight < 150;

select * from smartphone
	order by displayPpi;

select * from smartphone
	order by displayPpi desc;
    
select name, brand from smartphone; #questo metodo mi restituisce la lista dei cellulari + l'indice, preso della lista dei brand, dei rispettivi brand;

select * from smartphone 
	order by opSys asc, name asc;
    
select s.name, op.description from smartphone As s, opSys As op    # questa è una join che mi permette di trovare i cellulari aventi opSys Android scorrendomi la lista degli smartphone e poi ordianrli in base al pso
	where s.opSys = op.id && op.description= "Android" 
    order by s.weight desc;

select s.name, br.name, c.name from smartphone As s, brand As br, country As c
	where s.brand= br.id && br.country= c.code
    order by c.name desc,  br.name desc, s.name desc;
    
select Count(s.ram)  from smartphone As s
    group by ram having s.ram like '%3Gb%';
    
#metodi per contare gli smartphone in base al sys op
select o.description, Count(s.id) As numero_telefoni from smartphone As s, opSys As o
	 where s.opSys=o.id
	 group by  o.description;
     
#metodo per contare i cellulari per nazione in ogni database #qui ho utilizzato un join implicito
select  c.name, Count(s.id) As cellulari_per_nazione from smartphone As s, brand As br, country As c
	where s.brand= br.id && br.country= c.code
    group by c.name;
    
#rifaccio lo stesso metodo con un join esplicito
select c.name, Count(s.id) As cellulari_per_nazione from smartphone As s
	INNER jOIN brand AS b On b.id= s.brand
	INNER JOIN  country AS c ON b.country= c.code
    group by c.name;