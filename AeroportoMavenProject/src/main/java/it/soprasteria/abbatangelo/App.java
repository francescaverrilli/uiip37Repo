package it.soprasteria.abbatangelo;

import it.soprasteria.abbatangelo.dao.AereoDao;
import it.soprasteria.abbatangelo.dao.AeroportoDao;
import it.soprasteria.abbatangelo.dao.VoloDao;
import it.soprasteria.abbatangelo.dao.impl.DefaultAereoDao;
import it.soprasteria.abbatangelo.dao.impl.DefaultAeroportoDao;
import it.soprasteria.abbatangelo.dao.impl.DefaultVoloDao;
import it.soprasteria.abbatangelo.model.Aereo;
import it.soprasteria.abbatangelo.model.Aeroporto;
import it.soprasteria.abbatangelo.model.Volo;

public class App {
	public static void main(String[] args) {

		Aereo aereo1 = new Aereo("Fra", 32, 45);
		AereoDao a = new DefaultAereoDao();
		a.insert(aereo1);
		System.out.println(a.selectByTipo("B747"));
		Aereo aereo2 = new Aereo("OOO", 100, 100);
		a.update("Fra", aereo2);

		Aeroporto a1 = new Aeroporto("Ariano", "Italia", 5);
		AeroportoDao ad1 = new DefaultAeroportoDao();
		ad1.insert(a1);

		System.out.println(ad1.selectByCitta("Ariano"));

		Aeroporto a2 = new Aeroporto("Grotta", "Romania", 7);

		ad1.update("Ariano", a2);

		Volo volo1 = new Volo(17, "venerdì", "Roma", "Grotta", "OOO", 12, 15);
		VoloDao vd1 = new DefaultVoloDao();

		vd1.insert(volo1);

		System.out.println(vd1.selectByIdVolo(17));

		Volo volo2 = new Volo(18, "venerdì", "Grotta", "NewYork", "OOO", 12, 16);
		vd1.update(17, volo2);

		vd1.updateCittaPart(17, "Amsterdam");
	}
}
