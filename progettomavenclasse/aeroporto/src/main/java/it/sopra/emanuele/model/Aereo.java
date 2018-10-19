package it.sopra.emanuele.model;

public class Aereo {
	String tipo;
	int passegeri;
	int merci;
	public Aereo(String tipo, int passegeri, int merci) {
		super();
		this.tipo = tipo;
		this.passegeri = passegeri;
		this.merci = merci;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPassegeri() {
		return passegeri;
	}
	public void setPassegeri(int passegeri) {
		this.passegeri = passegeri;
	}
	public int getMerci() {
		return merci;
	}
	public void setMerci(int merci) {
		this.merci = merci;
	}
	@Override
	public String toString() {
		return "Aereo [tipo=" + tipo + ", passegeri=" + passegeri + ", merci=" + merci + "]";
	}
	
	
}
