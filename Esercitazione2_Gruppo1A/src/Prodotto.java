
public class Prodotto {
	private String codice;
	private String descrizione;
	private float costo;
	private int npunti;
	public Prodotto(String codice, String descrizione, float costo, int npunti) {
	
		this.codice = codice;
		this.descrizione = descrizione;
		this.costo = costo;
		this.npunti = npunti;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public int getNpunti() {
		return npunti;
	}
	public void setNpunti(int npunti) {
		this.npunti = npunti;
	}
	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", descrizione=" + descrizione + ", costo=" + costo + ", npunti=" + npunti
				+ "]";
	}
	
	
	

}
