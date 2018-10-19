package it.Sopra.AndreaGuastaferro;

import it.Sopra.AndreaGuastaferro.dao.AereoDao;
import it.Sopra.AndreaGuastaferro.dao.VoloDao;
import it.Sopra.AndreaGuastaferro.dao.impl.DefaultAereoDao;
import it.Sopra.AndreaGuastaferro.dao.impl.DefaultVoloDao;
import it.Sopra.AndreaGuastaferro.model.Aereo;
import it.Sopra.AndreaGuastaferro.model.Volo;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ){
    
    Aereo n = new Aereo("A468",235,5532);
    AereoDao aereo= new DefaultAereoDao();
    //aereo.insert(n);
   // Aereo a = aereo.selectByTipo("B747");
   // System.out.println(a.toString());
    
   // aereo.update("F35", new Aereo("F35", 3453, 1878));
    
    VoloDao volo= new DefaultVoloDao();
     Volo v= volo.selectByTipo(2, "mercoled�");
//    
     volo.update(2, "sabato", new Volo(2, "mercoled�", "NewYork", "Amsterdam", "B747", 0, 0));
    }
}
