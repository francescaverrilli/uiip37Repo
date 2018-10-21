package homework4.Guastaferro.model;

public class TitoloDiStudio {

	private int codice;
	private String descrizione;
	
	public TitoloDiStudio(int codice, String descrizione) {
		this.codice=codice;
		this.descrizione=descrizione;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "TitoloDiStudio [codice=" + codice + ", descrizione=" + descrizione + "]";
	}
	
	
	
}
