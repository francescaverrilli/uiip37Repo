package it.Sopra.AndreaGuastaferro.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.Sopra.AndreaGuastaferro.dao.AeroportoDao;
import it.Sopra.AndreaGuastaferro.model.Aereo;
import it.Sopra.AndreaGuastaferro.model.Aeroporto;
import it.Sopra.AndreaGuastaferro.model.ConnectionManager;

public class DefaultAeroportoDao implements AeroportoDao {

	public DefaultAeroportoDao() {
		// TODO Auto-generated constructor stub
	}

	public void insert(Aeroporto aeroporto) {
	
			Connection conn;
			String query= "Insert into aereoporto values('" +aeroporto.getCitta()+"'," + aeroporto.getNazione()+","+ aeroporto.getNpiste()+")";
			try {
				conn=ConnectionManager.getConnection();
				Statement statement = conn.createStatement();
				statement.executeUpdate(query);
				conn.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
	}

	public Aeroporto selectByTipo(String citta) {
		Aeroporto a= null;
		Connection conn;
		String query = "Select * from Aeroporto where citta= '"+citta+"' ";
		System.out.println(query);
		try {
			conn=ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				String cittaS= rs.getString("citta");
				String nazione = rs.getString("nazione");
				int npiste = rs.getInt("npiste");
				a = new Aeroporto(cittaS, nazione, npiste);
			}
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;
	}

	public void update(String citta, Aeroporto aeroporto) {
		Connection conn;
		String query = "Update aereo set nazione= '"+aeroporto.getNazione() +"' ,"+ "npiste= '"+aeroporto.getNpiste()+"' "+
		" WHERE citta='"+aeroporto.getCitta()+"'";
		System.out.println(query);
		try {
			conn=ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);

			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
