package it.soprasteria.homework4.santoro.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import it.soprasteria.homework4.santoro.ConnectionManager;
import it.soprasteria.homework4.santoro.dao.TelefonoDao;
import it.soprasteria.homework4.santoro.model.Telefono;

public class Default_Telefono_Dao implements TelefonoDao{

	public void insert(Telefono telefono) {
		Connection conn;
		
		String query="INSERT IGNORE INTO TELEFONO VALUES('"+telefono.getNumero()+"',"+telefono.getCandidato()+")";
		
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

	public Telefono selectByTipo(String numero) {
		
		Telefono telefono = null;
		Connection conn;
		String query="Select *from telefono where numero='"+numero+"'";
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery(query);
			if(rs.next()) {
				String numero1 = rs.getString("numero");
				int candidato = rs.getInt("candidato");
				
				telefono = new Telefono(numero1,candidato);
			}
			
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return telefono;
	}

	public void update(int numero, Telefono telefono) {
		
		Connection conn;
		String query="Update telefono set candidato='"+telefono.getCandidato()+"'where numero="+numero+"";
		
		
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
