package it.sopraSteriaSilvio.model;

public class Aeroporto {

	private String citta;
	private String nazione;
	private int nPiste;
	
	public Aeroporto() {
		
	}
	
	public Aeroporto(String citta, String nazione, int nPiste) {
		this.citta = citta;
		this.nazione = nazione;
		this.nPiste = nPiste;
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

	public int getnPiste() {
		return nPiste;
	}

	public void setnPiste(int nPiste) {
		this.nPiste = nPiste;
	}

	@Override
	public String toString() {
		return "Aeroporto [citta=" + citta + ", nazione=" + nazione + ", nPiste=" + nPiste + "]";
	}
	
	
	
}
