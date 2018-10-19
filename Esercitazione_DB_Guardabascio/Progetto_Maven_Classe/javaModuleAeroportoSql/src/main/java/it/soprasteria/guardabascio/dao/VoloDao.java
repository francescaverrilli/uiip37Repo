package it.soprasteria.guardabascio.dao;

import java.util.LinkedList;

import it.soprasteria.guardabascio.model.Volo;

public interface VoloDao {
	public void insert (Volo volo);
	public LinkedList<Volo> selectByTipo(int idVolo);
	public void update(int idVolo, String giornoSett , int oraPartenza , int oraArrivo);
}