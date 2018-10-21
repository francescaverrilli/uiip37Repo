package it.sopra.caserta.model;

public class Candidato {
	
	private int codice;
	private String cognome, nome, viaIndirizzo, cap, citta, dataNascita, luogoNascita;

	public Candidato(int codice, String cognome, String nome, String viaIndirizzo, String cap, String citta,
			String dataNascita, String luogoNascita) {
	
		this.codice = codice;
		this.cognome = cognome;
		this.nome = nome;
		this.viaIndirizzo = viaIndirizzo;
		this.cap = cap;
		this.citta = citta;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}

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

	public String getViaIndirizzo() {
		return viaIndirizzo;
	}

	public void setViaIndirizzo(String viaIndirizzo) {
		this.viaIndirizzo = viaIndirizzo;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
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
		return "\nCodice: " + codice + ", Cognome: " + cognome + ", Nome: " + nome + ", Via: "
				+ viaIndirizzo + ", CAP: " + cap + ", Citta: " + citta + ", Data di nascita: " + dataNascita
				+ ", Luogo di nascita: " + luogoNascita+ "\n";
	}
	
	

}
