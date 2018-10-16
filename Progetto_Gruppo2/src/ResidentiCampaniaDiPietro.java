import java.util.ArrayList;

public class ResidentiCampaniaDiPietro {

	public static void Stampa(ArrayList<Persona> array) {
		for (Persona p : array) {
			System.out.println(p.getNome());
			System.out.println(p.getCognome());
			System.out.println(p.getDataNascita());
			System.out.println(p.getIndirizzo().getVia());
			System.out.println(p.getIndirizzo().getNumerocivvico());
		}
	}
}
