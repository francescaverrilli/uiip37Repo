import java.text.ParseException;
import java.util.Vector;

public class DeGennaro {
	public static Persona ritornaPiuGiovane(Vector<Persona> p) throws ParseException {
		
		if(!p.isEmpty()) {
			Persona pGiovane = p.get(0);
			
			for(int i = 1; i < p.size(); i++) {
				if(p.get(i).getData_di_nascita().after(pGiovane.getData_di_nascita())) {
					pGiovane = p.get(i);
				}
			
			}
			return pGiovane;
		}
		else {
			return null;
			}
		}
	
	
	public static Persona ritornaPiuVecchia(Vector<Persona> p) throws ParseException {
		
		if(!p.isEmpty()) {
			Persona pVecchia = p.get(0);		
			for(int i = 1; i < p.size(); i++) {
				if(p.get(i).getData_di_nascita().before(pVecchia.getData_di_nascita())) {
					pVecchia = p.get(i);
				}
			}
			return pVecchia;
		}
		else {
			return null;
			}
		}
	}

