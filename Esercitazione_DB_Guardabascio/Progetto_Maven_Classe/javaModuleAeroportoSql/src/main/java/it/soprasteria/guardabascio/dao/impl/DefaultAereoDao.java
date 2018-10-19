package it.soprasteria.guardabascio.dao.impl;

import java.sql.*;
import it.soprasteria.guardabascio.ConnectionManager;
import it.soprasteria.guardabascio.dao.AereoDao;
import it.soprasteria.guardabascio.model.Aereo;

public class DefaultAereoDao implements AereoDao{

	public void insert(Aereo aereo) {
		Connection conn;
		String query="INSERT IGNORE INTO AEREO VALUES('"+aereo.getTipoAereo()+"',"+aereo.getnPass()+","+
				aereo.getQuantitaMerci()+")";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement= conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Aereo selectByTipo(String tipo) {
		Aereo a = new Aereo();
		Connection conn;
		String query= "Select * from Aereo where tipoAereo= '"+ tipo+"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn .createStatement();
			ResultSet rs= statement.executeQuery(query);
			if(rs.next()) {
				
				String tipoAereo = rs.getString("tipoAereo");
				int passeggeri = rs.getInt("nPass");
				int merci = rs.getInt("quantitaMeerci");
				a=new Aereo(tipoAereo, passeggeri, merci);
			}
			conn.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return a;
	}

	public void update(String tipo, Aereo aereo) {
		
		Connection conn;
		String query="UPDATE Aereo set nPass= "+ aereo.getnPass()+", quantitameerci= "+ aereo.getQuantitaMerci()+ " WHERE tipoAereo='"+aereo.getTipoAereo()+"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement= conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
