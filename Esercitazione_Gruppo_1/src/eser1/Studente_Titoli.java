package eser1;

import java.util.LinkedList;

public class Studente_Titoli {
	private LinkedList<Studente> elenco;

	public Studente_Titoli() {
		this.elenco = new LinkedList<Studente>();
	}

	public LinkedList<Studente> studentiConUnTitolo() {
		LinkedList<Studente> temp = new LinkedList<Studente>();
		for (int i = 0; i < this.elenco.size(); i++) {
			if (this.elenco.get(i).getCorsi().size() >= 1) {
				temp.add(this.elenco.get(i));
			}
		}
		return temp;
	}

	public void aggiungiStudente(Studente s) {
		this.elenco.add(s);
	}

	public LinkedList<Studente> getElenco() {
		return elenco;
	}

	public void setElenco(LinkedList<Studente> elenco) {
		this.elenco = elenco;
	}

	@Override
	public String toString() {
		return "Studente_Titoli [elenco=" + elenco + "]";
	}

}
