package eser1;

import java.util.LinkedList;

public class Abbatangelo {
	private LinkedList<Persona> elenco;

	public Abbatangelo() {
		this.elenco = new LinkedList<Persona>();
	}

	public void aggiungiPersona(Persona p) {
		this.elenco.add(p);
	}

	public Persona cercaPersonaGiovane() {
		Persona p = null;
		for (int i = 0; i < this.elenco.size() - 1; i++) {
			if (this.elenco.get(i).getDatanascita().after(this.elenco.get(i + 1).getDatanascita())) {
				p = this.elenco.get(i);
			}
		}
		return p;
	}

	public Persona cercaPersonaAnziana() {
		Persona p = null;
		for (int i = 0; i < this.elenco.size() - 1; i++) {
			if (this.elenco.get(i).getDatanascita().after(this.elenco.get(i + 1).getDatanascita())) {
				p = this.elenco.get(i + 1);
			}
		}
		return p;
	}

	public LinkedList<Persona> getElenco() {
		return elenco;
	}

	public void setElenco(LinkedList<Persona> elenco) {
		this.elenco = elenco;
	}

	@Override
	public String toString() {
		return "Abbatangelo [elenco=" + elenco + "]";
	}

}
