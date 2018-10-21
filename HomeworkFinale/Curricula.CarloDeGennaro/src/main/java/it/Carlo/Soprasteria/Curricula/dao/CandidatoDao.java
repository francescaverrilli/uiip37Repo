package it.Carlo.Soprasteria.Curricula.dao;

import java.util.Vector;

import it.Carlo.Soprasteria.Curricula.model.Candidato;
import it.Carlo.Soprasteria.Curricula.model.TitoloStudio;

public interface CandidatoDao {
	//in insert oltre a candidato do anche il telefono come parametro poichè la traccia richiede di inserire il candidato ed il suo telefono
	//e anzichè passare un oggetto telefono, passo solo una stringa telefono
	
	//inserimento
	public void insert (Candidato candidato, String telefono);
	//selezione
	public Vector<TitoloStudio> selectByTitoloStudio (int idCandidato); //idCandidato chiave primaria
	//update, dato l'id del candidato vado ad aggiornare via, cap e citta del candidato
	public void update (int codiceCand, String viaCand, String capCand, String cittaCand);
	public boolean controllaSeIdPresente(int codiceCandidato);
}
