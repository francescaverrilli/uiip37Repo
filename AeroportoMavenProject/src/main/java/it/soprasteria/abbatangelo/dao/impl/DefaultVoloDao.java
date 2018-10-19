package it.soprasteria.abbatangelo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.soprasteria.abbatangelo.ConnectionManager;
import it.soprasteria.abbatangelo.dao.VoloDao;
import it.soprasteria.abbatangelo.model.Aeroporto;
import it.soprasteria.abbatangelo.model.Volo;

public class DefaultVoloDao implements VoloDao {

	public void insert(Volo volo) {
		Connection conn;
		String query = "INSERT IGNORE INTO volo values('" + volo.getIdVolo() + "', '" + volo.getGiornoSet() + "', '"
				+ volo.getCittaPart() + "' , '" + volo.getCittaArr() + "', '" + volo.getTipoAereo() + "', '"
				+ volo.getOraPartenza() + "', '" + volo.getOraArrivo() + "')";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Volo selectByIdVolo(int idVolo) {
		Volo v = null;
		Connection conn;
		String query = "Select * from volo where idVolo='" + idVolo + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeQuery(query);
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				int idvolo = rs.getInt("idVolo");
				String giornoSett = rs.getString("giornoSett");

				String cittaPart = rs.getString("cittaPart");
				String cittaArr = rs.getString("cittaArr");
				String tipoAereo = rs.getString("tipoAereo");

				int oraPart = rs.getInt("oraPartenza");
				int oraArr = rs.getInt("oraArrivo");
				v = new Volo(idvolo, giornoSett, cittaPart, cittaArr, tipoAereo, oraPart, oraArr);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;
	}

	public void update(int idVolo, Volo volo) {
		Connection conn;
		String query = "UPDATE Volo SET idVolo='" + volo.getIdVolo() + "', giornoSett='" + volo.getGiornoSet()
				+ "', cittaPart='" + volo.getCittaPart() + "', cittaArr='" + volo.getCittaArr() + "', tipoAereo='"
				+ volo.getTipoAereo() + "',oraPartenza='" + volo.getOraPartenza() + "', oraArrivo='"
				+ volo.getOraArrivo() + "' WHERE idVolo='" + idVolo + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateCittaPart(int idVolo, String cittaPart) {
		Connection conn;
		String query = "UPDATE Volo SET cittaPart='" + cittaPart + "' WHERE idVolo='" + idVolo + "'";
		try {
			conn = ConnectionManager.getConnection();
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
