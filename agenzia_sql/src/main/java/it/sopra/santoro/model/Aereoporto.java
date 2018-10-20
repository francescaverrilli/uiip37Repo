package it.sopra.santoro.model;

public class Aereoporto {
	String citta;
	String nazione;
	int Npiste;
	
	
	
	public Aereoporto(String citta, String nazione, int npiste) {
		super();
		this.citta = citta;
		this.nazione = nazione;
		Npiste = npiste;
	}



	public String getCitta() {
		return citta;
	}



	public void setCitta(String citta) {
		this.citta = citta;
	}



	public String getNazione() {
		return nazione;
	}



	public void setNazione(String nazione) {
		this.nazione = nazione;
	}



	public int getNpiste() {
		return Npiste;
	}



	public void setNpiste(int npiste) {
		Npiste = npiste;
	}
	
	
	
	
	

}
