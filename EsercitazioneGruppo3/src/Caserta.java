import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Caserta {
	
	
	public static Persona getPersonaPiuGiovane(Vector<Persona> persone) throws ParseException {
		
		if(!persone.isEmpty()) {
			Persona persGiovane = persone.get(0);
			
			for(int i = 1; i < persone.size(); i++) {
				if(persone.get(i).getData_di_nascita().compareTo(persGiovane.getData_di_nascita()) < 1) {
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
				if(persone.get(i).getData_di_nascita().compareTo(persVecchia.getData_di_nascita()) < 1) {
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


