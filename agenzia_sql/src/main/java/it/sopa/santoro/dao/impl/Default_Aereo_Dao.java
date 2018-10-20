package it.sopa.santoro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import it.sopra.santoro.ConnectionManager;
import it.sopra.santoro.dao.AereoDao;
import it.sopra.santoro.model.Aereo;

public class Default_Aereo_Dao implements AereoDao{
	
	public void insert (Aereo aereo) {
		Connection conn;
		String query="INSERT IGNORE INTO AEREO VALUES('"+aereo.getTipoAereo()+"',"+aereo.getNpass()+","+
		aereo.getQuantit‡Merci()+")";
		
		try {
			
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement=conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Aereo selectByTipo(String tipo) {
		
		Aereo a = null;
		Connection conn;
		String query="Select *from Aereo where tipoAereo='"+tipo+"'";
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery(query);
			if(rs.next()) {
				String tipoAereo = rs.getString("tipoAereo");
				int passeggeri = rs.getInt("nPass");
				int merci = rs.getInt("quantitaMerci");
				a = new Aereo(tipoAereo,passeggeri,merci);
			}
			
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return a;
		
	}
	
	
	public void update(String tipo,Aereo aereo) {
		Aereo a = null;
		Connection conn;
		String query="Update aereo set nPass='"+aereo.getNpass()+"' where tipoAereo='"+tipo+"'";
		
		
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);

			
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
