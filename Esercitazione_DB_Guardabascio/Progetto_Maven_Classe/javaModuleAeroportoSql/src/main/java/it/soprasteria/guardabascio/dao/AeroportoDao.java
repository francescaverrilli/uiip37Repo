package it.soprasteria.guardabascio.dao;

import it.soprasteria.guardabascio.model.Aeroporto;

public interface AeroportoDao {
	public void insert (Aeroporto aerop);
	public Aeroporto selectByTipo(String citta);
	public void update (String citta, Aeroporto aereop);
}
