package eser1;

import java.util.LinkedList;

public class Residenti_Campania_Frank {
	private LinkedList<Persona> elenco;

	public Residenti_Campania_Frank() {
		this.elenco = new LinkedList<Persona>();
	}

	public LinkedList<Persona> residentiCampaniaFrank() {
		LinkedList<Persona> temp = new LinkedList<Persona>();
		for (int i = 0; i < this.elenco.size(); i++) {
			if (this.elenco.get(i).getIndirizzo().getRegione().equalsIgnoreCase("campania")) {
				temp.add(this.elenco.get(i));
			}
		}
		return temp;
	}

	public boolean aggiungiPersona(Persona p) {

		return this.elenco.add(p);
	}

	public LinkedList<Persona> getElenco() {
		return elenco;
	}

	public void setElenco(LinkedList<Persona> elenco) {
		this.elenco = elenco;
	}

	@Override
	public String toString() {
		return "Residenti_Campania_Frank [elenco=" + elenco + "]";
	}

}
