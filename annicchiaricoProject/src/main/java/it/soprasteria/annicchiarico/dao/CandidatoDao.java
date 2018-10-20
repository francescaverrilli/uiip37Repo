package it.soprasteria.annicchiarico.dao;

import java.util.Vector;

import it.soprasteria.annicchiarico.model.Candidato;
import it.soprasteria.annicchiarico.model.TitoloStudio;

public interface CandidatoDao {

	public void insert(Candidato candidato, String telefono);

	public Vector<TitoloStudio> selectByTitoloStudio(int codice);

	public Vector<Integer> selectByCodice();

	public void update(String viaresidenza, String capresidenza, String cittaresidenza, int codice);

}
