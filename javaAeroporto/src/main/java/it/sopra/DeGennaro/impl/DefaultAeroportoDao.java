package it.sopra.DeGennaro.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.DeGennaro.ConnectionManager;
import it.sopra.DeGennaro.dao.AeroportoDao;
import it.sopra.DeGennaro.model.Aereo;
import it.sopra.DeGennaro.model.Aeroporto;

public class DefaultAeroportoDao implements AeroportoDao {
	public void insert (Aeroporto aeroporto) {
		//create a statement from the connection
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values('" + aeroporto.getCitta() + "'," + aeroporto.getNazione() + ","
				+ aeroporto.getNumPiste() + ")";
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

	public Aeroporto selectByTipo(String tipo) {
		Aeroporto a = null;
		Connection conn;
		String query = "Select * from Aeroporto where tipoAeroporto='" + tipo + "'";
		try {
			conn = ConnectionManager.getconnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				//Retrieve by column name
			String tipoAeroporto = rs.getString("citta");
			String nazione = rs.getString("nazione");
			int numPiste = rs.getInt("npiste");
			a = new Aeroporto(tipoAeroporto, nazione , numPiste);
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return a;	
	}
	
	public void update (String tipo, Aeroporto aeroporto) {
		Connection conn;
		String query = "Update Aeroporto set nazione='" +aeroporto.getNazione()+ "', nPiste=" +aeroporto.getNumPiste()+
				" WHERE citta='" +tipo+ "'";
		System.out.println(query); //da commentare
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




