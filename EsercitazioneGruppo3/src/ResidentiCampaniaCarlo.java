import java.util.Vector;

public class ResidentiCampaniaCarlo {


	
	public static void residentiCampania(Vector<Persona> v1) {
		for (int i=0; i<v1.size(); i++) {
			if(v1.get(i).getNuovo_indirizzo().getRegione().equals("Campania"))
				System.out.println(v1.get(i));
		}
			
	}
}
