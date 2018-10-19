package it.sopra.caserta.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.caserta.dao.VoloDao;
import it.sopra.caserta.model.Volo;
import it.sopra.caserta.utility.ConnectionManager;

public class DefaultVoloDao implements VoloDao {

	public void insert(Volo volo) {
		Connection conn;
		String query = "INSERT IGNORE INTO volo values('" + volo.getIdVolo() + "'," + volo.getGiornoSett() + ","
				+ volo.getCittaPart() + "," + volo.getCittaArr() + "," + volo.getTipoAereo() + "," 
				+ volo.getOraPartenza() + "," + volo.getOraArrivo() + ")";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// Insert the data;
			statement.executeUpdate(query);
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Volo selectByTipo(int tipo, String tipo2) {
		Volo v = null;
		Connection conn;
		String query = "SELECT * FROM volo WHERE idVolo=" + tipo + " AND giornoSett='" + tipo2 + "'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
	
			if(rs.next()) {
				// Retrieve by column name
				int idVolo  = rs.getInt("idVolo");
				String giorno = rs.getString("giornoSett");
				String cittaPart = rs.getString("cittaPart");
				String cittaArr = rs.getString("cittaArr");
				String tipoAereo = rs.getString("tipoAereo");
				int oraPart = rs.getInt("oraPartenza");
				int oraArr = rs.getInt("oraArrivo");
				v = new Volo(idVolo, giorno, cittaPart, cittaArr, tipoAereo, oraPart, oraArr);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;
	}

	
	public void update(int tipo, String tipo2, Volo volo) {
		Connection conn;
		String query = "UPDATE volo set cittaPart='" + volo.getCittaPart() + "', cittaArr='" + volo.getCittaArr() + 
				"', tipoAereo='" + volo.getTipoAereo() + "', oraPartenza=" + volo.getOraPartenza() + 
				", oraArrivo=" + volo.getOraArrivo() 
				+" WHERE idVolo=" +tipo+ " AND giornoSett='" + tipo2 + "'";

		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// Insert the data;
			statement.executeUpdate(query);
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
