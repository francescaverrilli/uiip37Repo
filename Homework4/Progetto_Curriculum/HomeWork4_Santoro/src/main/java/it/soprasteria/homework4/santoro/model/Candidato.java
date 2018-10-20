package it.soprasteria.homework4.santoro.model;


public class Candidato {
	
	int codice;
	String cognome;
	String nome;
	String viaResidenza;
	String capResidenza;
	String cittaResidenza;
	String dataNascita;
	String luogoNascita;
	
	
	public Candidato(int codice, String cognome, String nome, String viaResidenza, String capResidenza,
			String cittaResidenza, String dataNascita, String luogoNascita) {
		super();
		this.codice = codice;
		this.cognome = cognome;
		this.nome = nome;
		this.viaResidenza = viaResidenza;
		this.capResidenza = capResidenza;
		this.cittaResidenza = cittaResidenza;
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


	public String getViaResidenza() {
		return viaResidenza;
	}


	public void setViaResidenza(String viaResidenza) {
		this.viaResidenza = viaResidenza;
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
		return "Candidato [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", viaResidenza="
				+ viaResidenza + ", capResidenza=" + capResidenza + ", cittaResidenza=" + cittaResidenza
				+ ", dataNascita=" + dataNascita + ", luogoNascita=" + luogoNascita + "]"+"\n";
	}
	
	
	
	

}
