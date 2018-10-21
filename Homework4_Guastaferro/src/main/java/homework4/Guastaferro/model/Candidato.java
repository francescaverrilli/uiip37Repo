package homework4.Guastaferro.model;

public class Candidato {

	private int codice;
	private String cognome;
	private String nome;
	private String viaresidenza;
	private String cap;
	private String cittaresidenza;
	private String datanascita;
	private String luogodinascita;
	
	public Candidato(int codice, String cognome, String nome, String viaresidenza, String cap, String cittaresidenza, String datanascita, String luogodinascita) {
		this.codice=codice;
		this.cognome=cognome;
		this.nome=nome;
		this.viaresidenza=viaresidenza;
		this.cap=cap;
		this.cittaresidenza=cittaresidenza;
		this.datanascita=datanascita;
		this.luogodinascita=luogodinascita;

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

	public String getViaresidenza() {
		return viaresidenza;
	}

	public void setViaresidenza(String viaresidenza) {
		this.viaresidenza = viaresidenza;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCittaresidenza() {
		return cittaresidenza;
	}

	public void setCittaresidenza(String cittaresidenza) {
		this.cittaresidenza = cittaresidenza;
	}

	public String getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(String datanascita) {
		this.datanascita = datanascita;
	}

	public String getLuogodinascita() {
		return luogodinascita;
	}

	public void setLuogodinascita(String luogodinascita) {
		this.luogodinascita = luogodinascita;
	}



	@Override
	public String toString() {
		return "Candidato [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", viaresidenza="
				+ viaresidenza + ", cap=" + cap + ", cittaresidenza=" + cittaresidenza + ", datanascita=" + datanascita
				+ ", luogodinascita=" + luogodinascita + "]";
	}


	
	
}
