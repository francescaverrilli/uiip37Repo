package it.soprasteria.abbatangelo.dao;

import it.soprasteria.abbatangelo.model.Aeroporto;

public interface AeroportoDao {
	public void insert(Aeroporto aeroporto);
	public Aeroporto selectByCitta(String citta);
	public void update(String citta, Aeroporto aereo);
}
