
public class Client {
	
	public static void main(String[] args) {
		
		Indirizzo i = new Indirizzo ("via Galatina", 50, "Santa Maria Capua Vetere", "81055", "CE", "Campania");
		
		Persona p = new Persona("Carlo", "De Gennaro", "08/08/1985", i);
		System.out.println(p);
	}

}
