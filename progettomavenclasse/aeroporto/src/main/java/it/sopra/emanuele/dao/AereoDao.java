package it.sopra.emanuele.dao;

import it.sopra.emanuele.model.Aereo;

public interface AereoDao {
	public void insert(Aereo aereo);
	public Aereo selectByTipo(String tipo);
	public void update (String tipo,Aereo aereo);
		
	

}
