package dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import Model.Aereo;
import dao.AereoDao;
import dao.ConnectionManager;

public class defaultAereoDao implements AereoDao {

	public void insert(Aereo aereo) {
		Connection conn;
		String query = "INSERT IGNORE INTO aereo values('" + aereo.getTipoAereo() + "', " + aereo.getnPass() + ", "
				+ aereo.getQuantitaMerci() + ")";
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

	public Aereo selectByTipo(String tipoAereo) {
		Aereo a = null;
		Connection conn;
		String query = "Select * from Aereo where tipoAereo='" + tipoAereo + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				String tipoaereo = rs.getString("tipoAereo");
				int passeggeri = rs.getInt("nPass");
				int merci = rs.getInt("quantitaMerci");
				a = new Aereo(tipoaereo, passeggeri, merci);
			}
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	public void update(String tipoAereo,Aereo aereo) {
		Connection conn;
		String query = "UPDATE aereo set nPass=" + aereo.getnPass() + " , quantitaMerci= " + aereo.getQuantitaMerci()+ 
				 " WHERE  tipoAereo='" + aereo.getTipoAereo() + "'";
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