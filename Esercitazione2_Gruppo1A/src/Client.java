
public class Client {

	public static void main(String[] args) {

		
		//(String codice, String nome, String cognome, int punti)
		Cliente silvio= new Cliente("ID1234", "Silvio", "Barbato", 10);
		
		
		//String codice, String descrizione, float costo, int npunti
		Prodotto prodottoSilvio1= new Prodotto("ID9876", "PC", 349.99f, 5 );
		Prodotto prodottoSilvio2= new Prodotto("ID9877", "forno", 249.99f, 3 );
		
		

		Cliente Frank = new Cliente("001", "Frank", "Abba", 100);


		Prodotto patatine = new Prodotto("P1", "Patatine", 1, 2);
		Prodotto pizza = new Prodotto("P2", "Pizza", 2, 4);
	}
	Cliente cl1= new Cliente("TREYUO", "Emanuele", "Avallone", 250);
	Prodotto p1= new Prodotto("TTRREE", "Pan Bauletto", 1.30f, 5);
	Prodotto p2= new Prodotto("UUGGFF", "Nutella", 3.50f, 10);
}
