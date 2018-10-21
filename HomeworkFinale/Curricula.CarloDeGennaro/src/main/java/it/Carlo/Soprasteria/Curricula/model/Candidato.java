package it.Carlo.Soprasteria.Curricula.model;

public class Candidato {
	private int codice;
	private String cognome;
	private String nome;
	private String viaResidenza;
	private String capResidenza;
	private String cittaResidenza;
	private String dataNascita;
	private String luogoNascita;
	
	public Candidato(int codice, String cognome, String nome, String viaResidenza, String capResidenza,
			String cittaResidenza, String dataNascita, String luogoNascita) {
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
	
	public String getCittaResidenza() {
		return cittaResidenza;
	}
	public void setCittaResidenza(String cittaResidenza) {
		this.cittaResidenza = cittaResidenza;
	}
	@Override
	public String toString() {
		return "Candidato [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", viaResidenza="
				+ viaResidenza + ", capResidenza=" + capResidenza + ", cittaResidenza=" + cittaResidenza
				+ ", dataNascita=" + dataNascita + ", luogoNascita=" + luogoNascita + "]";
	}

	
}
