
public class Indirizzo {
	private int distanza;
	private String via;
	private int numerocivvico;
	private int cap;
	private String citta;
	private String provincia;
	private String regione;
	
	public Indirizzo(int distanza, String via, int numerocivvico, int cap, String citta, String provincia,
			String regione) {
		super();
		this.distanza = distanza;
		this.via = via;
		this.numerocivvico = numerocivvico;
		this.cap = cap;
		this.citta = citta;
		this.provincia = provincia;
		this.regione = regione;
	}
	
	public Indirizzo() {
		
	}

	public int getDistanza() {
		return distanza;
	}

	public void setDistanza(int distanza) {
		this.distanza = distanza;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumerocivvico() {
		return numerocivvico;
	}

	public void setNumerocivvico(int numerocivvico) {
		this.numerocivvico = numerocivvico;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
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
	


}
