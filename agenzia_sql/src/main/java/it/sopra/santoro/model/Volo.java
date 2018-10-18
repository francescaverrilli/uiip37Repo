package it.sopra.santoro.model;

public class Volo {
	
	int id_volo;
	String giornoSett;
	String cittaPart;
	String cittaArr;
	String tipoAereo;
	int dataPart;
	int dataArr;
	
	public Volo(int id_volo, String giornoSett, String cittaPart, String cittaArr, String tipoAereo, int dataPart,
			int dataArr) {
		super();
		this.id_volo = id_volo;
		this.giornoSett = giornoSett;
		this.cittaPart = cittaPart;
		this.cittaArr = cittaArr;
		this.tipoAereo = tipoAereo;
		this.dataPart = dataPart;
		this.dataArr = dataArr;
	}

	public int getId_volo() {
		return id_volo;
	}

	public void setId_volo(int id_volo) {
		this.id_volo = id_volo;
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

	public int getDataPart() {
		return dataPart;
	}

	public void setDataPart(int dataPart) {
		this.dataPart = dataPart;
	}

	public int getDataArr() {
		return dataArr;
	}

	public void setDataArr(int dataArr) {
		this.dataArr = dataArr;
	}
	
	

}
