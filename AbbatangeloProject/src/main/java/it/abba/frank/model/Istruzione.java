package it.abba.frank.model;

public class Istruzione {
	int codice;
	int candidato;
	int titolo;
	String voto;
	String data;
	String istituto;

	public Istruzione(int codice, int candidato, int titolo, String voto, String data, String istituto) {
		super();
		this.codice = codice;
		this.candidato = candidato;
		this.titolo = titolo;
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

	public int getTitolo() {
		return titolo;
	}

	public void setTitolo(int titolo) {
		this.titolo = titolo;
	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getIstituto() {
		return istituto;
	}

	public void setIstituto(String istituto) {
		this.istituto = istituto;
	}

	@Override
	public String toString() {
		return "Istruzione [codice=" + codice + ", candidato=" + candidato + ", titolo=" + titolo + ", voto=" + voto
				+ ", data=" + data + ", istituto=" + istituto + "]";
	}

}
