
public class Cliente {
	
	private String codice;
	private String nome;
	private String cognome;
	private int punti;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String codice, String nome, String cognome, int punti) {
		this.codice = codice;
		this.nome = nome;
		this.cognome = cognome;
		this.punti = punti;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
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


	public int getPunti() {
		return punti;
	}


	public void setPunti(int punti) {
		this.punti = punti;
	}


	@Override
	public String toString() {
		return "codice: " + codice + ", nome: " + nome + ", cognome: " + cognome + ", punti: " + punti ;
	}
	
	

}
