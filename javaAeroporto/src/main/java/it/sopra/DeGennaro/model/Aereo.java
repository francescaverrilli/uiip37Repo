package it.sopra.DeGennaro.model;

public class Aereo {
private String nome;
private int numPasseggeri;
private int quantitaMerci;

public Aereo(String nome, int numPasseggeri, int quantitaMerci) {
	this.nome = nome;
	this.numPasseggeri = numPasseggeri;
	this.quantitaMerci = quantitaMerci;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getNumPasseggeri() {
	return numPasseggeri;
}

public void setNumPasseggeri(int numPasseggeri) {
	this.numPasseggeri = numPasseggeri;
}

public int getQuantitaMerci() {
	return quantitaMerci;
}

public void setQuantitaMerci(int quantitaMerci) {
	this.quantitaMerci = quantitaMerci;
}

@Override
public String toString() {
	return "Aereo [nome=" + nome + ", numPasseggeri=" + numPasseggeri + ", quantitaMerci=" + quantitaMerci + "]";
}


}
