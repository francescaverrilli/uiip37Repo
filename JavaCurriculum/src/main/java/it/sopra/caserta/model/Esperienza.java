package it.sopra.caserta.model;

public class Esperienza {

	private int codice, codCandidato, codAttivita;
	private String dataInizio, dataFine, azienda;

	public Esperienza(int codice, int codCandidato, int codAttivita, String dataInizio, String dataFine,
			String azienda) {
		this.codice = codice;
		this.codCandidato = codCandidato;
		this.codAttivita = codAttivita;
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

	public int getCodCandidato() {
		return codCandidato;
	}

	public void setCodCandidato(int codCandidato) {
		this.codCandidato = codCandidato;
	}

	public int getCodAttivita() {
		return codAttivita;
	}

	public void setCodAttivita(int codAttivita) {
		this.codAttivita = codAttivita;
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
		return "Esperienza [codice=" + codice + ", codCandidato=" + codCandidato + ", codAttivita=" + codAttivita
				+ ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", azienda=" + azienda + "]";
	}

}
