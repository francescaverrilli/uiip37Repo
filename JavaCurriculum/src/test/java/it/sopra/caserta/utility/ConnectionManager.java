package it.sopra.caserta.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	private static final String MY_DRIVER = "com.mysql.jdbc.Driver";
	private static final String MY_URL = "jdbc:mysql://localhost:3306/curriculum?autoReconnect=true&useSSL=false";
	private static final String LOGIN = "root";
	private static final String PASSD = "root";
	
	public static Connection getConnection() throws ClassNotFoundException, 
			SQLException {
		
		
		Class.forName(MY_DRIVER);
		return DriverManager.getConnection(MY_URL, LOGIN,PASSD );
		
	}

}
