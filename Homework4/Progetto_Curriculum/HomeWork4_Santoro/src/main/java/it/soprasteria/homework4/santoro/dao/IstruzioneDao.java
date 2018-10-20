package it.soprasteria.homework4.santoro.dao;

import it.soprasteria.homework4.santoro.model.Istruzione;

public interface IstruzioneDao {
	
	public void insert (Istruzione istruzione);
	public Istruzione selectByTipo(int codice);
	public void update(int codice,Istruzione istruzione);

}
