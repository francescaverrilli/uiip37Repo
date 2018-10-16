package eser1;

import java.util.LinkedList;

public class ResidentiCampaniaEma {
LinkedList<Persona> lista= new LinkedList<Persona>();

public ResidentiCampaniaEma(LinkedList<Persona> lista) {
	
	this.lista = lista;
}

public LinkedList<Persona> trovapersone() {
	LinkedList<Persona> persone=new LinkedList<Persona>();
	for(int i=0;i<lista.size();i++) {
		if(lista.get(i).getIndirizzo().getRegione().equals("Campania")) {
			persone.add(lista.get(i));
			
		}
	}
	return lista;
}
public LinkedList<Persona> getLista() {
	return lista;
}

public void setLista(LinkedList<Persona> lista) {
	this.lista = lista;
}

@Override
public String toString() {
	return "ResidentiCampaniaEma [lista=" + lista + "]";
}


}
