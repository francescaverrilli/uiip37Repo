package it.sopra.emanuele;

import it.sopra.emanuele.dao.AereoDao;
import it.sopra.emanuele.dao.impl.DefaultAereoDao;
import it.sopra.emanuele.model.Aereo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Aereo a1=new Aereo ("Jett",32,45);
        AereoDao aereoDao= new DefaultAereoDao();
        aereoDao.insert(a1);
        System.out.println(aereoDao.selectByTipo("F35"));
        
        Aereo a2= new Aereo ("F37",2,90);
        
        
        
        aereoDao.update("Jett",a2);
    }
}
