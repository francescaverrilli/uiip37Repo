
public class Cliente {

	private String codiceCartaFidelity;
	private String nome;
	private String cognome;
	private int numeroPunti;

	public Cliente(String codiceCartaFidelity, String nome, String cognome, int numeroPunti) {
		this.codiceCartaFidelity = codiceCartaFidelity;
		this.nome = nome;
		this.cognome = cognome;
		this.numeroPunti = numeroPunti;
	}

	public String getCodiceCartaFidelity() {
		return codiceCartaFidelity;
	}

	public void setCodiceCartaFidelity(String codiceCartaFidelity) {
		this.codiceCartaFidelity = codiceCartaFidelity;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumeroPunti() {
		return numeroPunti;
	}

	public void setNumeroPunti(int numeroPunti) {
		this.numeroPunti = numeroPunti;
	}

	@Override
	public String toString() {
		return "Cliente [codiceCartaFidelity=" + codiceCartaFidelity + ", nome=" + nome + ", cognome=" + cognome
				+ ", numeroPunti=" + numeroPunti + "]";
	}

}
