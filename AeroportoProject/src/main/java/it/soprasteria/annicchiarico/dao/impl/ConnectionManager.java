package it.soprasteria.annicchiarico.dao.impl;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


public class ConnectionManager {

	private static final String MY_DRIVER = "com.mysql.jdbc.Driver";
	private static final String MY_URL = "jdbc:mysql://localhost:3306/viaggio?autoReconnect=true&useSSL=false";
	private static final String LOGIN = "root";
	private static final String PASSWD = "root";
	
	public static Connection getConnection () throws ClassNotFoundException,SQLException {
		Class.forName(MY_DRIVER);
		return (Connection) DriverManager.getConnection(MY_URL, LOGIN, PASSWD);
	}
}
