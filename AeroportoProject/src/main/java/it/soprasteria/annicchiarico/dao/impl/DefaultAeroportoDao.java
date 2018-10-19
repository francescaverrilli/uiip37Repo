package it.soprasteria.annicchiarico.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;


import it.soprasteria.annicchiarico.model.Aeroporto;

public class DefaultAeroportoDao {
	public void insert(Aeroporto aeroporto) {
		// create a Statement from the connection
		Connection conn;
		
		
		String query = "INSERT IGNORE INTO aereoporto values ('" + aeroporto.getNazione()+ ", nPiste= " + aeroporto.getNpiste() + aeroporto.getCitta()
				 + ")";
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

	
	
	public Aeroporto selectByTipo(String citta) {
		Aeroporto b = null;
		Connection conn;
		String query = "Select * from aeroporto where citta ='" + citta + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				// Retrieve by culumn name
				String citta1 = rs.getString("citta");
				String nazione = rs.getString("nazione");
				int npiste = rs.getInt("npiste");
				b = new Aeroporto (citta1, nazione, npiste);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;

	}




	public void update(Aeroporto aeroporto, String citta) {

		Connection conn;
		String query = " upDate aereo set nazione=" + aeroporto.getNazione()+ ", nPiste= " + aeroporto.getNpiste() +
				" where citta=  '"+ citta + "'";
				 
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