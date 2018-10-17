import java.text.ParseException;
import java.util.LinkedList;


public class Guastaferro {

	public static Persona getPersonaPiuGiovane (LinkedList<Persona> persone) throws ParseException {
		Persona persona_temp= persone.get(0);
		for(int i=0; i < persone.size();i++) {
			if(persone.get(i).getData_di_nascita().after(persona_temp.getData_di_nascita())){
				persona_temp=persone.get(i);
			}
		}
		return persona_temp;
	}
	
	public static Persona getPersonaPiuVecchia(LinkedList<Persona> persone) throws ParseException{
		Persona persona_temp=persone.get(0);
		for(int i=0; i < persone.size();i++) {
			if(persone.get(i).getData_di_nascita().before(persona_temp.getData_di_nascita())) {
				persona_temp=persone.get(i);
			}
		}
		return persona_temp;
	}

}
