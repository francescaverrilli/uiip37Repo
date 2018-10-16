import java.util.Vector;
import java.util.LinkedList;

public class Client {
	
	public static void main(String[] args) {
		


		Indirizzo i = new Indirizzo ("via Galatina", 50, "Santa Maria Capua Vetere", "81055", "CE", "Campania");
		
		Persona p = new Persona("Carlo", "De Gennaro", "08/08/1985", i);
		

		Persona p2 = new Persona("vincenzo", "caserta", "27/11/1991",
				new Indirizzo("Via cesinola", 2, "S. Martino V.C.", "83018", "AV", "Campania"));

		
		Indirizzo indirizzo= new Indirizzo("Via f. Tedesco",39,"Taurasi","83030","Avellino","Lazio");
		Persona p3 = new Persona("Andrea","Guastaferro","24/09/91",indirizzo);
		
		
		
		Vector<Persona> v2 = new Vector<Persona>();
		v2.add(p);
		v2.add(p2);
		v2.add(p3);
		
		ResidentiCampaniaVIncenzo.stampaResidentiCampania(v2);
		

		Vector<Persona> v = new Vector<Persona>();
		v.add(p);
		v.add(p2);
		v.add(p3);
		
		ResidentiCampaniaCarlo.residentiCampania(v);
		

		LinkedList<Persona>lista_persone =new LinkedList<Persona>();
		ResidentiCampaniaAndrea rsa = new ResidentiCampaniaAndrea(lista_persone);
		
		lista_persone.add(p);
		lista_persone.add(p2);
		lista_persone.add(p3);
		
		rsa.stampa_per_regione("LAZIO");

	}

}
