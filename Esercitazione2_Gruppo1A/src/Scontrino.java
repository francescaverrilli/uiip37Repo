import java.util.LinkedList;

public class Scontrino {
	private String codiceScontrino;
	private Cliente cliente;
	private LinkedList<Prodotto> lista;
	private double importo;

	public Scontrino(String codiceScontrino, Cliente cliente) {
		this.codiceScontrino = codiceScontrino;
		this.cliente = cliente;
		this.lista = new LinkedList<Prodotto>();
		this.importo = 0;
	}

	public void aggiungiProdotto(Prodotto p) {
		this.lista.add(p);
		this.importo = this.importo + p.getCosto();
	}

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

	public LinkedList<Prodotto> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Prodotto> lista) {
		this.lista = lista;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	@Override
	public String toString() {
		return "Scontrino {\ncodiceScontrino=" + codiceScontrino + "\ncliente=" + cliente + "\nlista=" + lista
				+ "\nimporto=" + importo + "\n}";
	}

}
