package it.sopra.caserta.dao;

import it.sopra.caserta.model.Volo;

public interface VoloDao {
	
	public void insert(Volo volo);
	public Volo selectByTipo (int id, String tipo2);
	public void update (int tipo, String tipo2, Volo volo);

}
