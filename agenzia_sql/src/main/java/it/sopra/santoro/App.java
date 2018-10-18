package it.sopra.santoro;

import it.sopa.santoro.dao.impl.Default_Aereo_Dao;
import it.sopra.santoro.model.Aereo;

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
    	
    	Aereo a = new Aereo("cod1",100,23);
    	Default_Aereo_Dao aereo_dao=new Default_Aereo_Dao();
    	aereo_dao.insert(a);
    	
    }
}
