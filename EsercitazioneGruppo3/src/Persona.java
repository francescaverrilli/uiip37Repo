
public class Persona {

	private String nome;
	private String cognome;
	private String data_di_nascita;
	private Indirizzo nuovo_indirizzo;
	
	public Persona(String nome, String cognome, String data_di_nascita , Indirizzo indirizzo) {
		
		this.nome=nome;
		this.cognome=cognome;
		this.data_di_nascita=data_di_nascita;
		this.nuovo_indirizzo=indirizzo;
		
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

	public String getData_di_nascita() {
		return data_di_nascita;
	}

	public void setData_di_nascita(String data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}

	public Indirizzo getNuovo_indirizzo() {
		return nuovo_indirizzo;
	}

	public void setNuovo_indirizzo(Indirizzo nuovo_indirizzo) {
		this.nuovo_indirizzo = nuovo_indirizzo;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", data_di_nascita=" + data_di_nascita +
				"\n" + nuovo_indirizzo + "]";
	}

	
	
}
