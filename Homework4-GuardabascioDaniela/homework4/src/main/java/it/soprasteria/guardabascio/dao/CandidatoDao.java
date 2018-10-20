package it.soprasteria.guardabascio.dao;

import java.util.LinkedList;

import it.soprasteria.guardabascio.model.Candidato;
import it.soprasteria.guardabascio.model.TitoloStudio;

public interface CandidatoDao {

	// inserimento candidato e relativo numero di telefono
	public void InsertCandidato (Candidato c);
	
	// Visualizzazzione titoli di un candidato
	public LinkedList<TitoloStudio> VisualizzaTitoli(int codice);
	
	// Aggiornamento dati di un candidato
	public void AggiornaResidenza(int codice , String viaResidenza, String capResidenza, String cittaResidenza);
	
	// seleziona un candidato a partire dal codice
	public Candidato selectByTipo(int codice);
	
	//Stampa elenco candidati
	public LinkedList<Candidato> stampaCandidati();
}
