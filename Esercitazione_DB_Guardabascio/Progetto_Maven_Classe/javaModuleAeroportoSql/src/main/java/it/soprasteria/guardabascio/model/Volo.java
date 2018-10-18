package it.soprasteria.guardabascio.model;

public class Volo {

	int idVolo;
	String giornoSett;
	String cittaPart;
	String cittaArr;
	String tipoAereo;
	int oraParteza;
	int oraArrivo;
	public Volo(int idVolo, String giornoSett, String cittaPart, String cittaArr, String tipoAereo, int oraParteza,
			int oraArrivo) {
		super();
		this.idVolo = idVolo;
		this.giornoSett = giornoSett;
		this.cittaPart = cittaPart;
		this.cittaArr = cittaArr;
		this.tipoAereo = tipoAereo;
		this.oraParteza = oraParteza;
		this.oraArrivo = oraArrivo;
	}
	
	public Volo() {}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}

	public String getGiornoSett() {
		return giornoSett;
	}

	public void setGiornoSett(String giornoSett) {
		this.giornoSett = giornoSett;
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

	public int getOraParteza() {
		return oraParteza;
	}

	public void setOraParteza(int oraParteza) {
		this.oraParteza = oraParteza;
	}

	public int getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(int oraArrivo) {
		this.oraArrivo = oraArrivo;
	}
	
	
	
}
