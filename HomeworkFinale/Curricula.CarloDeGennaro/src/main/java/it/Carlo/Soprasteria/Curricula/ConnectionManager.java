package it.Carlo.Soprasteria.Curricula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static final String MY_DRIVER = "com.mysql.jdbc.Driver";
	//l'unica cosa che cambia rispetto all'es aereoporto è il nome del db, ovvero sostituisci curricula a torreControllo
	private static final String MY_URL = "jdbc:mysql://localhost:3306/curricula?autoReconnect=true&useSSL=false";//curricula è il nome DB
	private static final String LOGIN = "root";
	private static final String PASSD = "root";

	public static Connection getconnection() throws ClassNotFoundException,
	SQLException{
		
		Class.forName(MY_DRIVER);
		return DriverManager.getConnection(MY_URL, LOGIN, PASSD);
		}

	}
