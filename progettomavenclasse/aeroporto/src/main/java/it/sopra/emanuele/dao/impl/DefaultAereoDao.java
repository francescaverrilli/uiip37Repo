package it.sopra.emanuele.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.emanuele.dao.AereoDao;
import it.sopra.emanuele.model.Aereo;

public class DefaultAereoDao implements AereoDao {
	public void insert(Aereo aereo) {
		// create a statemment from the connection
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereo.getTipo() + "'," + aereo.getPassegeri() + ","
				+ aereo.getMerci() + ")";

		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// insert the data
			statement.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				// retrieve by column name
				String tipoAereo = rs.getString("tipoAereo");
				int passegeri = rs.getInt("quantitaMerci");
				int merci = rs.getInt("quantitaMerci");
				a = new Aereo(tipoAereo, passegeri, merci);

			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public void update(String tipo, Aereo a) {
		Aereo a1= null;
		Connection conn;
		String query= "Update Aereo set tipoAereo ='"+ a.getTipo() + "',nPass='"+ a.getPassegeri() + "', quantitaMerci='" 
				+ a.getMerci() + "' where tipoAereo='" + tipo + "'";
		try {
			conn= ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}	
		
		
		
		
		
	
	}
	
