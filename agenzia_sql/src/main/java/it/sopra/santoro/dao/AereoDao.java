package it.sopra.santoro.dao;
import it.sopra.santoro.model.*;


public interface AereoDao {
	
	public void insert (Aereo aereo);
	public Aereo selectByTipo(String tipo);
	public void update(String tipo,Aereo aereo);

}
