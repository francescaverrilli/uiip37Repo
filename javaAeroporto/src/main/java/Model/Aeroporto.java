package Model;

public class Aeroporto {
	
	private String citt� ;
	private String nazione ;
	private int npiste;
	
	public Aeroporto(String citt�, String nazione, int npiste) {
		super();
		this.citt� = citt�;
		this.nazione = nazione;
		this.npiste = npiste;
	}
	public String getCitt�() {
		return citt�;
	}
	public void setCitt�(String citt�) {
		this.citt� = citt�;
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
		return "Aeroporto [citt�=" + citt� + ", nazione=" + nazione + ", npiste=" + npiste + "]";
	}
	
	
}
