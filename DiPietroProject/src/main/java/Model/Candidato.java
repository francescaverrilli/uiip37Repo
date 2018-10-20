package Model;

public class Candidato {

	private int codice;
	private String cognome;
	private String nome;
	private String viaresidenza;
	private String capresidenza;
	private String cittaresidenza;
	private String datanascita;
	private String luogonascita;

	public Candidato(int codice, String cognome, String nome, String viaresidenza, String capresidenza,
			String cittaresidenza, String datanascita, String luogonascita) {
		super();
		this.codice = codice;
		this.cognome = cognome;
		this.nome = nome;
		this.viaresidenza = viaresidenza;
		this.capresidenza = capresidenza;
		this.cittaresidenza = cittaresidenza;
		this.datanascita = datanascita;
		this.luogonascita = luogonascita;
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

	public String getCapresidenza() {
		return capresidenza;
	}

	public void setCapresidenza(String capresidenza) {
		this.capresidenza = capresidenza;
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

	public String getLuogonascita() {
		return luogonascita;
	}

	public void setLuogonascita(String luogonascita) {
		this.luogonascita = luogonascita;
	}

	@Override
	public String toString() {
		return "Candidato [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", viaresidenza="
				+ viaresidenza + ", capresidenza=" + capresidenza + ", cittaresidenza=" + cittaresidenza
				+ ", datanascita=" + datanascita + ", luogonascita=" + luogonascita + "]";
	}

}
