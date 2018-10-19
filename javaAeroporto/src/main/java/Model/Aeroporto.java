package Model;

public class Aeroporto {
	
	private String città ;
	private String nazione ;
	private int npiste;
	
	public Aeroporto(String città, String nazione, int npiste) {
		super();
		this.città = città;
		this.nazione = nazione;
		this.npiste = npiste;
	}
	public String getCittà() {
		return città;
	}
	public void setCittà(String città) {
		this.città = città;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public int getNpiste() {
		return npiste;
	}
	public void setNpiste(int npiste) {
		this.npiste = npiste;
	}
	@Override
	public String toString() {
		return "Aeroporto [città=" + città + ", nazione=" + nazione + ", npiste=" + npiste + "]";
	}
	
	
}
