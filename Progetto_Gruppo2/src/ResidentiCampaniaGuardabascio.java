import java.util.LinkedList;


public class ResidentiCampaniaGuardabascio {

	public static LinkedList<Persona> residentiCampania(LinkedList<Persona> elencoPersone) {
		
		LinkedList<Persona> listaCampania= new LinkedList<Persona>();
		for(Persona p : elencoPersone ) {
			if(p.getIndirizzo().getRegione().equalsIgnoreCase("Campania")) {
				listaCampania.add(p);
			}
		}
		return listaCampania;
		
	}
}
