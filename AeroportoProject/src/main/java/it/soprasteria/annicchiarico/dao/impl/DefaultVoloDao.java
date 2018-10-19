package it.soprasteria.annicchiarico.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import it.soprasteria.annicchiarico.model.Aereo;
import it.soprasteria.annicchiarico.model.Volo;

public class DefaultVoloDao {
	
	public void insert(Volo volo) {
		// create a Statement from the connection
		Connection conn;
		String query = "INSERT IGNORE INTO volo values ('" + volo.getIdVolo() + "'," + volo.getGiornoSett() + ","
				+volo.getCittaPart() + "'," + volo.getCittaArr() + "'," + volo.getTipoAereo() + "'," + volo.getOraPartenza() + "'," + volo.getOraArrivo() + ")";
		try {
			conn = ConnectionManager.getConnection();
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

	
	public Volo selectByTipo(String tipo) {
		Volo v = null;
		Connection conn;
		String query = "Select * from volo where tipoAereo ='" + tipo + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				// Retrieve by culumn name
				int idVolo = rs.getInt("idVolo");
				String giornoSett = rs.getString("gionoSett");
				String cittaPart = rs.getString("cittaPart");
				String cittaArr = rs.getString("cittaArr");
				String tipoAereo = rs.getString("tipoAereo");
				int oraPartenza = rs.getInt("oraPartenza");
				int oraArrivo = rs.getInt("oraArrivo");
				v = new Volo (idVolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPartenza, oraArrivo);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;

	}
	
	
	
	public void update(Volo volo, String giornoSett, int idVolo) {
		Connection conn;
		String query = "UPDATE volo set Città di partenza= '" + volo.getCittaPart() + " ' , Città di arrivo= '" + volo.getCittaArr()+ 
				 " ' , Tipo Aereo= '" + volo.getTipoAereo()+ " ' , Ora di Partenza=" + volo.getOraPartenza()+  " , Ora di Arrivo=" + volo.getOraArrivo()+
				 " WHERE  Giorno della Settimana='" + volo.getGiornoSett() + "' , Index Volo= " +volo.getIdVolo();
		System.out.println(query);
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
