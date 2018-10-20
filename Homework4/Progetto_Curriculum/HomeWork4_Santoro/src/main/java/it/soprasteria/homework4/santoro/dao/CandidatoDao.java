package it.soprasteria.homework4.santoro.dao;

import it.soprasteria.homework4.santoro.model.Candidato;

public interface CandidatoDao {
	
	public void insert (Candidato candidato);
	public Candidato selectByTipo(int codice);
	public void update(int codice,String viaResidenza,String capResidenza,String cittaResidenza);

}
