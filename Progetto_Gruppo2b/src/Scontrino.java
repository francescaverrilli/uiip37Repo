import java.util.LinkedList;

public class Scontrino {

	private String codiceScontrino;
	private Cliente cliente;
	private LinkedList<Prodotto> listaProdotti= new LinkedList<Prodotto>();
	private double importo;
	public Scontrino(String codiceScontrino, Cliente cliente, LinkedList<Prodotto> listaProdotti, double importo) {
		this.codiceScontrino = codiceScontrino;
		this.cliente = cliente;
		this.listaProdotti = listaProdotti;
		this.importo = importo;
	}
	
	public Scontrino() {}

	public String getCodiceScontrino() {
		return codiceScontrino;
	}

	public void setCodiceScontrino(String codiceScontrino) {
		this.codiceScontrino = codiceScontrino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LinkedList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}

	public void setListaProdotti(LinkedList<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	@Override
	public String toString() {
		return "Scontrino [codiceScontrino=" + codiceScontrino + ", cliente=" + cliente + ", listaProdotti="
				+ listaProdotti + ", importo=" + importo + "]";
	}
	
	
	
}
