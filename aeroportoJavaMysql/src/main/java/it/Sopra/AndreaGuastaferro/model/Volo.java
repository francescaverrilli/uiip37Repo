package it.Sopra.AndreaGuastaferro.model;

public class Volo {

	private int id;
	private String giorno;
	private String cittaDarrivo;
	private String cittaDipartenza;
	private String tipoAereo;
	private int ora_partenza;
	private int ora_arrivo;
	
	public Volo(int id, String giorno, String cittaDarrivo, String cittaDipartenza, String tipoAereo,
			int ora_partenza, int ora_arrivo) {
		super();
		this.id = id;
		this.giorno = giorno;
		this.cittaDarrivo = cittaDarrivo;
		this.cittaDipartenza = cittaDipartenza;
		this.tipoAereo = tipoAereo;
		this.ora_partenza = ora_partenza;
		this.ora_arrivo = ora_arrivo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGiorno() {
		return giorno;
	}
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	public String getCittaDarrivo() {
		return cittaDarrivo;
	}
	public void setCittaDarrivo(String cittaDarrivo) {
		this.cittaDarrivo = cittaDarrivo;
	}
	public String getCittaDipartenza() {
		return cittaDipartenza;
	}
	public void setCittaDipartenza(String cittaDipartenza) {
		this.cittaDipartenza = cittaDipartenza;
	}
	public String getTipoAereo() {
		return tipoAereo;
	}
	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}
	public int getOra_partenza() {
		return ora_partenza;
	}
	public void setOra_partenza(int ora_partenza) {
		this.ora_partenza = ora_partenza;
	}
	public int getOra_arrivo() {
		return ora_arrivo;
	}
	public void setOra_arrivo(int ora_arrivo) {
		this.ora_arrivo = ora_arrivo;
	}
	@Override
	public String toString() {
		return "Volo [id=" + id + ", giorno=" + giorno + ", cittaDarrivo=" + cittaDarrivo + ", cittaDipartenza="
				+ cittaDipartenza + ", tipoAereo=" + tipoAereo + ", ora_partenza=" + ora_partenza + ", ora_arrivo="
				+ ora_arrivo + "]";
	}
	
	

}
