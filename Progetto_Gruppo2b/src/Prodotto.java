
public class Prodotto {
private int codProdotto;
private String descrizione;
private double costo;
private int numPunti;


public Prodotto(int codProdotto, String descrizione, double costo, int numPunti) {
	this.codProdotto = codProdotto;
	this.descrizione = descrizione;
	this.costo = costo;
	this.numPunti = numPunti;
}
public int getCodProdotto() {
	return codProdotto;
}
public void setCodProdotto(int codProdotto) {
	this.codProdotto = codProdotto;
}
public String getDescrizione() {
	return descrizione;
}
public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}
public double getCosto() {
	return costo;
}
public void setCosto(double costo) {
	this.costo = costo;
}
public int getNumPunti() {
	return numPunti;
}
public void setNumPunti(int numPunti) {
	this.numPunti = numPunti;
}
@Override
public String toString() {
	return "Prodotto [codProdotto=" + codProdotto + ", descrizione=" + descrizione + ", costo=" + costo + ", numPunti="
			+ numPunti + "]";
}


}
