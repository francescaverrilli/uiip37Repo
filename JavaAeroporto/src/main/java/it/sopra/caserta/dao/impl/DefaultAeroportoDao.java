package it.sopra.caserta.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.caserta.dao.AeroportoDao;
import it.sopra.caserta.model.Aeroporto;
import it.sopra.caserta.utility.ConnectionManager;

public class DefaultAeroportoDao implements AeroportoDao {

	public void insert(Aeroporto aeroporto) {
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values('" + aeroporto.getCitta() + "'," + aeroporto.getNazione() + ","
				+ aeroporto.getnPiste() + ")";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// Insert the data;
			statement.executeUpdate(query);
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Aeroporto selectByTipo(String tipo) {
		Aeroporto a = null;
		Connection conn;
		String query = "SELECT * FROM aeroporto WHERE citta='" + tipo + "'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				// Retrieve by column name
				String citta = rs.getString("citta");
				String nazione = rs.getString("nazione");
				int npiste = rs.getInt("npiste");
				a = new Aeroporto(citta, nazione, npiste);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	public void update(String tipo, Aeroporto aeroporto) {
		Connection conn;
		String query = "UPDATE aeroporto set nazione= '" + aeroporto.getNazione() + "', npiste=" + aeroporto.getnPiste()
				+" WHERE citta='" +tipo+ "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// Insert the data;
			statement.executeUpdate(query);
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
