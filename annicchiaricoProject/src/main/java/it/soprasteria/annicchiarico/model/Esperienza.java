package it.soprasteria.annicchiarico.model;

public class Esperienza {
	
	private int codice; 
	private String candidato; 
	private String attivita; 
	private String datainizio; 
	private String datafine;
	private String azienda;
	
	
	public Esperienza(int codice, String candidato, String attivita, String datainizio, String datafine,
			String azienda) {
		
		this.codice = codice;
		this.candidato = candidato;
		this.attivita = attivita;
		this.datainizio = datainizio;
		this.datafine = datafine;
		this.azienda = azienda;
		
		
		
	}


	public int getCodice() {
		return codice;
	}


	public void setCodice(int codice) {
		this.codice = codice;
	}


	public String getCandidato() {
		return candidato;
	}


	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}


	public String getAttivita() {
		return attivita;
	}


	public void setAttivita(String attivita) {
		this.attivita = attivita;
	}


	public String getDatainizio() {
		return datainizio;
	}


	public void setDatainizio(String datainizio) {
		this.datainizio = datainizio;
	}


	public String getDatafine() {
		return datafine;
	}


	public void setDatafine(String datafine) {
		this.datafine = datafine;
	}


	public String getAzienda() {
		return azienda;
	}


	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}


	@Override
	public String toString() {
		return "Esperienza [codice=" + codice + ", candidato=" + candidato + ", attivita=" + attivita + ", datainizio="
				+ datainizio + ", datafine=" + datafine + ", azienda=" + azienda + "]";
	} 
	
	
	
	
}
