package it.sopraSteriaSilvio.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopraSteriaSilvio.dao.AereoDao;
import it.sopraSteriaSilvio.model.Aereo;

public class DefaultAereoDao implements AereoDao {
	
	public void insert(Aereo aereo) {
		//create a Stantemnet from the connection
		Connection conn;
		String query = "INSERT INTO aereo values('" + aereo.getTipoAereo()+ "',"+ aereo.getnPass()+","
				+aereo.getQuantitaMerci()+")";
		
		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			
			//insert the data
			statement.executeUpdate(query);
			conn.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
