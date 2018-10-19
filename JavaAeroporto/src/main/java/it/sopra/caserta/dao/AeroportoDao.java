package it.sopra.caserta.dao;

import it.sopra.caserta.model.Aeroporto;

public interface AeroportoDao {
	
	public void insert(Aeroporto aeroporto);
	public Aeroporto selectByTipo (String tipo);
	public void update (String tipo, Aeroporto aeroporto);

}
