package eser1;

import java.util.Vector;

public class Barbato {

	public static Persona cercaGiovane (Vector<Persona> p) {
		
		Persona pGiovane= new Persona();
		for (int i=0; i<p.size()-1; i++) {
			
			if(p.get(i).getDatanascita().after(p.get(i+1).getDatanascita())) {
				pGiovane=p.get(i);
			}
		}
		return pGiovane;
	}
	
public static Persona cercaAdulto (Vector<Persona> p) {
		
		Persona pAdulto= new Persona();
		for (int i=0; i<p.size()-1; i++) {
			
			if(p.get(i).getDatanascita().after(p.get(i+1).getDatanascita())) {
				pAdulto=p.get(i+1);
			}
		}
		return pAdulto;
	}
}
