package it.sopa.santoro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import it.sopra.santoro.ConnectionManager;
import it.sopra.santoro.dao.AereoportoDao;
import it.sopra.santoro.model.Aereo;
import it.sopra.santoro.model.Aereoporto;

public class Default_Aereoporto_Dao implements AereoportoDao{
	
	public void insert (Aereoporto aereoporto) {
		Connection conn;
		String query="INSERT IGNORE INTO AEREOPORTO VALUES('"+aereoporto.getCitta()+"','"+aereoporto.getNazione()+"','"+aereoporto.getNpiste()+"'"+")";
		
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
	
	public Aereoporto selectByTipo(String citta) {
		Aereoporto a = null;
		Connection conn;
		String query="Select *from Aereoporto where citta='"+citta+"'";
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery(query);
			if(rs.next()) {
				String citta1 = rs.getString("citta");
				String nazione  = rs.getString("nazione");
				int npiste = rs.getInt("npiste");
				a = new Aereoporto(citta1,nazione,npiste);
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
	
	
	public void update(String nomecitta,Aereoporto aereoporto) {
		
		Aereoporto a = null;
		Connection conn;
		String query="Update aereoporto set npiste='"+aereoporto.getNpiste()+"' where citta='"+nomecitta+"'";
		
		
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
