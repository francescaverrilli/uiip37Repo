package it.soprasteria.guardabascio.model;

import java.sql.Date;

public class Candidato {
	
	int codice;
	String cognome;
	String nome;
	String viaresidenza;
	String capResidenza;
	String cittaResidenza;
	String dataNascita;
	String luogoNascita;
	public Candidato(int codice, String cognome, String nome, String viaresidenza, String capResidenza,
			String cittaResidenza, String dataNascita, String luogoNascita) {
		super();
		this.codice = codice;
		this.cognome = cognome;
		this.nome = nome;
		this.viaresidenza = viaresidenza;
		this.capResidenza = capResidenza;
		this.cittaResidenza = cittaResidenza;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}
	public Candidato() {}
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getViaresidenza() {
		return viaresidenza;
	}
	public void setViaresidenza(String viaresidenza) {
		this.viaresidenza = viaresidenza;
	}
	public String getCapResidenza() {
		return capResidenza;
	}
	public void setCapResidenza(String capResidenza) {
		this.capResidenza = capResidenza;
	}
	public String getCittaResidenza() {
		return cittaResidenza;
	}
	public void setCittaResidenza(String cittaResidenza) {
		this.cittaResidenza = cittaResidenza;
	}
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	@Override
	public String toString() {
		return "Codice candidato : " + codice + " -  Cognome : " + cognome + " - Nome : " + nome + " -  Via : "
				+ viaresidenza + " - Cap : " + capResidenza + " - Citta : " + cittaResidenza
				+ " - Data Nascita : " + dataNascita + " - Luogo Nascita : " + luogoNascita;
	}

	
	
}
