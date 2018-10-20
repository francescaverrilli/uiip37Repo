package it.silvioCurricula.CurriculaSilvio.dao;

import java.util.Vector;

import it.silvioCurricula.CurriculaSilvio.model.Candidato;
import it.silvioCurricula.CurriculaSilvio.model.TitoloStudio;

public interface CandidatoDao {

	public void insert(Candidato candidato, String numero);

	public Vector<TitoloStudio> select(int codice);

	public Vector<Integer> selectCodiciCandidato();

	public void update(int codice, String via, String cap, String citta);

}
