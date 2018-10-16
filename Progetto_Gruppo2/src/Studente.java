import java.util.LinkedList;

public class Studente extends Persona {

	private int livelloLaurea;
	private String titoloStudio;
	private LinkedList<String> corsiFormazione;

	public Studente(String nome, String cognome, String dataNascita, Indirizzo indirizzo, int livelloLaurea,
			String titoloStudio, LinkedList<String> corsiFormazione) {
		super(nome, cognome, dataNascita, indirizzo);
		this.livelloLaurea = livelloLaurea;
		this.titoloStudio = titoloStudio;
		this.corsiFormazione = corsiFormazione;
	}

	public int getLivelloLaurea() {
		return livelloLaurea;
	}

	public void setLivelloLaurea(int livelloLaurea) {
		this.livelloLaurea = livelloLaurea;
	}

	public String getTitoloStudio() {
		return titoloStudio;
	}

	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}

	public LinkedList<String> getCorsiFormazione() {
		return corsiFormazione;
	}

	public void setCorsiFormazione(LinkedList<String> corsiFormazione) {
		this.corsiFormazione = corsiFormazione;
	}

	@Override
	public String toString() {
		return "Studente [livelloLaurea=" + livelloLaurea + ", titoloStudio=" + titoloStudio + ", corsiFormazione="
				+ corsiFormazione + "]";
	}

}
