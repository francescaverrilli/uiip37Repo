package it.sopraSteriaSilvio.model;

public class Volo {
	
	private int id;
	private String giotnoSett;
	private String cittaPertenza;
	private String cittaArr;
	private String tipoAereo;
	private int oraPartenza;
	private int oraArrivo;
	
	private Volo() {
	}
	
	public Volo(int id, String giotnoSett, String cittaPertenza, String cittaArr, String tipoAereo, int oraPartenza,
			int oraArrivo) {
		super();
		this.id = id;
		this.giotnoSett = giotnoSett;
		this.cittaPertenza = cittaPertenza;
		this.cittaArr = cittaArr;
		this.tipoAereo = tipoAereo;
		this.oraPartenza = oraPartenza;
		this.oraArrivo = oraArrivo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGiotnoSett() {
		return giotnoSett;
	}

	public void setGiotnoSett(String giotnoSett) {
		this.giotnoSett = giotnoSett;
	}

	public String getCittaPertenza() {
		return cittaPertenza;
	}

	public void setCittaPertenza(String cittaPertenza) {
		this.cittaPertenza = cittaPertenza;
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
		return "Volo [id=" + id + ", giotnoSett=" + giotnoSett + ", cittaPertenza=" + cittaPertenza + ", cittaArr="
				+ cittaArr + ", tipoAereo=" + tipoAereo + ", oraPartenza=" + oraPartenza + ", oraArrivo=" + oraArrivo
				+ "]";
	}
}
