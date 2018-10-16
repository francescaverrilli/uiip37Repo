package eser1;

public class Indirizzo {

	private String via;
	private int civico;
	private String città;
	private int CAP;
	private String provincia;
	private String regione;

	public Indirizzo() {
	}

	public Indirizzo(String via, int civico, String città, int cAP, String provincia, String regione) {
		super();
		this.via = via;
		this.civico = civico;
		this.città = città;
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

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
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
		return "Indirizzo [via=" + via + ", civico=" + civico + ", città=" + città + ", CAP=" + CAP + ", provincia="
				+ provincia + ", regione=" + regione + "]";
	}

}
