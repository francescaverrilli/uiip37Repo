import java.util.LinkedList;

public class Studente extends Persona{
	
	private String titoloDiStudio;
	private int livelloLaurea;
	private LinkedList<String> corsiFormazione;

	public Studente(String nome, String cognome, String data_di_nascita, Indirizzo indirizzo,
			String titoloDiStudio, int livelloLaurea, LinkedList<String> corsiFormazione) {
		super(nome, cognome, data_di_nascita, indirizzo);

	}

	public String getTitoloDiStudio() {
		return titoloDiStudio;
	}

	public void setTitoloDiStudio(String titoloDiStudio) {
		this.titoloDiStudio = titoloDiStudio;
	}

	public int getLivelloLaurea() {
		return livelloLaurea;
	}

	public void setLivelloLaurea(int livelloLaurea) {
		this.livelloLaurea = livelloLaurea;
	}

	public LinkedList<String> getCorsiFormazione() {
		return corsiFormazione;
	}

	public void setCorsiFormazione(LinkedList<String> corsiFormazione) {
		this.corsiFormazione = corsiFormazione;
	}

	@Override
	public String toString() {
		return "Studente [titoloDiStudio=" + titoloDiStudio + ", livelloLaurea=" + livelloLaurea + ", corsiFormazione="
				+ corsiFormazione + "]";
	}
	
	
	

}
