package eser1;

import java.util.LinkedList;

public class Studente extends Persona {
	private int livello;
	private String titolo;
	private LinkedList<String> corsi;

	public Studente(String nome, String cognome, String datanascita, Indirizzo indirizzo, int livello, String titolo) {
		super(nome, cognome, datanascita, indirizzo);
		this.livello = livello;
		this.titolo = titolo;
		this.corsi = new LinkedList<String>();

	}

	public void aggiungiCorso(String corso) {
		this.corsi.add(corso);
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LinkedList<String> getCorsi() {
		return corsi;
	}

	public void setCorsi(LinkedList<String> corsi) {
		this.corsi = corsi;
	}

	@Override
	public String toString() {
		return super.toString() + "\nlivello: " + livello + "\ntitolo: " + titolo + "\ncorsi: " + corsi;
	}

}
