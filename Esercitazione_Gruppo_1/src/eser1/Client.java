package eser1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Indirizzo ind1= new Indirizzo ("Via del Tintoretto",28,"Modena",41100,"MO", "Emilia Romagna");
		Persona ema= new Persona ("Emanuele", "Avallone", "18/05/1992",ind1);
System.out.println(ema);

		
		//String via, int civico, String città, int cAP, String provincia, String regione
		Indirizzo myIndirizzo= new Indirizzo("C/da Pino", 9, "Benevento", 82110, "BN", "Campania");
		//String nome, String cognome, String datanascita, String indirizzo
		Persona io= new Persona("Silvio", "Barbato", "06/09/1991", myIndirizzo);
		
		System.out.print("Io, " + io.getNome()+ " "+ io.getCognome()+ " , nato il " + io.getDatanascita()+
				", abito in " + io.getIndirizzo());
		
	}

}
