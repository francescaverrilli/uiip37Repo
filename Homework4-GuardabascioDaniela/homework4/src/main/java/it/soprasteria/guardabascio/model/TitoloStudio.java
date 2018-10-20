package it.soprasteria.guardabascio.model;

public class TitoloStudio {
	
	int codice;
	String descrizione;
	
	public TitoloStudio(int codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public TitoloStudio() {}

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
		return "Codice titolo di studio : " + codice + " - Descrizione : " + descrizione + "\n";
	}
	
	
	
	

}
