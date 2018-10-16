
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClasseRicercaSantoro {
	
	
	public static Persona CercaGiovane(ArrayList<Persona> array1){
		Persona a=array1.get(0);
		Date min=a.getDataNascita();
		for(Persona p:array1) {
			if(p.getDataNascita().after(min)) {
				min=p.getDataNascita();
				a=p;
			}
		}
		return a;
	}
	
	
	public static Persona CercaVecchio(ArrayList<Persona> array1){
		Persona a=array1.get(0);
		Date min=a.getDataNascita();
		for(Persona p:array1) {
			if(p.getDataNascita().before(min)) {
				min=p.getDataNascita();
				a=p;
			}
		}
		return a;
	}

}
