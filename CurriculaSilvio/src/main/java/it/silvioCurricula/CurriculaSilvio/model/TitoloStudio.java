package it.silvioCurricula.CurriculaSilvio.model;

public class TitoloStudio {

	private int codice;
	private String descrizione;

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

	@Override
	public String toString() {
		return "TitoloStudio [codice=" + codice + ", descrizione=" + descrizione + "]";
	}

}
