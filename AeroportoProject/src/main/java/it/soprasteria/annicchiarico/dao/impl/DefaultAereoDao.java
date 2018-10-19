package it.soprasteria.annicchiarico.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import it.soprasteria.annicchiarico.dao.AereoDao;
import it.soprasteria.annicchiarico.model.Aereo;
import it.soprasteria.annicchiarico.model.Aeroporto;

public class DefaultAereoDao implements AereoDao {

	public void insert(Aereo aereo) {
		// create a Statement from the connection
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values ('" + aereo.getTipoAereo() + "'," + aereo.getnPass() + ","
				+ aereo.getQuantitaMerci() + ")";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// insert the data
			statement.executeUpdate(query);
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Aereo selectByTipo(String tipo) {
		Aereo a = null;
		Connection conn;
		String query = "Select * from aereo where tipoAereo ='" + tipo + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				// Retrieve by culumn name
				String tipoAereo = rs.getString("tipoAereo");
				int passeggeri = rs.getInt("nPass");
				int merci = rs.getInt("quantitaMerci");
				a = new Aereo(tipoAereo, passeggeri, merci);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;

	}



	public void update(Aereo aereo, String tipo) {

		Connection conn;
		String query = " upDate aereo set nPass=" + aereo.getnPass() + ", quantitaMerci= " + aereo.getQuantitaMerci() +
				" where tipoAereo=  '"+ tipo + "'";
				 
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();

			statement.executeUpdate(query);
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
