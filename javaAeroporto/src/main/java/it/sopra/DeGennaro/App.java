package it.sopra.DeGennaro;

import it.sopra.DeGennaro.dao.AereoDao;
import it.sopra.DeGennaro.dao.AeroportoDao;
import it.sopra.DeGennaro.dao.VoloDao;
import it.sopra.DeGennaro.impl.DefaultAereoDao;
import it.sopra.DeGennaro.impl.DefaultAeroportoDao;
import it.sopra.DeGennaro.impl.DefaultVoloDao;
import it.sopra.DeGennaro.model.Aereo;
import it.sopra.DeGennaro.model.Aeroporto;
import it.sopra.DeGennaro.model.Volo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Aereo a = new Aereo("A469", 235, 3456);
		AereoDao aereoDao = new DefaultAereoDao();
		aereoDao.insert(a);

		// aereoDao.update("B123", new Aereo ("B123", 125, 125));
		//
		// Aeroporto a1 = new Aeroporto ("Napoli", "Italia", 10);
		AeroportoDao aeroportoDao = new DefaultAeroportoDao();
		// aeroportoDao.insert(a1);

		aeroportoDao.update("Roma", new Aeroporto("Roma", "Italia", 125));

		
		Volo v = new Volo(123, "venerdì", "Roma", "Napoli", "A469", 13, 16);
		VoloDao voloDao = new DefaultVoloDao();
		voloDao.insert(v);
		voloDao.update(1, "martedì", new Volo(1,"martedì", "Napoli", "Roma", "F35", 12, 15));

		
		

	}
}
