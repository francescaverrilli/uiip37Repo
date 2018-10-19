package it.sopra.DeGennaro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;

public class ConnectionManager {
private static final String MY_DRIVER = "com.mysql.jdbc.Driver";
private static final String MY_URL = "jdbc:mysql://localhost:3306/torreControllo?autoReconnect=true&useSSL=false";//torreControllo � il nome DB
private static final String LOGIN = "root";
private static final String PASSD = "root";

public static Connection getconnection() throws ClassNotFoundException,
SQLException{
	
	Class.forName(MY_DRIVER);
	return DriverManager.getConnection(MY_URL, LOGIN, PASSD);
	}

}
