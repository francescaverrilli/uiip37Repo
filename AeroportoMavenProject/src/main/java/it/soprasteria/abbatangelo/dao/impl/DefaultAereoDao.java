package it.soprasteria.abbatangelo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.soprasteria.abbatangelo.ConnectionManager;
import it.soprasteria.abbatangelo.dao.AereoDao;
import it.soprasteria.abbatangelo.model.Aereo;

public class DefaultAereoDao implements AereoDao {

	public void insert(Aereo aereo) {
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereo.getTipoAereo() + "', '" + aereo.getnPass() + "', '"
				+ aereo.getQuantitaMerci() + "')";

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

	public Aereo selectByTipo(String tipo) {
		Aereo a = null;
		Connection conn;
		String query = "Select * from Aereo where tipoAereo='" + tipo + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeQuery(query);
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				String tipoAereo = rs.getString("tipoAereo");
				int passeggeri = rs.getInt("nPass");
				int merci = rs.getInt("quantitaMerci");
				a = new Aereo(tipoAereo, passeggeri, merci);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	public void update(String tipo, Aereo aereo) {
		Connection conn;
		String query = "UPDATE Aereo SET tipoAereo='" + aereo.getTipoAereo() + "', nPass='" + aereo.getnPass()
				+ "', quantitaMerci='" + aereo.getQuantitaMerci() + "' WHERE tipoAereo='" + tipo + "'";
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
