package it.Sopra.AndreaGuastaferro.dao;

import it.Sopra.AndreaGuastaferro.model.Aereo;

public interface AereoDao {
	
	public void insert (Aereo aereo);
	public Aereo selectByTipo (String tipo);
	public void update (String tipo, Aereo aereo);
	
	
	
}
