package it.soprasteria.abbatangelo.dao;

import it.soprasteria.abbatangelo.model.Aereo;

public interface AereoDao {
	public void insert(Aereo aereo);
	public Aereo selectByTipo(String tipo);
	public void update(String tipo, Aereo aereo);
}
