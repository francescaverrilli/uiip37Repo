package it.soprasteria.guardabascio.dao;

import it.soprasteria.guardabascio.model.Volo;

public interface VoloDao {
	public void insert (Volo volo);
	public Volo selectByTipo(int idVolo);
	public void update (int idVolo, Volo volo);
}