import java.util.LinkedList;
import java.util.Vector;
import java.text.ParseException;

public class Client {
	
	public static void main(String[] args) throws ParseException {
		


		Indirizzo i = new Indirizzo ("via Galatina", 50, "Santa Maria Capua Vetere", "81055", "CE", "Campania");
		
		Persona p = new Persona("Carlo", "De Gennaro", "08/08/1985", i);
		

		Persona p2 = new Persona("vincenzo", "caserta", "27/11/1991",
				new Indirizzo("Via cesinola", 2, "S. Martino V.C.", "83018", "AV", "Campania"));

		
		Indirizzo indirizzo= new Indirizzo("Via f. Tedesco",39,"Taurasi","83030","Avellino","Lazio");
		Persona p3 = new Persona("Andrea","Guastaferro","24/09/1991",indirizzo);
		
		
		
		Vector<Persona> v2 = new Vector<Persona>();
		v2.add(p);
		v2.add(p2);
		v2.add(p3);
		
		LinkedList<Persona> nl= new LinkedList<Persona>();
		nl.add(p);
		nl.add(p2);
		nl.add(p3);
		
		/*try {
			Persona piuGiovane = Caserta.getPersonaPiuGiovane(v2);
			Persona piuVecchia = Caserta.getPersonaPiuVecchia(v2);
			System.out.println("La persona più giovane è: " +
			"\n" + piuGiovane);
			
			System.out.println("La persona più vecchia è: " +
					"\n" + piuVecchia);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*
		//ResidentiCampaniaVIncenzo.stampaResidentiCampania(v2);
		

		Vector<Persona> v = new Vector<Persona>();
		v.add(p);
		v.add(p2);
		v.add(p3);
		
		//ResidentiCampaniaCarlo.residentiCampania(v);
		

		LinkedList<Persona>lista_persone =new LinkedList<Persona>();
		ResidentiCampaniaAndrea rsa = new ResidentiCampaniaAndrea(lista_persone);
		
		lista_persone.add(p);
		lista_persone.add(p2);
		lista_persone.add(p3);
		
		//rsa.stampa_per_regione("LAZIO");
		
		Studente nuovo_studente= new Studente("Andrea", "Guastaferro", "24/09/91", indirizzo,
				"Laurea", 1, new Vector<String>());
		
	nuovo_studente.getCorsiFormazione().add("Uiip");
	nuovo_studente.getCorsiFormazione().add("Oracle SE7");
	nuovo_studente.getCorsiFormazione().add("Java");
	
	Studente nuovo_studente1= new Studente("Vincenzo", "Guastaferro", "25/09/91", i,
			"Laurea", 1, new Vector<String>());
	
	Vector<Studente> vett_or=new Vector<Studente>();
	vett_or.add(nuovo_studente);
	vett_or.add(nuovo_studente1);
	
	Vector<Studente> new_vett= new Vector<Studente>();
	
	new_vett= rsa.cerca_studente(vett_or);
	
	System.out.println(new_vett.toString());
	
	*/
		try {
			Persona piugiovane= Guastaferro.getPersonaPiuGiovane(nl);
			Persona piuanziano= Guastaferro.getPersonaPiuVecchia(nl);
			System.out.println("La persona più giovane è : "+piugiovane.getNome()+" "+piugiovane.getCognome()+" "+piugiovane.getData_di_nascita());
			System.out.println("La persona più anziana è : "+piuanziano.getNome()+" "+piuanziano.getCognome()+" "+piuanziano.getData_di_nascita());
		}
		catch (ParseException e){
			e.printStackTrace();
		}
	
	}

}
