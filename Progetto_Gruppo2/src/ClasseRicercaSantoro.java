
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClasseRicercaSantoro {
	
	
	public static Persona CercaGiovane(LinkedList<Persona> l){
		Persona a=(Persona)l.get(0);
		Date min=a.getDataNascita();
		for(Persona p:l) {
			if(p.getDataNascita().before(min)) {
				min=p.getDataNascita();
				a=p;
			}
		}
		return a;
	}

}
