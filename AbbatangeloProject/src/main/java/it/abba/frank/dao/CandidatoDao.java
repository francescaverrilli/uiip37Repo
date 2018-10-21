package it.abba.frank.dao;

import java.util.LinkedList;

import it.abba.frank.model.TitoloStudio;
import it.abba.frank.model.Candidato;

public interface CandidatoDao {

	public boolean checkID(int codice); // Verifica se un codice del Candidato è già presente nel DB

	public LinkedList<Candidato> allCandidato(); // Restituisce una lista di tutti i candidati

	public void insert(Candidato candidato, String telefono); // Inserisce un candidato e il relativo numero di telefono

	public LinkedList<TitoloStudio> selectByTitolo(int id); // Restituisce una lista ti titoli di studio appartenenti ad
															// un candidato

	public void update(int id, String via, String cap, String citta); // Aggiorna la residenza di un candidato
}
