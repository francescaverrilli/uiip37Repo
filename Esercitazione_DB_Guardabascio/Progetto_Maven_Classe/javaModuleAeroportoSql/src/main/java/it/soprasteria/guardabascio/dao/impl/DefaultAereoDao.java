package it.soprasteria.guardabascio.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import it.soprasteria.guardabascio.ConnectionManager;
import it.soprasteria.guardabascio.dao.AereoDao;
import it.soprasteria.guardabascio.model.Aereo;

public class DefaultAereoDao implements AereoDao{

	public void insert(Aereo aereo) {
		Connection conn;
		String query="INSERT INTO AEREO VALUES('"+aereo.getTipoAereo()+"',"+aereo.getnPass()+","+
				aereo.getQuantitaMerci()+")";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement= conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public Aereo selectByTipo(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(String tipo, Aereo aereo) {
		// TODO Auto-generated method stub
		
	}

	
}
