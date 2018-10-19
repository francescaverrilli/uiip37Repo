package it.Sopra.AndreaGuastaferro.dao;

import it.Sopra.AndreaGuastaferro.model.Aereo;
import it.Sopra.AndreaGuastaferro.model.Aeroporto;

public interface AeroportoDao {

	public void insert (Aeroporto aeroporto);
	public Aeroporto selectByTipo (String tipo);
	public void update (String tipo, Aeroporto aeroporto);
	
}
