package it.sopra.DeGennaro.model;

public class Aeroporto {
private String citta;
private String nazione;
private int numPiste;

public Aeroporto(String citta, String nazione, int numPiste) {
	this.citta = citta;
	this.nazione = nazione;
	this.numPiste = numPiste;
}

public String getCitta() {
	return citta;
}

public void setCitta(String citta) {
	this.citta = citta;
}

public String getNazione() {
	return nazione;
}

public void setNazione(String nazione) {
	this.nazione = nazione;
}

public int getNumPiste() {
	return numPiste;
}

public void setNumPiste(int numPiste) {
	this.numPiste = numPiste;
}

@Override
public String toString() {
	return "Aeroporto [citta=" + citta + ", nazione=" + nazione + ", numPiste=" + numPiste + "]";
}



}
