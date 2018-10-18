package it.soprasteria.guardabascio.dao;

import it.soprasteria.guardabascio.model.Aereo;

public interface AereoDao {
	public void insert (Aereo aereo);
	public Aereo selectByTipo(String tipo);
	public void update (String tipo, Aereo aereo);
}
