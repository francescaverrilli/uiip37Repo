package it.Sopra.AndreaGuastaferro.dao;

import it.Sopra.AndreaGuastaferro.model.Aereo;
import it.Sopra.AndreaGuastaferro.model.Aeroporto;
import it.Sopra.AndreaGuastaferro.model.Volo;

public interface VoloDao {

	public void insert (Volo volo);
	public Volo selectByTipo (int id, String giorno);
	public void update (int id, String giorno, Volo volo);
	
}
