package it.sopra.DeGennaro.dao;

import it.sopra.DeGennaro.model.Volo;

public interface VoloDao {
	 
		public void insert (Volo volo);
		public Volo selectByTipo (int id, String tipo);
		public void update (int tipo,String tipo2, Volo volo);
	
}


