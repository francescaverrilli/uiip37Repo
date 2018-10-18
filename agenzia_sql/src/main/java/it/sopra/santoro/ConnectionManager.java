package it.sopra.santoro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static final String My_DRIVER ="com.mysql.jdbc.Driver";
	private static final String MY_URL="jdbc:mysql://localhost:3306/agenzia?autoReconnected=true&useSSL=false";
	private static final String LOGIN="root";
	private static final String PASSWD="root";
	
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(My_DRIVER);
		return DriverManager.getConnection(MY_URL,LOGIN,PASSWD);
	}

}
