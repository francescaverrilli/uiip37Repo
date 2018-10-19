package it.sopra.caserta.main;

import it.sopra.caserta.dao.AereoDao;
import it.sopra.caserta.dao.AeroportoDao;
import it.sopra.caserta.dao.VoloDao;
import it.sopra.caserta.dao.impl.DefaultAereoDao;
import it.sopra.caserta.dao.impl.DefaultAeroportoDao;
import it.sopra.caserta.dao.impl.DefaultVoloDao;
import it.sopra.caserta.model.Aereo;
import it.sopra.caserta.model.Aeroporto;
import it.sopra.caserta.model.Volo;

public class App {

	public static void main(String[] args) {
	
		
		AereoDao aereoDAo = new DefaultAereoDao();
		
		AeroportoDao aeroportoDao =  new DefaultAeroportoDao();
		
		VoloDao voloDao = new DefaultVoloDao();
	
		Aereo aere = aereoDAo.selectByTipo("Typ1");
		System.out.println(aere +"\n");
		
		aereoDAo.updateNpass("Typ1", 250);
		
		Aereo aereM = aereoDAo.selectByTipo("Typ1");
		System.out.println(aereM);
		
		//Aereo aereo = new Aereo("Typ2", 200, 10000);
		//aereoDAo.insert(aereo);
		
		//aeroportoDao.update("Roma", new Aeroporto("Roma", "Italia", 40));
		//aereoDAo.update("B747", new Aereo("B747", 500, 500) );
		//voloDao.update(1, "martedì", new Volo(1,"martedi", "Napoli", "Roma", "F35", 18, 20));
		
		//Aeroporto ae = aeroportoDao.selectByTipo("Roma");
		//Volo v = voloDao.selectByTipo(1,"giovedì");
		//Aereo a = aereoDAo.selectByTipo("B747");
	
		//System.out.println(ae);
		//System.out.println(a);
		//System.out.println(v);
		
		

	}

}
