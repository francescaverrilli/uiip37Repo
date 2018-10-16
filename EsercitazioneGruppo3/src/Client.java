
public class Client {
	
	public static void main(String[] args) {
		

		Persona p2 = new Persona("vincenzo", "caserta", "27/11/1991",
				new Indirizzo("Via cesinola", 2, "S. Martino V.C.", "83018", "AV", "Campania"));
		
		
		System.out.println(p2);

		Indirizzo indirizzo= new Indirizzo("Via f. Tedesco",39,"Taurasi","83030","Avellino","Campania");
		Persona p = new Persona("Andrea","Guastaferro","24/09/91",indirizzo);
		
		System.out.println(p.toString());
		
		

	}

}
