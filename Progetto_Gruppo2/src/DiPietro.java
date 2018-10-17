import java.util.ArrayList;
import java.util.Date;


public class DiPietro {

	public static Persona tryYoung(ArrayList<Persona> array){
		Persona a=array.get(0);
		Date min=a.getDataNascita();
		for(Persona p:array) {
			if(p.getDataNascita().after(min)) {
				min=p.getDataNascita();
				a=p;
			}
		}
		return a;
	}
	
	
	public static Persona tryOld(ArrayList<Persona> array){
		Persona a=array.get(0);
		Date min=a.getDataNascita();
		for(Persona p:array) {
			if(p.getDataNascita().before(min)) {
				min=p.getDataNascita();
				a=p;
			}
		}
		return a;
	}

}

