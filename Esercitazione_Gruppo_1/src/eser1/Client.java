package eser1;

import java.util.LinkedList;


public class Client {

	public static void main(String[] args) {
		Indirizzo ind1 = new Indirizzo("Via del Tintoretto", 28, "Modena", 41100, "MO", "Emilia Romagna");
		Persona ema = new Persona("Emanuele", "Avallone", "18/05/1992", ind1);
		System.out.println(ema);
		// String via, int civico, String città, int cAP, String provincia, String
		// regione
		Indirizzo myIndirizzo = new Indirizzo("C/da Pino", 9, "Benevento", 82110, "BN", "Campania");
		// String nome, String cognome, String datanascita, String indirizzo
		Persona io = new Persona("Silvio", "Barbato", "06/09/1991", myIndirizzo);

		System.out.print(io);

		System.out.print("\n");
		Indirizzo indirizzo = new Indirizzo("C/DA Difesa Grande", 52, "Ariano Irpino", 83031, "AV", "Campania");
		Persona frank = new Persona("Francesco", "Abbatangelo", "10/05/1991", indirizzo);
		System.out.print(frank);

		System.out.print("\n\n\n");
		Residenti_Campania_Frank elenco = new Residenti_Campania_Frank();
		elenco.aggiungiPersona(ema);
		elenco.aggiungiPersona(io);
		elenco.aggiungiPersona(frank);
		LinkedList<Persona> citt= new LinkedList<Persona>();
		
	
		citt.add(io);
		citt.add(ema);
		citt.add(frank);
		
		
		ResidentiCampaniaEma res= new ResidentiCampaniaEma(citt);
		LinkedList<Persona> campani=res.trovapersone();
		System.out.println(campani);

		System.out.print(elenco.residentiCampaniaFrank());
	}

}
