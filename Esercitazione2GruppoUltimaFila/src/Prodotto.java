
public class Prodotto {

	private String codiceProdotto;
	private String descrizione;
	private double costo;
	private int numPunti;
	
	
	public Prodotto(String codiceProdotto, String descrizione, double costo, int numPunti) {
		this.codiceProdotto = codiceProdotto;
		this.descrizione = descrizione;
		this.costo = costo;
		this.numPunti = numPunti;
	}


	public String getCodiceProdotto() {
		return codiceProdotto;
	}


	public void setCodiceProdotto(String codiceProdotto) {
		this.codiceProdotto = codiceProdotto;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public int getNumPunti() {
		return numPunti;
	}


	public void setNumPunti(int numPunti) {
		this.numPunti = numPunti;
	}


	@Override
	public String toString() {
		return "Prodotto [codiceProdotto=" + codiceProdotto + ", descrizione=" + descrizione + ", costo=" + costo
				+ ", numPunti=" + numPunti + "]";
	}
	
	
	
}

