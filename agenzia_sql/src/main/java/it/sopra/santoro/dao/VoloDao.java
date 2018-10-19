package it.sopra.santoro.dao;

import it.sopra.santoro.model.Aereo;
import it.sopra.santoro.model.Volo;

public interface VoloDao {
	
	public void insert (Volo volo);
	public Volo selectByTipo(int idVolo,String giornoSett);
	public void update(int idVolo,String giornoSett,int oraPartenza);

}
