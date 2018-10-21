package it.Carlo.Soprasteria.Curricula.model;

public class Telefono {
 private String numero;
 private int candidato;
 
public Telefono(String numero, int candidato) {
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

@Override
public String toString() {
	return "Telefono [numero=" + numero + ", candidato=" + candidato + "]";
}
 
 
}
