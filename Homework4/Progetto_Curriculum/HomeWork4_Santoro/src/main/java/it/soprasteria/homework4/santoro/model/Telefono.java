package it.soprasteria.homework4.santoro.model;

public class Telefono {
	
	String numero;
	int candidato;
	
	
	public Telefono(String numero, int candidato) {
		super();
		this.numero = numero;
		this.candidato = candidato;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public int getCandidato() {
		return candidato;
	}


	public void setCandidato(int candidato) {
		this.candidato = candidato;
	}
	
	
	
	

}
