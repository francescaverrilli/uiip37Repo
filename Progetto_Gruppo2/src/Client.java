

import java.util.*;

public class Client {

	public static void main(String[] args) {
		LinkedList<Persona> elencoPersone = new LinkedList<Persona>();
		
		
		
		Indirizzo ind = new Indirizzo(10, "via bari", 28, 72013, "Ceglie Messapica", "br", "puglia");
		Persona p = new Persona("sergio", "santoro", "21/12/1991", ind);
		System.out.println(p.getNome());
		System.out.println(p.getCognome());
		System.out.println(p.getDataNascita());
		System.out.println(p.getIndirizzo().getVia());
		System.out.println(p.getIndirizzo().getNumerocivvico());
		
		elencoPersone.add(p);
		Indirizzo i_Daniela = new Indirizzo(10, "Via Monticchio", 4, 83031, "Ariano Irpino", "AV", "Campania");
		Persona p_Daniela = new Persona("Daniela", "Guardabascio", "19 settembre 1985", i_Daniela);
		System.out.println("Dati Anagrafici");
		System.out.println(p_Daniela.getNome());
		System.out.println(p_Daniela.getCognome());
		System.out.println(p_Daniela.getDataNascita());
		System.out.println("Indirizzo:");
		

		elencoPersone.add(p_Daniela);

		Indirizzo i = new Indirizzo(34, "Via Iscalonga", 70, 83036, "Mirabella Eclano", "AV", "Campania");
		Persona Angela = new Persona("Angela", "Di Pietro", "11/06/1992", i);
		
		System.out.println(" ");
		System.out.println("Dati Anagrafici");
		System.out.println(Angela.getNome());
		System.out.println(Angela.getCognome());
		System.out.println(Angela.getDataNascita());
		System.out.println("Indirizzo:");
		System.out.println(Angela.getIndirizzo().getVia() + " " + Angela.getIndirizzo().getNumerocivvico() + " "
				+ Angela.getIndirizzo().getCitta());
		

		elencoPersone.add(Angela);

		Indirizzo indirizzo = new Indirizzo (12, "Contrada San Cesareo", 30, 83030, "Zungoli", "AV", "Campania");
		Persona Chiara = new Persona ("Chiara", "Annicchiarico", "16/04/90", indirizzo);
		System.out.println("Dati Anagrafici");
		System.out.println(Chiara.getNome());
		System.out.println(Chiara.getCognome());
		System.out.println(Chiara.getDataNascita());
		System.out.println("Indirizzo:");
		System.out.println(Chiara.getIndirizzo().getVia() + " " + Chiara.getIndirizzo().getNumerocivvico() + " "
				+ Chiara.getIndirizzo().getCitta());



		elencoPersone.add(Chiara);
		
		ResidentiCampaniaGuardabascio.residentiCampania(elencoPersone);
		System.out.println("Elenco persone residenti in campania");
		for( Persona p_d : elencoPersone) {
			System.out.println(p_d.getNome());
		}
		

				
		ArrayList<Persona> arr = new ArrayList<Persona>();
		arr.add(p);
		arr.add(p_Daniela);
		arr.add(Chiara);
		arr.add(Angela);
		
		ResidentiCampaniaSantoro.Stampa(arr);
		
	}

}
