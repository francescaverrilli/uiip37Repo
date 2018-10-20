package it.soprasteria.homework4.santoro.dao;

import it.soprasteria.homework4.santoro.model.Esperienza;

public interface EsperienzaDao {
	
	public void insert (Esperienza esperienza);
	public Esperienza selectByTipo(int codice);
	public void update(int codice,Esperienza candidato);

}
