package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Connection;
import Model.Aeroporto;
import dao.AeroportoDao;
import dao.ConnectionManager;

public class defaultAeroportoDao implements AeroportoDao {
	
	public void insert(Aeroporto aeroporto) {
		Connection conn;
		String query = "INSERT IGNORE INTO aeroporto values('" + aeroporto.getCittà() + "', '" + aeroporto.getNazione()
				+ "' , " + aeroporto.getNpiste() + ")";
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

	public Aeroporto selectByCitta(String citta) {
		Aeroporto aeroporto = null;
		Connection conn;
		String query = "Select * from Aeroporto where citta='" + citta + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				String città = rs.getString("citta");
				String nazione = rs.getString("nazione");
				int numeroPiste = rs.getInt("nPiste");
				aeroporto = new Aeroporto(città, nazione, numeroPiste);
			}
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aeroporto;
	}

	public void update(String citta, Aeroporto aeroporto) {
		Connection conn;
		String query = "UPDATE aeroporto set Nazione= '" + aeroporto.getNazione() + " ' , nPiste= " + aeroporto.getNpiste()+ 
				 " WHERE  città='" + aeroporto.getCittà() + "'";
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
