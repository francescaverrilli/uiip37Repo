package it.soprasteria.homework4.santoro.dao;


import it.soprasteria.homework4.santoro.model.Telefono;

public interface TelefonoDao {
	
	public void insert (Telefono telefono);
	public Telefono selectByTipo(String numero);
	public void update(int numero,Telefono telefono);

}
