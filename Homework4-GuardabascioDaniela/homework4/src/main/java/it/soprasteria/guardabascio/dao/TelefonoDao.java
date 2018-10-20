package it.soprasteria.guardabascio.dao;

import it.soprasteria.guardabascio.model.Telefono;

public interface TelefonoDao {

	public void InsertTelefono (Telefono t);
	// seleziona un numero di teelfono a partire dal codice del candidato
	public Telefono selectByTipo(int codice);
}
