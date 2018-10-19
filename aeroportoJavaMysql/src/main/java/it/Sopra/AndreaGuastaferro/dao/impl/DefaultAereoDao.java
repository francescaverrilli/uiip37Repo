package it.Sopra.AndreaGuastaferro.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.Sopra.AndreaGuastaferro.dao.AereoDao;
import it.Sopra.AndreaGuastaferro.model.Aereo;
import it.Sopra.AndreaGuastaferro.model.ConnectionManager;

public class DefaultAereoDao  implements AereoDao {
	
	public DefaultAereoDao(){
		// TODO Auto-generated constructor stub
	}

	public void insert(Aereo aereo) {

		Connection conn;
		String query= "Insert into aereo values('" +aereo.getTipoAereo()+"'," + aereo.getnPass()+","+ aereo.getQuantMerce()+")";
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

	public Aereo selectByTipo(String tipo) {

		Aereo a= null;
		Connection conn;
		String query = "Select * from Aereo where tipoAereo= '"+ tipo+"' ";
		System.out.println(query);
		try {
			conn=ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				String tipoAereo = rs.getString("tipoAereo");
				int passeggeri = rs.getInt("nPass");
				int merci = rs.getInt("quantitaMerci");
				a = new Aereo(tipoAereo, passeggeri, merci);
			}
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;
	}

	public void update(String tipo, Aereo aereo) {
		
		Aereo aereo_temp= selectByTipo(tipo);
		Connection conn;
		String query = "Update aereo set nPass="+aereo.getnPass() +", "+ "quantitaMerci="+aereo.getQuantMerce()+" "+
		" WHERE tipoAereo='"+aereo.getTipoAereo()+"'";
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
