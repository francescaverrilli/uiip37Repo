package it.sopraSteriaSilvio;

import it.sopraSteriaSilvio.dao.AereoDao;
import it.sopraSteriaSilvio.dao.impl.DefaultAereoDao;
import it.sopraSteriaSilvio.model.Aereo;
import it.sopraSteriaSilvio.model.Aeroporto;
import it.sopraSteriaSilvio.model.Volo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Aereo a1= new Aereo("Jet3", 32, 45);
        
        AereoDao aereoDao = new DefaultAereoDao();
        aereoDao.insert(a1);
        System.out.println(aereoDao.selectByTipo("F35"));
        
        //Aereo a2= new Aereo("F37", 2, 90);
        //aereoDao.update("Jet3", a2);

        
        //Aeroporto aer1= new Aeroporto("Milano", "Italia", 10);
        //aereoDao.updateAeroporto("Barcellona", aer1);
        
        Volo v1 = new Volo(3, "Domenica", "Milano", "Amsterdam", "Jet3", 17, 18);
        aereoDao.updateVolo(1, "lunedì", v1);
    }
}
