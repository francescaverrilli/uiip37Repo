
public class Client {
	
	public static void main(String[] args) {
		
		Indirizzo indirizzo= new Indirizzo("Via f. Tedesco",39,"Taurasi","83030","Avellino","Campania");
		Persona p = new Persona("Andrea","Guastaferro","24/09/91",indirizzo);
		
		System.out.println(p.toString());
		
		
	}

}
