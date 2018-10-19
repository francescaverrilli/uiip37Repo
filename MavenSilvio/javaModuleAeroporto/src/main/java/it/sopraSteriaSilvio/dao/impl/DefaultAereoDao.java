package it.sopraSteriaSilvio.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import it.sopraSteriaSilvio.dao.AereoDao;
import it.sopraSteriaSilvio.model.Aereo;
import it.sopraSteriaSilvio.model.Aeroporto;
import it.sopraSteriaSilvio.model.Volo;

public class DefaultAereoDao implements AereoDao {

	public void insert(Aereo aereo) {
		// create a Stantemnet from the connection
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereo.getTipoAereo() + "'," + aereo.getnPass() + ","
				+ aereo.getQuantitaMerci() + ")";

		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();

			// insert the data
			statement.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Aereo selectByTipo(String tipo) {
		Aereo a = null;
		Connection conn;
		String query = "Select * from Aereo where tipoAereo='" + tipo + "'"; //stare attenti a scrivere bene la query altrimenti va in errore 
		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				String tipoAereo = rs.getString("tipoAereo");
				int passegeri = rs.getInt("nPass");
				int merci = rs.getInt("quantitaMerci");
				a = new Aereo(tipoAereo, passegeri, merci);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return a;
	}
	
	public void update(String tipo, Aereo a) {
		
		Connection conn;
		String query = "Update Aereo set tipoAereo='"+ a.getTipoAereo()+"', nPass='"+ a.getnPass()+ "', quantitaMerci='"
				+ a.getQuantitaMerci()+"' where tipoAereo='" + tipo+ "'";
		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			
			
			conn.close();
			
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateAeroporto(String citta, Aeroporto aeroporto) {
		Connection conn;
		String query = "Update Aeroporto set citta='"+ aeroporto.getCitta()+"', nazione='"+ aeroporto.getNazione()
		+"', npiste='"+ aeroporto.getnPiste()+"' where citta='"+ citta+ "'";
		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateVolo(int id, String giornoSett, Volo volo) {
		Connection conn;
		String query = "Update Volo set cittaPartenza='"+volo.getCittaPertenza()
		+"', cittaArr='"+ volo.getCittaArr()+"', tipoAereo='"+ volo.getTipoAereo()+"', oraPartenza='"+ volo.getOraPartenza()
		+"', oraArrivo='"+ volo.getOraArrivo()+ "' where id='"+ id+"' && giornosett='"+ giornoSett+"'";
		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
