package it.sopra.emanuele.model;

public class Volo {
	int idvolo;
	String giornosett;
	String cittapart;
	String cittaaarr;
	String tipoaereo;
	int orapartenza;
	int oraarrivo;
	public Volo(int idvolo, String giornosett, String cittapart, String cittaaarr, String tipoaereo, int orapartenza,
			int oraarrivo) {
		super();
		this.idvolo = idvolo;
		this.giornosett = giornosett;
		this.cittapart = cittapart;
		this.cittaaarr = cittaaarr;
		this.tipoaereo = tipoaereo;
		this.orapartenza = orapartenza;
		this.oraarrivo = oraarrivo;
	}
	public int getIdvolo() {
		return idvolo;
	}
	public void setIdvolo(int idvolo) {
		this.idvolo = idvolo;
	}
	public String getGiornosett() {
		return giornosett;
	}
	public void setGiornosett(String giornosett) {
		this.giornosett = giornosett;
	}
	public String getCittapart() {
		return cittapart;
	}
	public void setCittapart(String cittapart) {
		this.cittapart = cittapart;
	}
	public String getCittaaarr() {
		return cittaaarr;
	}
	public void setCittaaarr(String cittaaarr) {
		this.cittaaarr = cittaaarr;
	}
	public String getTipoaereo() {
		return tipoaereo;
	}
	public void setTipoaereo(String tipoaereo) {
		this.tipoaereo = tipoaereo;
	}
	public int getOrapartenza() {
		return orapartenza;
	}
	public void setOrapartenza(int orapartenza) {
		this.orapartenza = orapartenza;
	}
	public int getOraarrivo() {
		return oraarrivo;
	}
	public void setOraarrivo(int oraarrivo) {
		this.oraarrivo = oraarrivo;
	}
	@Override
	public String toString() {
		return "Volo [idvolo=" + idvolo + ", giornosett=" + giornosett + ", cittapart=" + cittapart + ", cittaaarr="
				+ cittaaarr + ", tipoaereo=" + tipoaereo + ", orapartenza=" + orapartenza + ", oraarrivo=" + oraarrivo
				+ "]";
	}
	

}
