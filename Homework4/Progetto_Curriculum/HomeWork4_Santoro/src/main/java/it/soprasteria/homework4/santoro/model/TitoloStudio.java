package it.soprasteria.homework4.santoro.model;

public class TitoloStudio {
	int codice;
	String descrizione;
	
	
	public TitoloStudio(int codice, String descrizione) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
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
	
	
	
	
	
}
