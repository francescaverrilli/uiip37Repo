package it.sopa.santoro.dao.impl;

import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import it.sopra.santoro.ConnectionManager;
import it.sopra.santoro.dao.AereoDao;
import it.sopra.santoro.model.Aereo;

public class Default_Aereo_Dao implements AereoDao{
	
	public void insert (Aereo aereo) {
		Connection conn;
		String query="INSERT INTO AEREO VALUES('"+aereo.getTipoAereo()+"',"+aereo.getNpass()+","+
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
		return null;
	}
	
	
	public void update(String tipo,Aereo aereo) {
		
	}
}
