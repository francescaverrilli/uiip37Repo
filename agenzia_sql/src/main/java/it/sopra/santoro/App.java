package it.sopra.santoro;

import it.sopa.santoro.dao.impl.Default_Aereo_Dao;
import it.sopa.santoro.dao.impl.Default_Aereoporto_Dao;
import it.sopa.santoro.dao.impl.Default_Volo_Dao;
import it.sopra.santoro.model.Aereo;
import it.sopra.santoro.model.Aereoporto;
import it.sopra.santoro.model.Volo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//driver manager ci permette di connetterci al db
    	//mentre menager ci permette di interfacciaci query
    	
    	
    	//AEREO
    	Aereo a = new Aereo("cod1",100,23);
    	Default_Aereo_Dao aereo_dao=new Default_Aereo_Dao();
    	String tipo="cod1";
    	Aereo c = new Aereo("de34",234,345);
    	
    	//QUERY AEREO
    	aereo_dao.insert(a);
    	a=aereo_dao.selectByTipo(tipo);
    	System.out.println(a.getTipoAereo());
    	aereo_dao.update(tipo,c);
    	
    	
    	//AEREOPORTO
    	Aereoporto aereoporto = new Aereoporto("ceglie","italia",4);
    	Default_Aereoporto_Dao n=new Default_Aereoporto_Dao();
    	Aereoporto newAereoporto=new Aereoporto("foggia","italia",54);
    	
    	
    	//QUERY AEREOPORTO
    	n.insert(aereoporto);
    	aereoporto=n.selectByTipo("ceglie");
    	System.out.println(aereoporto.getCitta() +" "+ aereoporto.getNpiste());
    	n.update("ceglie", newAereoporto);
    	
    	
    	//VOLO
    	Volo v = new Volo(50,"lunedi","amsterdam","ceglie","cod1",12,16);
    	Default_Volo_Dao v1= new Default_Volo_Dao();
    	
    	v1.insert(v);
    	v=v1.selectByTipo(50,"lunedi");
    	System.out.println(v.getCittaArr()+" "+v.getCittaPart());
    	System.out.println(v.getOraPart());
    	v1.update(50, "lunedi",18);
    }
}
