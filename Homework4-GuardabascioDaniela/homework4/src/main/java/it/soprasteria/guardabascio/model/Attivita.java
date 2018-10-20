package it.soprasteria.guardabascio.model;

public class Attivita {

	int codicee;
	String mansione;
	
	public Attivita(int codicee, String mansione) {
		this.codicee = codicee;
		this.mansione = mansione;
	}
	
	public Attivita() {}

	public int getCodicee() {
		return codicee;
	}

	public void setCodicee(int codicee) {
		this.codicee = codicee;
	}

	public String getMansione() {
		return mansione;
	}

	public void setMansione(String mansione) {
		this.mansione = mansione;
	}

	@Override
	public String toString() {
		return "Codice attivita : " + codicee + "-  mansione : " + mansione + "\n";
	}
	
	
	
	
	
}
