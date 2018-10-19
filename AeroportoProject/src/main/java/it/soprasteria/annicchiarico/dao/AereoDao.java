package it.soprasteria.annicchiarico.dao;

import it.soprasteria.annicchiarico.model.Aereo;

public interface AereoDao {

	public void insert (Aereo aereo);
	public Aereo selectByTipo (String tipo);
	//public void update (String tipo, Aereo aereo);
	public void update(Aereo a, String tipoAereo);
	
	
	
}
