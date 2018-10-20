package it.soprasteria.homework4;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionManager {

	private static final String MY_DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String MY_URL = "jdbc:mysql://localhost:3306/archivio?autoreconnect=true&useSSL=false";
	private static final String LOGIN = "root";
	private static final String PASSWORD= "root";
	
	public static Connection getConnection () throws ClassNotFoundException,
	SQLException{
		Class.forName(MY_DRIVER);
		return DriverManager.getConnection(MY_URL, LOGIN, PASSWORD);
		
	}
}
