import java.util.ArrayList;

public class ResidentiCampaniaAnnicchiarico {
	
	public static void Stampa(ArrayList<Persona> array1) {
		for(Persona p : array1) {
			System.out.println(p.getNome());
			System.out.println(p.getCognome());
			System.out.println(p.getDataNascita());
			System.out.println(p.getIndirizzo().getVia());
			System.out.println(p.getIndirizzo().getNumerocivvico());
	}
}
}