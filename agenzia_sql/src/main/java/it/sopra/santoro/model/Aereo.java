package it.sopra.santoro.model;

public class Aereo {
	
	String tipoAereo;
	int Npass;
	int Quantit‡Merci;
	
	
	public Aereo(String tipoAereo, int npass, int quantit‡Merci) {
		super();
		this.tipoAereo = tipoAereo;
		Npass = npass;
		Quantit‡Merci = quantit‡Merci;
	}


	public String getTipoAereo() {
		return tipoAereo;
	}


	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}


	public int getNpass() {
		return Npass;
	}


	public void setNpass(int npass) {
		Npass = npass;
	}


	public int getQuantit‡Merci() {
		return Quantit‡Merci;
	}


	public void setQuantit‡Merci(int quantit‡Merci) {
		Quantit‡Merci = quantit‡Merci;
	}
	
	
	
	
	

}
