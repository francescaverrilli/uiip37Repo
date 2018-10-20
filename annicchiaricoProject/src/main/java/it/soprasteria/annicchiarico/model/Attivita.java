package it.soprasteria.annicchiarico.model;

public class Attivita {
	
	private int codice; 
	private String mansione;
	
	
	
	public Attivita(int codice, String mansione) {
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
