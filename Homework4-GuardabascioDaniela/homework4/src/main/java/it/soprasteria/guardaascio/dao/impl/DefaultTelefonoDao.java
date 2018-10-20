package it.soprasteria.guardaascio.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.soprasteria.homework4.*;
import it.soprasteria.guardabascio.dao.TelefonoDao;
import it.soprasteria.guardabascio.model.Telefono;

public class DefaultTelefonoDao implements TelefonoDao{

	public void InsertTelefono(Telefono t) {
		Connection conn;
		String query="INSERT IGNORE INTO TELEFONO VALUES('"+t.getNumero()+"', '"+t.getCandidato()+"')";
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

	public Telefono selectByTipo(int candidato) {
		Telefono t = new Telefono();
		Connection conn;
		String query= "Select * from TELEFONO where candidato= '"+ candidato +"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn .createStatement();
			ResultSet rs= statement.executeQuery(query);
			if(rs.next()) {
				int candidato1= rs.getInt("candidato");
				String telefono = rs.getString("numero");
				t= new Telefono(telefono, candidato1);
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
		return t;

	}

}
