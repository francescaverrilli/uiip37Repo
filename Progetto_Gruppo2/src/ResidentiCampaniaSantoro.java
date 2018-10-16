
import java.util.*;


public class ResidentiCampaniaSantoro {
	
	public static void Stampa(ArrayList<Persona> arr) {
		for(Persona p : arr) {
			System.out.println(p.getNome());
			System.out.println(p.getCognome());
			System.out.println(p.getDataNascita());
			System.out.println(p.getIndirizzo().getVia());
			System.out.println(p.getIndirizzo().getNumerocivvico());
		}
	}

}
