package it.soprasteria.guardabascio.model;

public class Aeroporto {

	String citta;
	String nazione;
	int npiste;
	
	public Aeroporto(String citta, String nazione, int npiste) {
		super();
		this.citta = citta;
		this.nazione = nazione;
		this.npiste = npiste;
	}
	
	public Aeroporto() {}

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
		return npiste;
	}

	public void setNpiste(int npiste) {
		this.npiste = npiste;
	}

	@Override
	public String toString() {
		return "Aeroporto [citta=" + citta + ", nazione=" + nazione + ", npiste=" + npiste + "]";
	}
	
	

}
