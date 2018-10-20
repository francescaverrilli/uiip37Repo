package it.soprasteria.homework4.santoro.model;

import java.sql.Date;

public class Istruzione {
	int codice;
	int candidato;
	int titoloStudio;
	String voto;
	Date data;
	String istituto;
	
	
	public Istruzione(int codice, int candidato, int titoloStudio, String voto, Date data,
			String istituto) {
		super();
		this.codice = codice;
		this.candidato = candidato;
		this.titoloStudio = titoloStudio;
		this.voto = voto;
		this.data = data;
		this.istituto = istituto;
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


	public int getTitoloStudio() {
		return titoloStudio;
	}


	public void setTitoloStudio(int titoloStudio) {
		this.titoloStudio = titoloStudio;
	}


	public String getVoto() {
		return voto;
	}


	public void setVoto(String voto) {
		this.voto = voto;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getIstituto() {
		return istituto;
	}


	public void setIstituto(String istituto) {
		this.istituto = istituto;
	}
	
	
	
	
	

}
