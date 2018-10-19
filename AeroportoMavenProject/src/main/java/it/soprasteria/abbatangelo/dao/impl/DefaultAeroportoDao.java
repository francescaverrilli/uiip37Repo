package it.soprasteria.abbatangelo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.soprasteria.abbatangelo.ConnectionManager;
import it.soprasteria.abbatangelo.dao.AeroportoDao;
import it.soprasteria.abbatangelo.model.Aeroporto;

public class DefaultAeroportoDao implements AeroportoDao {

	public void insert(Aeroporto aeroporto) {
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values('" + aeroporto.getCitta() + "', '" + aeroporto.getNazione()
				+ "', '" + aeroporto.getNpiste() + "')";
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

	public Aeroporto selectByCitta(String citta) {
		Aeroporto a = null;
		Connection conn;
		String query = "Select * from Aeroporto where citta='" + citta + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeQuery(query);
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				String cittains = rs.getString("citta");
				String nazione = rs.getString("nazione");
				int npiste = rs.getInt("nPiste");
				a = new Aeroporto(cittains, nazione, npiste);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	public void update(String citta, Aeroporto aeroporto) {
		Connection conn;
		String query = "UPDATE Aeroporto SET citta='" + aeroporto.getCitta() + "', nazione='" + aeroporto.getNazione()
				+ "', nPiste='" + aeroporto.getNpiste() + "' WHERE citta='" + citta + "'";
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
