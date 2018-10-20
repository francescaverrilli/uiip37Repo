package it.soprasteria.homework4.santoro.dao;

import it.soprasteria.homework4.santoro.model.TitoloStudio;

public interface TitoloStudioDao {
	
	public void insert (TitoloStudio titolostudio);
	public TitoloStudio selectByTipo(int codice);
	public void update(int codice,TitoloStudio titolostudio);

}
