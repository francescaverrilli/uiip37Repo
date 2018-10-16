package eser1;

import java.util.Date;

public class Persona {
	private String nome;
	private String cognome;
	private Date datanascita;
	private Indirizzo indirizzo;

	public Persona(String nome, String cognome, Date datanascita, Indirizzo indirizzo) {
		super();
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

	public Date getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(Date datanascita) {
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
		return "{\nNome: " + nome + "\nCognome: " + cognome + "\nDatanascita: " + datanascita + "\nIndirizzo: "
				+ indirizzo + "\n}";
	}

}
