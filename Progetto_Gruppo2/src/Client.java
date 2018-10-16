import java.util.*;
public class Client {

	public static void main(String[] args) {
		
		Indirizzo ind=new Indirizzo(10,"via bari",28,72013,"Ceglie Messapica","br","puglia");
		Persona p = new Persona("sergio","santoro","21/12/1991",ind);
		

		Indirizzo i_Daniela = new Indirizzo(10, "Via Monticchio", 4, 83031, "Ariano Irpino", "AV", "Campania");
		
		Persona p_Daniela= new Persona("Daniela", "Guardabascio", "19 settembre 1985", i_Daniela);
		

		System.out.println(p.getNome());
		System.out.println(p.getCognome());
		System.out.println(p.getDataNascita());
		System.out.println(p.getIndirizzo().getVia());
		System.out.println(p.getIndirizzo().getNumerocivvico());


		System.out.println("Dati Anagrafici");
		System.out.println(p_Daniela.getNome());
		System.out.println(p_Daniela.getCognome());
		System.out.println(p_Daniela.getDataNascita());
		System.out.println("Indirizzo:");
		System.out.println(p_Daniela.getIndirizzo().getVia() + " " + p_Daniela.getIndirizzo().getNumerocivvico() + " " + p_Daniela.getIndirizzo().getCitta());
		
		ArrayList<Persona> arr = new ArrayList<Persona>();
		arr.add(p);
		arr.add(p_Daniela);
		
		ResidentiCampaniaSantoro.Stampa(arr);
		
	}

}
