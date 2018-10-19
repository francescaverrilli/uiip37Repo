package it.sopra.emanuele.model;

public class Aeroporto {
	String citta;
	String nazione;
	int nposti;
	public Aeroporto(String citta, String nazione, int nposti) {
		super();
		this.citta = citta;
		this.nazione = nazione;
		this.nposti = nposti;
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
	public int getNposti() {
		return nposti;
	}
	public void setNposti(int nposti) {
		this.nposti = nposti;
	}
	@Override
	public String toString() {
		return "Aeroporto [citta=" + citta + ", nazione=" + nazione + ", nposti=" + nposti + "]";
	}
	

}
