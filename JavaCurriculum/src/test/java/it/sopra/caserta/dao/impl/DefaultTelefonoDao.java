package it.sopra.caserta.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.caserta.dao.TelefonoDao;
import it.sopra.caserta.model.Telefono;
import it.sopra.caserta.utility.ConnectionManager;

public class DefaultTelefonoDao implements TelefonoDao {

	/**
	 * Metodo per l'inserimento di un oggetto ti tipo telefono 
	 * all'interno del Database
	 * 
	 * restituisce un valore intero per verificare se l'inserimento è 
	 * avvenuto con successo.
	 */
	public int insert(Telefono telefono) {
		int result = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO telefono values('" + telefono.getNumero() 
						+ "'," + telefono.getCodCandidato() + ")";

		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// Insert the data;
			result = statement.executeUpdate(query);
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	

}
