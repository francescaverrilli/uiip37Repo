import java.text.ParseException;
import java.util.*;

public class Client {

	public static void main(String[] args) throws ParseException {

		LinkedList<Persona> elencoPersone = new LinkedList<Persona>();
		LinkedList<String> corsi_D= new LinkedList<String>();
		LinkedList<Studente> lista_studenti_Daniela = new LinkedList<Studente>();
		
		LinkedList<String> corsi = new LinkedList<String>();
		LinkedList<Studente> l = new LinkedList<Studente>();
		corsi.add("programmazione");
		corsi.add("Analisi");
		
		Indirizzo ind = new Indirizzo(10, "via bari", 28, 72013, "Ceglie Messapica", "br", "puglia");
		Studente s = new Studente("sergio", "santoro", "21/12/1991", ind,1,"laurea informatica",corsi);
		System.out.println(" ");
		System.out.println(s.getNome());
		System.out.println(s.getCognome());
		System.out.println(s.getDataNascita());
		System.out.println(s.getIndirizzo().getVia());
		System.out.println(s.getIndirizzo().getNumerocivvico());

		lista_studenti_Daniela.add(s);

		l.add(s);
		StudentiFormazione.StampaStudenti(l);
		

		
		elencoPersone.add(s);
		
		Indirizzo i_Daniela = new Indirizzo(10, "Via Monticchio", 4, 83031, "Ariano Irpino", "AV", "Campania");
		Persona p_Daniela = new Persona("Daniela", "Guardabascio", "19/09/1985", i_Daniela);
		corsi_D.add("Informatici senza frontiere");
		corsi_D.add("Calma");
		Studente st_Danielaa = new Studente("Daniela", "Guardabascio",  "19/09/1985", i_Daniela, 2, "Ingegenria Informatica", corsi_D);
		lista_studenti_Daniela.add(st_Danielaa);
		
		System.out.println("Dati Anagrafici");
		System.out.println(p_Daniela.getNome());
		System.out.println(p_Daniela.getCognome());
		System.out.println(p_Daniela.getDataNascita());
		System.out.println("Indirizzo:");
		elencoPersone.add(p_Daniela);

		Indirizzo i = new Indirizzo(34, "Via Iscalonga", 70, 83036, "Mirabella Eclano", "AV", "Campania");
		//Persona Angela = new Persona("Angela", "Di Pietro", "11/06/1992", i);
		Studente Angela = new Studente("Angela", "Di Pietro", "11/06/1992", i, 2, "Ingegeria Civile",corsi_D);
		System.out.println(" ");
		System.out.println("Dati Anagrafici");
		System.out.println(Angela.getNome());
		System.out.println(Angela.getCognome());
		System.out.println(Angela.getDataNascita());
		System.out.println("Indirizzo:");
		System.out.println(Angela.getIndirizzo().getVia() + " " + Angela.getIndirizzo().getNumerocivvico() + " "
				+ Angela.getIndirizzo().getCitta());
		l.add(s);
		StudentiFormazione.StampaStudenti(l);

		elencoPersone.add(Angela);
		System.out.println(" ");
		
		Indirizzo indirizzo = new Indirizzo (12, "Contrada San Cesareo", 30, 83030, "Zungoli", "AV", "Campania");
		Persona Chiara = new Persona ("Chiara", "Annicchiarico", "16/04/1990", indirizzo);
		LinkedList<String> corsiFormazione = new LinkedList<String>();
		Studente s1 = new Studente ("Chiara", "Annicchiarico", "16/04/1990", indirizzo, 1, "ingegnere", corsiFormazione );
		lista_studenti_Daniela.add(s1);
		
		
		System.out.println("Dati Anagrafici");
		System.out.println(Chiara.getNome());
		System.out.println(Chiara.getCognome());
		System.out.println(Chiara.getDataNascita());
		System.out.println("Indirizzo:");
		System.out.println(Chiara.getIndirizzo().getVia() + " " + Chiara.getIndirizzo().getNumerocivvico() + " "
				+ Chiara.getIndirizzo().getCitta());

		elencoPersone.add(Chiara);
		System.out.println(" ");
		System.out.println("Stampa Chiara ");
		ResidentiCampaniaGuardabascio.residentiCampania(elencoPersone);
		System.out.println("Elenco persone residenti in campania");
		for( Persona p_d : elencoPersone) {
			System.out.println(p_d.getNome());
		}
		

		System.out.println(" ");
		System.out.println("Stampa Sergio ");
		ArrayList<Persona> arr = new ArrayList<Persona>();
		arr.add(s);
		arr.add(p_Daniela);
		arr.add(Chiara);
		arr.add(Angela);
		
		ResidentiCampaniaSantoro.Stampa(arr);
		
		System.out.println(" ");
		System.out.println("Stampa Angela ");
		ArrayList<Persona> array = new ArrayList<Persona>();
		array.add(Angela);
		array.add(p_Daniela);
		array.add(Chiara);
		array.add(s);
		ResidentiCampaniaDiPietro.Stampa(array);

		System.out.println(" ");
		System.out.println("Stampa Chiara ");
		elencoPersone.add(Chiara);
		ArrayList<Persona> array1 = new ArrayList<Persona>();
		array1.add(s);
		array1.add(p_Daniela);
		array1.add(Chiara);
		array1.add(Angela);
		ResidentiCampaniaAnnicchiarico.Stampa(array1);
		
		
		System.out.println("Lista studenti con formazione Daniela");
		LinkedList<Studente> filtroDaniela = new LinkedList<Studente>();
		filtroDaniela = StudentiConFormazioneDaniela.listaStudentiFormati(lista_studenti_Daniela);
		System.out.println("Gli studenti con almeno un corso di formazione sono " + filtroDaniela.size());
		

		
		Persona trovata=ClasseRicercaSantoro.CercaGiovane(array1);
		System.out.println(trovata.getNome());
		
		// Ricerca per eta Daniela
		Persona vecchia_daniela= Guardabascio_Eta.CercaVecchio_Daniela(elencoPersone);
		System.out.println("La persona piu  vecchia � : " + vecchia_daniela.getNome() + " - data di nascita " + vecchia_daniela.getDataNascita());

		Persona giovane_daniela= Guardabascio_Eta.CercaGiovane_Daniela(elencoPersone);
		System.out.println("La persona piu  giovane � : " + giovane_daniela.getNome() + " - data di nascita " + giovane_daniela.getDataNascita());

		
		Persona cercata=Annicchiarico.CercaGiovane(array1);
		System.out.println(cercata.getNome());
		
		Persona cercato=Annicchiarico.CercaVecchio(array1);
		System.out.println(cercato.getNome());
	}

}
