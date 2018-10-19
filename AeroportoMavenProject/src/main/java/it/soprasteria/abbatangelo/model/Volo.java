package it.soprasteria.abbatangelo.model;

public class Volo {
	int idVolo;
	String giornoSet;
	String cittaPart;
	String cittaArr;
	String tipoAereo;
	int oraPartenza;
	int oraArrivo;

	public Volo(int idVolo, String giornoSet, String cittaPart, String cittaArr, String tipoAereo, int oraPartenza,
			int oraArrivo) {
		super();
		this.idVolo = idVolo;
		this.giornoSet = giornoSet;
		this.cittaPart = cittaPart;
		this.cittaArr = cittaArr;
		this.tipoAereo = tipoAereo;
		this.oraPartenza = oraPartenza;
		this.oraArrivo = oraArrivo;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}

	public String getGiornoSet() {
		return giornoSet;
	}

	public void setGiornoSet(String giornoSet) {
		this.giornoSet = giornoSet;
	}

	public String getCittaPart() {
		return cittaPart;
	}

	public void setCittaPart(String cittaPart) {
		this.cittaPart = cittaPart;
	}

	public String getCittaArr() {
		return cittaArr;
	}

	public void setCittaArr(String cittaArr) {
		this.cittaArr = cittaArr;
	}

	public String getTipoAereo() {
		return tipoAereo;
	}

	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}

	public int getOraPartenza() {
		return oraPartenza;
	}

	public void setOraPartenza(int oraPartenza) {
		this.oraPartenza = oraPartenza;
	}

	public int getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(int oraArrivo) {
		this.oraArrivo = oraArrivo;
	}

	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + ", giornoSet=" + giornoSet + ", cittaPart=" + cittaPart + ", cittaArr="
				+ cittaArr + ", tipoAereo=" + tipoAereo + ", oraPartenza=" + oraPartenza + ", oraArrivo=" + oraArrivo
				+ "]";
	}
	
	

}
