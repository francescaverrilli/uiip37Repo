package it.sopra.caserta.model;

public class Istruzione {

	// istruzione (codice,candidato,titolo,voto,data,istituto)
	// VALUES (1,1,1,'95/110', '2017-12-14', 'Università degli studi del Sannio');

	private int codice, codCandidato, codTitolo;
	private String voto, data, istituto;

	public Istruzione(int codice, int codCandidato, int codTitolo, String voto, String data, String istituto) {
		this.codice = codice;
		this.codCandidato = codCandidato;
		this.codTitolo = codTitolo;
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

	public int getCodCandidato() {
		return codCandidato;
	}

	public void setCodCandidato(int codCandidato) {
		this.codCandidato = codCandidato;
	}

	public int getCodTitolo() {
		return codTitolo;
	}

	public void setCodTitolo(int codTitolo) {
		this.codTitolo = codTitolo;
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
		return "Istruzione [codice=" + codice + ", codCandidato=" + codCandidato + ", codTitolo=" + codTitolo
				+ ", voto=" + voto + ", data=" + data + ", istituto=" + istituto + "]";
	}

}
