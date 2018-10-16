import java.util.Vector;

public class Client {
	
	public static void main(String[] args) {
		


		Indirizzo i = new Indirizzo ("via Galatina", 50, "Santa Maria Capua Vetere", "81055", "CE", "Campania");
		
		Persona p = new Persona("Carlo", "De Gennaro", "08/08/1985", i);
		System.out.println(p);


		Persona p2 = new Persona("vincenzo", "caserta", "27/11/1991",
				new Indirizzo("Via cesinola", 2, "S. Martino V.C.", "83018", "AV", "Campania"));
		
		
		System.out.println(p2);

		Indirizzo indirizzo= new Indirizzo("Via f. Tedesco",39,"Taurasi","83030","Avellino","Campania");
		Persona p3 = new Persona("Andrea","Guastaferro","24/09/91",indirizzo);
		
		System.out.println(p3.toString());
		
		Vector<Persona> v = new Vector<Persona>();
		v.add(p);
		v.add(p2);
		v.add(p3);
		
		ResidentiCampaniaCarlo.residentiCampania(v);
		
	}

}
