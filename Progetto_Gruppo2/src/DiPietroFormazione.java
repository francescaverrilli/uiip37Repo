import java.util.LinkedList;

public class DiPietroFormazione {
	public static void StampaStudenti(LinkedList<Studente> lista) {
		for(Studente s:lista) {
			if(s.getCorsiFormazione().size()>0) {
			System.out.println(s.getNome());
			System.out.println(s.getCognome());
			System.out.println(s.getTitoloStudio());
			System.out.println(s.getCorsiFormazione());
			}
		}
	}

}
