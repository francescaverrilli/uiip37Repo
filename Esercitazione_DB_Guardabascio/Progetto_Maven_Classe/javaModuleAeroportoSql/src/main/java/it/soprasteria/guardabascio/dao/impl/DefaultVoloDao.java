package it.soprasteria.guardabascio.dao.impl;

import it.soprasteria.guardabascio.ConnectionManager;
import it.soprasteria.guardabascio.dao.VoloDao;
import it.soprasteria.guardabascio.model.Volo;
import java.sql.*;
import java.util.LinkedList;



public class DefaultVoloDao implements VoloDao {

	public void insert(Volo volo) {
		Connection conn;
		String query="INSERT IGNORE INTO VOLO VALUES('"+volo.getIdVolo()+"', '"+volo.getGiornoSett()+"' , '"+
				volo.getCittaPart()+"', '" + volo.getCittaArr() +"','" + volo.getTipoAereo() +"','"+
				volo.getOraParteza()+"','" + volo.getOraArrivo()+ "')";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement= conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}

	public LinkedList<Volo> selectByTipo(int idVolo) {
		LinkedList<Volo> listaVoli= new LinkedList<Volo>();
		
		Volo v = new Volo();
		Connection conn;
		String query= "Select * from Volo where idVolo= '"+ idVolo +"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn .createStatement();
			ResultSet rs= statement.executeQuery(query);
			while(rs.next()) {
				int id= rs.getInt("idVolo");
				String giorno = rs.getString("giornoSett");
				String cittaP = rs.getString("cittaPart");
				String cittaA = rs.getString("cittaArr");
				String tipoAereo = rs.getString("tipoAereo");
				int oraPartenza = rs.getInt("oraPartenza");
				int oraArrivo = rs.getInt("oraArrivo");
				
				v = new Volo(idVolo, giorno, cittaP, cittaA, tipoAereo, oraPartenza, oraArrivo);
				listaVoli.add(v);
			}
			conn.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return listaVoli;
	}

	public void update(int idVolo, String giornoSett , int oraPartenza , int oraArrivo) {
		Connection conn;
		String query="UPDATE Volo set oraPartenza= '"+ oraPartenza+ "', oraArrivo= '" +oraArrivo +"'  WHERE idVolo='"+idVolo+"' and giornoSett='"+giornoSett+"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement= conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
