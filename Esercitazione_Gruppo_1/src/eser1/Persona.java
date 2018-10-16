package eser1;

public class Persona {
private String nome;
private String cognome;
private String datanascita; 
private Indirizzo indirizzo;


public Persona(String nome, String cognome, String datanascita, Indirizzo indirizzo) {
	this.nome = nome;
	this.cognome = cognome;
	this.datanascita = datanascita;
	this.indirizzo = indirizzo;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCognome() {
	return cognome;
}


public void setCognome(String cognome) {
	this.cognome = cognome;
}


public String getDatanascita() {
	return datanascita;
}


public void setDatanascita(String datanascita) {
	this.datanascita = datanascita;
}


public Indirizzo getIndirizzo() {
	return indirizzo;
}


public void setIndirizzo(Indirizzo indirizzo) {
	this.indirizzo = indirizzo;
}


@Override
public String toString() {
	return "Persona [nome=" + nome + ", cognome=" + cognome + ", datanascita=" + datanascita + ", indirizzo="
			+ indirizzo + "]";
}


}
