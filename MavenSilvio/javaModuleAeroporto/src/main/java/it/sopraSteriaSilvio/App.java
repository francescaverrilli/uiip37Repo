package it.sopraSteriaSilvio;

import it.sopraSteriaSilvio.dao.AereoDao;
import it.sopraSteriaSilvio.dao.impl.DefaultAereoDao;
import it.sopraSteriaSilvio.model.Aereo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Aereo a1= new Aereo("Jet3", 32, 45);
        
        AereoDao aereoDao = new DefaultAereoDao();
        aereoDao.insert(a1);
    }
}
