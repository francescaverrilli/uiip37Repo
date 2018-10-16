package eser1;

import java.util.LinkedList;

public class Avallone {
	private LinkedList<Persona> lista = new LinkedList<Persona>();

	public Avallone(LinkedList<Persona> lista) {
		super();
		this.lista = lista;
	}

	public LinkedList<Persona> getPers() {
		return lista;
	}

	public void setPers(LinkedList<Persona> pers) {
		this.lista = lista;
	}

	public Persona trovamin() {
		Persona p = null;
		for (int i = 0; i < this.lista.size() - 1; i++) {
			if (this.lista.get(i).getDatanascita().after(this.lista.get(i + 1).getDatanascita())) {
				p = this.lista.get(i);
			}

		}
		return p;
	}

	public Persona trovamax() {
		Persona p = null;
		for (int i = 0; i < this.lista.size() - 1; i++) {
			if (this.lista.get(i).getDatanascita().after(this.lista.get(i + 1).getDatanascita())) {
				p = this.lista.get(i + 1);
			}

		}
		return p;
	}

}
