package it.sopra.caserta.dao;

import java.util.Vector;

import it.sopra.caserta.model.Candidato;

public interface CandidatoDao {
	
	public int insert(Candidato candidato);
	public Candidato selectByCodice (int cod);
	public int updateResidenza (int tipo, String indirizzo, String cap, String citta);
	public Vector<String> getTitoliByCodice (int cod);
	public Vector<Candidato> getCandidati();
}
