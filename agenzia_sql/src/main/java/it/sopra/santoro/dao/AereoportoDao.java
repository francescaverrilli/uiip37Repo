package it.sopra.santoro.dao;

import it.sopra.santoro.model.Aereo;
import it.sopra.santoro.model.Aereoporto;

public interface AereoportoDao {
	
	public void insert (Aereoporto aereoporto);
	public Aereoporto selectByTipo(String nomecitta);
	public void update(String nomecitta,Aereoporto aereoporto);

}
