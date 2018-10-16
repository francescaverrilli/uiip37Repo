import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	private String nome;
	private String cognome;
	private Date  dataNascita;
	private Indirizzo indirizzo;

	
	public Persona(String nome, String cognome, String dataNascita, Indirizzo indirizzo) throws ParseException {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascita);
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


	public Date getDataNascita() {
		return dataNascita;
	}





	public Indirizzo getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	
	
	
	
	
}
