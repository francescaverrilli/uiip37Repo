import java.text.ParseException;
import java.util.Vector;

public class Caserta {
	
	
	public static Persona getPersonaPiuGiovane(Vector<Persona> persone) throws ParseException {
		
		if(!persone.isEmpty()) {
			Persona persGiovane = persone.get(0);
			
			for(int i = 1; i < persone.size(); i++) {
				if(persone.get(i).getData_di_nascita().after(persGiovane.getData_di_nascita())) {
					persGiovane = persone.get(i);
				}
			
			}
			return persGiovane;
		}
		else {
			return null;
		}
	}
	
	
	public static Persona getPersonaPiuVecchia(Vector<Persona> persone) throws ParseException {
		
		if(!persone.isEmpty()) {
			Persona persVecchia = persone.get(0);		
			for(int i = 1; i < persone.size(); i++) {
				if(persone.get(i).getData_di_nascita().before(persVecchia.getData_di_nascita())) {
					persVecchia = persone.get(i);
				}
			}
			return persVecchia;
		}
		else {
			return null;
		}
	}
}


