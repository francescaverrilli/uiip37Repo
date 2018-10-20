package it.soprasteria.homework4.santoro.dao;

import it.soprasteria.homework4.santoro.model.Attivita;

public interface AttivitaDao {
	
	public void insert (Attivita attivita);
	public Attivita selectByTipo(int codice);
	public void update(int codice,Attivita attivita);

}
