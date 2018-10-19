package it.sopa.santoro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import it.sopra.santoro.ConnectionManager;
import it.sopra.santoro.dao.VoloDao;
import it.sopra.santoro.model.Aereoporto;
import it.sopra.santoro.model.Volo;

public class Default_Volo_Dao implements VoloDao{
	

	public void insert(Volo volo) {
		Connection conn;
		String query="INSERT IGNORE INTO VOLO VALUES('"+volo.getId_volo()+"','"+volo.getGiornoSett()+"','"+volo.getCittaPart()+"','"+volo.getCittaArr()+"','"+volo.getTipoAereo()+"','"+volo.getOraPart()+"','"+volo.getOraArr()+"'"+")";
		
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
	public Volo selectByTipo(int idVolo, String giornoSett) {
		
		Volo a = null;
		Connection conn;
		String query="Select *from volo where idVolo='"+idVolo+"' and giornoSett='"+giornoSett+"'";
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery(query);
			if(rs.next()) {
				int idVolo1 = rs.getInt("idVolo");
				String giornoSett1  = rs.getString("giornoSett");
				String cittaPart  = rs.getString("cittaPart");
				String cittaArr  = rs.getString("cittaArr");
				String tipoAereo = rs.getString("tipoAereo");
				int oraPartenza = rs.getInt("oraPartenza");
				int oraArrivo = rs.getInt("oraArrivo");
				a = new Volo(idVolo1,giornoSett1,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo);
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
	public void update(int idVolo, String giornoSett, int oraPartenza) {
		
		Volo a = null;
		Connection conn;
		String query="Update Volo set oraPartenza='"+oraPartenza+"' where idVolo='"+idVolo+"' and giornoSett='"+giornoSett+"'";
		
		
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


