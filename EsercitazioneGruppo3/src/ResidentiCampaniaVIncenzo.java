import java.util.Vector;

public class ResidentiCampaniaVIncenzo {
	
	public static void stampaResidentiCampania(Vector<Persona> persone) {
		
		for(Persona p: persone) {
			if(p.getNuovo_indirizzo().getRegione().equalsIgnoreCase("Campania")) {
				System.out.println(p + "\n");
			}	
		}
	}
}
