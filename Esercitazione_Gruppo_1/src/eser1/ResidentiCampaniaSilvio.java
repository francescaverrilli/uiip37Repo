package eser1;

import java.util.Vector;

public class ResidentiCampaniaSilvio {

	

	public static Vector<Persona> trovaResidentiCampania(Vector<Persona> v) {
		
		Vector<Persona> vp= new Vector<Persona>();
		
		for(int i=0; i<v.size(); i++) {
			
			if(v.get(i).getIndirizzo().getRegione().equalsIgnoreCase("Campania")) {
				vp.add(v.get(i));
				
			}
		}
		return vp;
	}

	
	
	
}
