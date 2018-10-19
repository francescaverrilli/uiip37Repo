package it.soprasteria.guardabascio.dao.impl;

import java.sql.*;
import it.soprasteria.guardabascio.ConnectionManager;
import it.soprasteria.guardabascio.dao.AeroportoDao;
import it.soprasteria.guardabascio.model.Aeroporto;

public class DefaultAeroportoDao implements AeroportoDao{

	public void insert(Aeroporto aerop) {
		Connection conn;
		String query="INSERT IGNORE INTO AEROPORTO VALUES('"+aerop.getCitta()+"', '"+aerop.getNazione()+"' ,"+
				aerop.getNpiste()+")";
		
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

	public Aeroporto selectByTipo(String citta) {
		Aeroporto a = new Aeroporto();
		Connection conn;
		String query= "Select * from Aeroporto where citta= '"+ citta +"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn .createStatement();
			ResultSet rs= statement.executeQuery(query);
			if(rs.next()) {
				
				String citta1 = rs.getString("citta");
				String nazione = rs.getString("nazione");
				int piste = rs.getInt("npiste");
				a = new Aeroporto(citta1, nazione, piste);
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

	public void update(String citta, Aeroporto aereop) {
		
		Connection conn;
		String query="UPDATE Aeroporto set nPiste= "+ aereop.getNpiste()+" WHERE citta='"+aereop.getCitta()+"'";
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
