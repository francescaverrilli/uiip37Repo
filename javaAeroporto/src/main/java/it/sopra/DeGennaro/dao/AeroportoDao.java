package it.sopra.DeGennaro.dao;

import it.sopra.DeGennaro.model.Aeroporto;

public interface AeroportoDao {

		public void insert (Aeroporto aeroporto);
		public Aeroporto selectByTipo (String tipo);
		public void update (String tipo, Aeroporto aeroporto);
	}

