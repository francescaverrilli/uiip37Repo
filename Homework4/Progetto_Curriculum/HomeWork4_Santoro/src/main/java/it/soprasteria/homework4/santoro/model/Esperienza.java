package it.soprasteria.homework4.santoro.model;

import java.sql.Date;

public class Esperienza {
	
	int codice;
	int candidato;
	int attivita;
	Date dataInizio;
	Date dataFine;
	String azienda;
	
	
	public Esperienza(int codice, int candidato, int attivita, Date dataInizio, Date dataFine,
			String azienda) {
		super();
		this.codice = codice;
		this.candidato = candidato;
		this.attivita = attivita;
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


	public int getAttivita() {
		return attivita;
	}


	public void setAttivita(int attivita) {
		this.attivita = attivita;
	}


	public Date getDataInizio() {
		return dataInizio;
	}


	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}


	public Date getDataFine() {
		return dataFine;
	}


	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}


	public String getAzienda() {
		return azienda;
	}


	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}
	
	
	
	

}
