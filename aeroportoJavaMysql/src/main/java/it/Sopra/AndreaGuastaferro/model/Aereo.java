package it.Sopra.AndreaGuastaferro.model;

public class Aereo {

	private String tipoAereo;
	private int nPass;
	private int quantMerce;
	
	public Aereo(String tipoAereo, int nPass, int quantMerce) {
		super();
		this.tipoAereo = tipoAereo;
		this.nPass = nPass;
		this.quantMerce = quantMerce;
	}

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

	public int getQuantMerce() {
		return quantMerce;
	}

	public void setQuantMerce(int quantMerce) {
		this.quantMerce = quantMerce;
	}

	@Override
	public String toString() {
		return "Aereo [tipoAereo=" + tipoAereo + ", nPass=" + nPass + ", quantMerce=" + quantMerce + "]";
	}
	


}
