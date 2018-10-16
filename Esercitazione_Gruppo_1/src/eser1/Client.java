package eser1;

import java.util.Date;
import java.util.LinkedList;

import java.util.Vector;

public class Client {

	public static void main(String[] args) {
		// Creazione Persone
		Indirizzo ind1 = new Indirizzo("Via del Tintoretto", 28, "Modena", 41100, "MO", "Emilia Romagna");
		Persona ema = new Persona("Emanuele", "Avallone", new Date(1992, 5, 18), ind1);
		System.out.println(ema);

		Indirizzo myIndirizzo = new Indirizzo("C/da Pino", 9, "Benevento", 82110, "BN", "Campania");
		Persona io = new Persona("Silvio", "Barbato", new Date(1991, 9, 06), myIndirizzo);
		System.out.println(io);

		Indirizzo indirizzo = new Indirizzo("C/DA Difesa Grande", 52, "Ariano Irpino", 83031, "AV", "Campania");
		Persona frank = new Persona("Francesco", "Abbatangelo", new Date(1991, 5, 10), indirizzo);
		System.out.print(frank);

		// <------------------------------------------------------------------->
		// Ricerca residenti Silvio
		Vector<Persona> p = new Vector<Persona>();
		p.add(io);
		p.add(ema);
		p.add(frank);
		System.out.print("\n" + ResidentiCampaniaSilvio.trovaResidentiCampania(p));

		// <------------------------------------------------------------------->
		// Ricerca residenti Francesco
		System.out.print("\n\n\n");
		Residenti_Campania_Frank elenco = new Residenti_Campania_Frank();
		elenco.aggiungiPersona(ema);
		elenco.aggiungiPersona(io);
		elenco.aggiungiPersona(frank);
		System.out.println(elenco.residentiCampaniaFrank());

		// <------------------------------------------------------------------->
		// Ricerca residenti Emanuele
		LinkedList<Persona> citt = new LinkedList<Persona>();
		citt.add(io);
		citt.add(ema);
		citt.add(frank);
		ResidentiCampaniaEma res = new ResidentiCampaniaEma(citt);
		LinkedList<Persona> campani = res.trovapersone();
		System.out.println(campani);

		// <------------------------------------------------------------------------------------------>

		// Ricerca Studenti Silvio
		Studente Silvio = new Studente(io.getNome(), io.getCognome(), io.getDatanascita(), io.getIndirizzo(), 1,
				"Ingegneria Energetica");
		String corsoSilvio = "UIIP";
		Silvio.aggiungiCorso(corsoSilvio);
		System.out.print(Silvio);

		// Ricerca Studenti Silvio
		Studente eman = new Studente("Emanuele", "Avallone", new Date(1992, 5, 18), ind1, 1, "Ingegneria Biomedica");

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
		
		

		// Homework 16/10
		// Barbato
		System.out.println("\nLa persona più giovane è: "+ Barbato.cercaGiovane(p).getNome()+" "+ Barbato.cercaGiovane(p).getCognome());
		
		System.out.println("\nLa persona più adulta è: "+ Barbato.cercaAdulto(p).getNome()+" "+ Barbato.cercaAdulto(p).getCognome());

		// Homework 16/10
		// Abbatangelo
		System.out.print("\n\n\n**************ABBATANGELO*********************************\n");
		Abbatangelo Francesco = new Abbatangelo();
		Francesco.aggiungiPersona(io);
		Francesco.aggiungiPersona(ema);
		Francesco.aggiungiPersona(frank);

		System.out.println("La persona più giovane è: " + Francesco.cercaPersonaGiovane().getNome());
		System.out.println("La persona più anziana è: " + Francesco.cercaPersonaAnziana().getNome());

		System.out.print("***********************************************");

	}

}
