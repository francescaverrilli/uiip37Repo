package it.sopra.caserta.model;

public class Telefono {

	private String numero;
	private int codCandidato;

	public Telefono(String numero, int codCandidato) {
		this.numero = numero;
		this.codCandidato = codCandidato;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodCandidato() {
		return codCandidato;
	}

	public void setCodCandidato(int codCandidato) {
		this.codCandidato = codCandidato;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", codCandidato=" + codCandidato + "]";
	}

}
