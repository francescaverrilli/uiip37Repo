package it.sopra.caserta.dao;

import it.sopra.caserta.model.Aereo;

public interface AereoDao {
	
	public void insert(Aereo aereo);
	public Aereo selectByTipo (String tipo);
	public void update (String tipo, Aereo aereo);
	public void updateNpass(String tipo, int numPass);
	

}
