import java.util.Vector;

public class Studente extends Persona{
	
	private String titoloDiStudio;
	private int livelloLaurea;
	private Vector<String> corsiFormazione;

	public Studente(String nome, String cognome, String data_di_nascita, Indirizzo indirizzo,
			String titoloDiStudio, int livelloLaurea, Vector<String> corsiFormazione) {
		super(nome, cognome, data_di_nascita, indirizzo);
		this.titoloDiStudio=titoloDiStudio;
		this.livelloLaurea=livelloLaurea;
		this.corsiFormazione=corsiFormazione;
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

	public Vector<String> getCorsiFormazione() {
		return corsiFormazione;
	}

	public void setCorsiFormazione(Vector<String> corsiFormazione) {
		this.corsiFormazione = corsiFormazione;
	}

	@Override
	public String toString() {
		return "Studente [nome= "+ getNome()+" cognome= "+ getCognome()+"data_di_nascita= "+getData_di_nascita()+ "indirizzo= "+getNuovo_indirizzo()+" titoloDiStudio=" + titoloDiStudio + ", livelloLaurea=" + livelloLaurea + ", corsiFormazione="
				+corsiFormazione.toString() + "]";
	}
	
	

}
