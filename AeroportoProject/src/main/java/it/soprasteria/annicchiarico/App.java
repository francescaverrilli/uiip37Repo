package it.soprasteria.annicchiarico;

import it.soprasteria.annicchiarico.dao.AereoDao;
import it.soprasteria.annicchiarico.dao.impl.DefaultAereoDao;
import it.soprasteria.annicchiarico.dao.impl.DefaultAeroportoDao;
import it.soprasteria.annicchiarico.dao.impl.DefaultVoloDao;
import it.soprasteria.annicchiarico.model.Aereo;
import it.soprasteria.annicchiarico.model.Aeroporto;
import it.soprasteria.annicchiarico.model.Volo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Aereo a = new Aereo ("C38", 39, 44);
        Aereo a1 = new Aereo ("C39", 390, 440);
       
        AereoDao aereoDao = new DefaultAereoDao ();
        AereoDao aereoDao1 = new DefaultAereoDao ();
        
        Aeroporto b = new Aeroporto ("Napoli", "Italia", 32);
        DefaultAeroportoDao aeroportoDao = new DefaultAeroportoDao();
        
        DefaultVoloDao defaultVoloDao = new DefaultVoloDao();
        
        
        aereoDao.insert(a);
        System.out.println(aereoDao.selectByTipo(a.getTipoAereo()));
        aereoDao.update(a, a1.getTipoAereo());
        
        
       
        
        
        aeroportoDao.insert(b);
        aeroportoDao.selectByTipo(b.getCitta());
        aeroportoDao.update(b, b.getCitta());
        
        
    }
    
}
