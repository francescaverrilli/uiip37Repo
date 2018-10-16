package eser1;

public class Indirizzo {

	private String via;
	private int civico;
	private String citt�;
	private int CAP;
	private String provincia;
	private String regione;

	public Indirizzo() {
	}

	public Indirizzo(String via, int civico, String citt�, int cAP, String provincia, String regione) {
		super();
		this.via = via;
		this.civico = civico;
		this.citt� = citt�;
		CAP = cAP;
		this.provincia = provincia;
		this.regione = regione;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		this.civico = civico;
	}

	public String getCitt�() {
		return citt�;
	}

	public void setCitt�(String citt�) {
		this.citt� = citt�;
	}

	public int getCAP() {
		return CAP;
	}

	public void setCAP(int cAP) {
		CAP = cAP;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", civico=" + civico + ", citt�=" + citt� + ", CAP=" + CAP + ", provincia="
				+ provincia + ", regione=" + regione + "]";
	}

}
