package it.sopra.caserta.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.caserta.dao.AereoDao;
import it.sopra.caserta.model.Aereo;
import it.sopra.caserta.utility.ConnectionManager;

public class DefaultAereoDao implements AereoDao {


	public void insert(Aereo aereo) {
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereo.getTipoAereo() + "'," + aereo.getnPass() + ","
				+ aereo.getQuantitaMerci() + ")";
		
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

	public Aereo selectByTipo(String tipo) {
		Aereo a = null;
		Connection conn;
		String query = "SELECT * FROM aereo WHERE tipoAereo='" + tipo + "'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				// Retrieve by column name
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
		String query = "UPDATE aereo set nPass= " + aereo.getnPass() + ", quantitaMerci=" + aereo.getQuantitaMerci()
				+" WHERE tipoAereo='" +tipo+ "'";
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

	public void updateNpass(String tipo, int numPass) {
		Connection conn;
		String query = "UPDATE aereo set nPass= " + numPass
				+" WHERE tipoAereo='" +tipo+ "'";
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
