package it.silvioCurricula.model;

public class Esperienza {

	private int codice;
	private int candidato;
	private int attività;
	private String dataInizio;
	private String dataFine;
	private String azienda;
	
	
	public Esperienza(int codice, int candidato, int attività, String dataInizio, String dataFine, String azienda) {
		super();
		this.codice = codice;
		this.candidato = candidato;
		this.attività = attività;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.azienda = azienda;
	}


	public int getCodice() {
		return codice;
	}


	public void setCodice(int codice) {
		this.codice = codice;
	}


	public int getCandidato() {
		return candidato;
	}


	public void setCandidato(int candidato) {
		this.candidato = candidato;
	}


	public int getAttività() {
		return attività;
	}


	public void setAttività(int attività) {
		this.attività = attività;
	}


	public String getDataInizio() {
		return dataInizio;
	}


	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}


	public String getDataFine() {
		return dataFine;
	}


	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}


	public String getAzienda() {
		return azienda;
	}


	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}


	@Override
	public String toString() {
		return "Esperienza [codice=" + codice + ", candidato=" + candidato + ", attività=" + attività + ", dataInizio="
				+ dataInizio + ", dataFine=" + dataFine + ", azienda=" + azienda + "]";
	}
	
	
	
}
