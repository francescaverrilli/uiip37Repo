package eser1;

import java.util.LinkedList;

import java.util.Vector;

public class Client {

	public static void main(String[] args) {
		String corso = "elettrotecnica";

		Indirizzo ind1 = new Indirizzo("Via del Tintoretto", 28, "Modena", 41100, "MO", "Emilia Romagna");
		Persona ema = new Persona("Emanuele", "Avallone", "18/05/1992", ind1);
		System.out.println(ema);
		// String via, int civico, String città, int cAP, String provincia, String
		// regione
		Indirizzo myIndirizzo = new Indirizzo("C/da Pino", 9, "Benevento", 82110, "BN", "Campania");
		// String nome, String cognome, String datanascita, String indirizzo
		Persona io = new Persona("Silvio", "Barbato", "06/09/1991", myIndirizzo);
		Studente Silvio = new Studente(io.getNome(), io.getCognome(), io.getDatanascita(), io.getIndirizzo(), 1,
				"Ingegneria Energetica");

		System.out.print(io);

		System.out.print("\n");
		Indirizzo indirizzo = new Indirizzo("C/DA Difesa Grande", 52, "Ariano Irpino", 83031, "AV", "Campania");
		Persona frank = new Persona("Francesco", "Abbatangelo", "10/05/1991", indirizzo);
		System.out.print(frank);

		Vector<Persona> p = new Vector<Persona>();
		p.add(io);
		p.add(ema);
		p.add(frank);

		System.out.print("\n" + ResidentiCampaniaSilvio.trovaResidentiCampania(p));

		System.out.print("\n\n\n");
		Residenti_Campania_Frank elenco = new Residenti_Campania_Frank();
		elenco.aggiungiPersona(ema);
		elenco.aggiungiPersona(io);
		elenco.aggiungiPersona(frank);
		LinkedList<Persona> citt = new LinkedList<Persona>();

		citt.add(io);
		citt.add(ema);
		citt.add(frank);

		ResidentiCampaniaEma res = new ResidentiCampaniaEma(citt);
		LinkedList<Persona> campani = res.trovapersone();
		System.out.println(campani);

		System.out.println(elenco.residentiCampaniaFrank());
		// <------------------------------------------------------------------------------------------>

		Studente eman = new Studente("Emanuele", "Avallone", "18/05/1992", ind1, 1, "Ingegneria Biomedica");

		Studente Abba = new Studente(frank.getNome(), frank.getCognome(), frank.getDatanascita(), frank.getIndirizzo(),
				2, "Ingegneria Informatica");
		Abba.aggiungiCorso("UIIP");
		System.out.println("\n\n");
		System.out.println(Abba);

		System.out.print("\n\n\n");
		Studente_Titoli titoli = new Studente_Titoli();
		titoli.aggiungiStudente(Abba);
		titoli.aggiungiStudente(Silvio);
		titoli.aggiungiStudente(eman);
		System.out.println(titoli.studentiConUnTitolo());

	}

}
