package it.sopra.DeGennaro.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import it.sopra.DeGennaro.ConnectionManager;
import it.sopra.DeGennaro.dao.AereoDao;
import it.sopra.DeGennaro.model.Aereo;

public class DefaultAereoDao implements AereoDao {

	public void insert (Aereo aereo) {
		//create a statement from the connection
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereo.getNome() + "'," + aereo.getNumPasseggeri() + ","
				+ aereo.getQuantitaMerci() + ")";
		//mettendo ignore se è già presente quella riga in tabella 
		//e provo a reinserirla, anche se è una primary key e quindi dovrebbe dare errore
		//se provo ad inserirla non dà più errore
		try {
			conn=ConnectionManager.getconnection(); //creo una connessione
			Statement statement = conn.createStatement(); //installiamo uno statement
			//Insert the data;
			statement.executeUpdate(query);
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Aereo selectByTipo(String tipo) {
		Aereo a = null;
		Connection conn;
		String query = "Select * from Aereo where tipoAereo='" + tipo + "'";
		try {
			conn = ConnectionManager.getconnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				//Retrieve by column name
			String tipoAereo = rs.getString("TipoAereo");
			int passeggeri = rs.getInt("nPass");
			int merci = rs.getInt("quantitaMerci");
			a = new Aereo(tipoAereo, passeggeri, merci);
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return a;	
	}
	
	public void update (String tipo, Aereo aereo) {
		Connection conn;
		String query = "Update Aereo set nPass=" +aereo.getNumPasseggeri()+ ", quantitaMerci=" +aereo.getQuantitaMerci()+
				" WHERE tipoAereo='" +tipo+ "'";
		System.out.println(query);
		try {
			conn = ConnectionManager.getconnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
		
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}


