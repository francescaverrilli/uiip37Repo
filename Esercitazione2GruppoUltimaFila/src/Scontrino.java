import java.util.LinkedList;

public class Scontrino {
	
	private String codice;
	private double importo;
	private Cliente c;
	private LinkedList<Prodotto> prodotti;
	
	public Scontrino(String codice, double importo, Cliente c, LinkedList<Prodotto> prodotti) {
		super();
		this.codice = codice;
		this.importo = importo;
		this.c = c;
		this.prodotti = prodotti;
	}


	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public LinkedList<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(LinkedList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}


	@Override
	public String toString() {
		return "Scontrino [codice=" + codice + ", importo=" + importo + ", cliente=" + c.getCodiceCartaFidelity() 
			+ ", \nprodotti=" + prodotti + "]";
	}
	
	
	
	
	
	
	

}
