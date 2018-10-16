
public class Persona {

	private String nome;
	private String cognome;
	private String dataNascita;
	private Indirizzo indirizzo;

	
	public Persona(String nome, String cognome, String dataNascita, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.indirizzo = indirizzo;
	}


	public Persona() {}


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


	public String getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}


	public Indirizzo getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	
	
	
	
	
}
