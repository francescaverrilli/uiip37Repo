package it.soprasteria.abbatangelo.dao;


import it.soprasteria.abbatangelo.model.Volo;

public interface VoloDao {
	public void insert(Volo volo);
	public Volo selectByIdVolo(int idVolo);
	public void update(int idVolo, Volo volo);
	public void updateCittaPart(int idVolo, String cittaPart);
}
