package eser1;

import java.util.LinkedList;

public class Studente_Titoli {
	private LinkedList<Persona> elenco;

	public Studente_Titoli(LinkedList<Persona> elenco) {
		this.elenco = elenco;
	}

	
	public LinkedList<Persona> getElenco() {
		return elenco;
	}

	public void setElenco(LinkedList<Persona> elenco) {
		this.elenco = elenco;
	}

	@Override
	public String toString() {
		return "Studente_Titoli [elenco=" + elenco + "]";
	}
	
	
}
