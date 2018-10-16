import java.util.LinkedList;

public class CorsoFormazioneAnnicchiarico {
	public static void StampaStudenti(LinkedList<Studente> l) {
		for(Studente s:l) {
			if(s.getCorsiFormazione().size()>0) {
			System.out.println(s.getNome());
			System.out.println(s.getCognome());
			System.out.println(s.getTitoloStudio());
			System.out.println(s.getCorsiFormazione());
			}
		}
	}

}
