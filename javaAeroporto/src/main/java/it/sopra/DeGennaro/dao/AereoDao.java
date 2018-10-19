package it.sopra.DeGennaro.dao;

import it.sopra.DeGennaro.model.Aereo;

public interface AereoDao {
 
	public void insert (Aereo aereo);
	public Aereo selectByTipo (String tipo);
	public void update (String tipo, Aereo aereo);
}
