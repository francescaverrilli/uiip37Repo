
public class Client {
	
	public static void main(String[] args) {
		
		Persona p = new Persona("vincenzo", "caserta", "27/11/1991",
				new Indirizzo("Via cesinola", 2, "S. Martino V.C.", "83018", "AV", "Campania"));
		
		
		System.out.println(p);
	}

}
