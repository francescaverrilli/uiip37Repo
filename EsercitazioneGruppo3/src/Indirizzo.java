
public class Indirizzo {
	private String via;
	private int numCivico;
	private String città;
	private String cap;
	private String provincia;
	private String regione;
	
	public Indirizzo(String via, int numCivico, String città, String cap, String provincia, String regione) {
		this.via = via;
		this.numCivico = numCivico;
		this.città = città;
		this.cap = cap;
		this.provincia = provincia;
		this.regione = regione;
		
		
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumCivico() {
		return numCivico;
	}

	public void setNumCivico(int numCivico) {
		this.numCivico = numCivico;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
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
		return "Indirizzo [via=" + via + ", numCivico=" + numCivico + ", città=" + città + ", cap=" + cap
				+ ", provincia=" + provincia + ", regione=" + regione + "]";
	}
	

}
