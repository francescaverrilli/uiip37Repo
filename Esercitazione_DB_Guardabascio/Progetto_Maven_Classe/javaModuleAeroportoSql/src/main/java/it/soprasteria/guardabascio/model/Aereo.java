package it.soprasteria.guardabascio.model;

public class Aereo {
	String tipoAereo;
	int nPass;
	int quantitaMeerci;
	
	public Aereo(String tipoAereo, int nPass, int quantitaMerci) {
		super();
		this.tipoAereo = tipoAereo;
		this.nPass = nPass;
		this.quantitaMeerci = quantitaMerci;
	}
	
	public Aereo() {}
	public String getTipoAereo() {
		return tipoAereo;
	}
	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}
	public int getnPass() {
		return nPass;
	}
	public void setnPass(int nPass) {
		this.nPass = nPass;
	}
	public int getQuantitaMerci() {
		return quantitaMeerci;
	}
	public void setQuantitaMerci(int quantitaMerci) {
		this.quantitaMeerci = quantitaMerci;
	}
	
	
}
