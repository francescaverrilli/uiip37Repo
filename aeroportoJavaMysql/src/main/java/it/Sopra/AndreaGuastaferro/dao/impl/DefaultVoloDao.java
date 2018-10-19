package it.Sopra.AndreaGuastaferro.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.Sopra.AndreaGuastaferro.dao.VoloDao;
import it.Sopra.AndreaGuastaferro.model.Aereo;
import it.Sopra.AndreaGuastaferro.model.Aeroporto;
import it.Sopra.AndreaGuastaferro.model.ConnectionManager;
import it.Sopra.AndreaGuastaferro.model.Volo;

public class DefaultVoloDao implements VoloDao{

	public DefaultVoloDao() {
		// TODO Auto-generated constructor stub
	}

	public void insert(Volo volo) {
		Connection conn;
		String query= "Insert into volo values('" +volo.getId()+"'," + volo.getGiorno()+","+ volo.getCittaDipartenza()+","+volo.getCittaDarrivo()+","+volo.getTipoAereo()+","+volo.getOra_partenza()+","+volo.getOra_arrivo()+")";
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

	public Volo selectByTipo(int id, String giorno) {
		
		Volo a= null;
		Connection conn;
		String query =( "Select * from volo where idVolo= "+id+" "+" &&"+ " giornoSett='"+giorno+"'");
		System.out.println(query);
		try {
			conn=ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				int id2= rs.getInt("idVolo");
				String giornoSett = rs.getString("giornoSett");
				String cittaPart  = rs.getString("cittaPart");
				String cittaArr= rs.getString("cittaArr");
				String tipoAereo= rs.getString("tipoAereo");
				int oraPartenza= rs.getInt("oraPartenza");
				int oraArrivo = rs.getInt("oraArrivo");
				a = new Volo(id2,giornoSett,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo);
			}
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;
	}

	public void update(int id,String giorno, Volo volo) {
		
		Connection conn;
		String query = "UPDATE volo set cittaPart='" + volo.getCittaDipartenza() + "', cittaArr='" + volo.getCittaDarrivo() + 
				"', tipoAereo='" + volo.getTipoAereo() + "', oraPartenza=" + volo.getOra_partenza() + 
				", oraArrivo=" + volo.getOra_arrivo()
				+" WHERE idVolo=" +id+ " AND giornoSett='" + giorno + "'";
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
