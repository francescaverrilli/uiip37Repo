package Model;

public class Esperienza {

	private int codice;
	private int candidato;
	private int attivita;
	private String datainizio;
	private String datafine;
	private String azienda;

	public Esperienza(int codice, int candidato, int attivita, String datainizio, String datafine, String azienda) {
		super();
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
