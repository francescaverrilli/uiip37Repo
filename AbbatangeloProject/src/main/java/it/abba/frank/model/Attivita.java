package it.abba.frank.model;

public class Attivita {
	int codice;
	String mansione;

	public Attivita(int codice, String mansione) {
		super();
		this.codice = codice;
		this.mansione = mansione;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getMansione() {
		return mansione;
	}

	public void setMansione(String mansione) {
		this.mansione = mansione;
	}

	@Override
	public String toString() {
		return "Attivita [codice=" + codice + ", mansione=" + mansione + "]";
	}

}
