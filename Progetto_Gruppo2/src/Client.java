
public class Client {

	public static void main(String[] args) {
		
		
		
		Indirizzo i= new Indirizzo (34, "Via Iscalonga",70,83036,"Mirabella Eclano","AV","Campania");
		Persona Angela= new Persona("Angela", "Di Pietro", "11/06/1992",i);
		
		System.out.println("Il nome della Persona è "+Angela.getNome());
		System.out.println("Il cognome"+Angela.getCognome());
		System.out.println("Nata il "+Angela.getDataNascita());
		System.out.println("Residente a"+i.getCitta()+i.getNumerocivvico()+i.getProvincia()+i.getRegione());
		
	}

}
