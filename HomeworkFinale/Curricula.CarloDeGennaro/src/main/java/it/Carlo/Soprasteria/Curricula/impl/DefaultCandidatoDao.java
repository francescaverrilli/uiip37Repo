package it.Carlo.Soprasteria.Curricula.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.Carlo.Soprasteria.Curricula.ConnectionManager;
import it.Carlo.Soprasteria.Curricula.dao.CandidatoDao;
import it.Carlo.Soprasteria.Curricula.model.Candidato;
import it.Carlo.Soprasteria.Curricula.model.TitoloStudio;

public class DefaultCandidatoDao implements CandidatoDao{
//Passo semplicemente una stringa telefono non l'oggetto telefono, poichè suppongo che mi venga passata
	public void insert(Candidato candidato, String telefono) {
		//create a statement from the connection
		Connection conn;
		//i get nello stesso ordine con cui sono le colonne nel db
		
		//inserisco nella tabella Candidato un nuovo candidato
		String query = "INSERT IGNORE INTO candidato values(" + candidato.getCodice() + ",'" + candidato.getCognome() + "','" + candidato.getNome() + "','"
				+ candidato.getViaResidenza() +"','"+ candidato.getCapResidenza() + "','" + candidato.getCittaResidenza() + "','" + candidato.getDataNascita() + "','" + candidato.getLuogoNascita() +"')";
		//mettendo ignore se è già presente quella riga con quell'id ovvero con quella chiave primaria in tabella 
		//e provo a reinserirla, anche se è una primary key e quindi dovrebbe dare errore non lo da,
		
		//vado ad inserire il numero di telefono  e l'id candidato nella tabella Telefono
		String query2 = "INSERT IGNORE INTO telefono values(" + telefono + "," + candidato.getCodice() + ")";
		
		try {
			// establish a connection with the data source you want to use
			conn=ConnectionManager.getconnection(); //creo una connessione
			//A Statement is an interface that represents a SQL statement. You execute Statement objects,
			//and they generate ResultSet objects, which is a table of data representing a database result set.
			//You need a Connection object to create a Statement object.
			Statement statement = conn.createStatement(); //installiamo uno statement (serve per le query)
			//Insert the data;
			/*
			To execute a query, call an execute method from Statement such as the following:
execute: Returns true if the first object that the query returns is a ResultSet object.
		Use this method if the query could return one or more ResultSet objects.
		Retrieve the ResultSet objects returned from the query by repeatedly calling Statement.getResultSet.
executeQuery: Returns one ResultSet object.
executeUpdate: Returns an integer representing the number of rows affected by the SQL statement.
		Use this method if you are using INSERT, DELETE, or UPDATE SQL statements.
			  */
			
			statement.execute(query);
			statement.execute(query2);
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
		
	public Vector<TitoloStudio> selectByTitoloStudio(int idCandidato) { 
		 Connection conn; 
		 Vector<TitoloStudio> listaTitoliStudio = new Vector<TitoloStudio>(); 

		 String query = "select t.codice, t.descrizione FROM candidato as c inner join istruzione as i on c.codice=i.candidato inner join titolostudio as t on i.titolo=t.codice where c.codice="
					+ idCandidato + "";

		 try { 
		  conn = ConnectionManager.getconnection(); 
		  Statement statement = conn.createStatement();
		  /*
		   A ResultSet is a Java object that contains the results of executing an SQL query.
		   In other words, it contains the rows that satisfy the conditions of the query.
		   The data stored in a ResultSet object is retrieved through a set of get methods that allows access to the various columns of the current row.
		   The ResultSet.next method is used to move to the next row of the ResultSet, making it the current row.
		   */
		  ResultSet rs = statement.executeQuery(query); 
		  while (rs.next()) { 
		   int codiceTitoloS = rs.getInt("codice"); //tra "" bisogna mettere lo stesso nome dato alle colonne e le colonne devono essere nello stesso ordine del db
		   String descrizioneTitoloS = rs.getString("descrizione"); 
		   listaTitoliStudio.add(new TitoloStudio(codiceTitoloS, descrizioneTitoloS)); 
		  } 
		  conn.close(); 
		 } catch (ClassNotFoundException e) { 
		  e.printStackTrace(); 
		 } catch (SQLException e) { 
		  e.printStackTrace(); 

		 } 
		 return listaTitoliStudio; 

		} 

		public void update(int codice, String via, String cap, String citta) { 
		 Connection conn; 
		 String query = "Update Candidato set viaresidenza='"+ via +"', capresidenza='"+ cap 
				 +"', cittaresidenza='"+ citta +"' where candidato.codice="+ codice; 
		 try { 
		  conn = ConnectionManager.getconnection(); 
		  Statement statement = conn.createStatement(); 
		  statement.executeUpdate(query); 
		  conn.close(); 
		 }catch(ClassNotFoundException e) { 
		  e.printStackTrace(); 
		 }catch(SQLException e) { 
		  e.printStackTrace(); 
		 } 
		}
		
		
		public boolean controllaSeIdPresente(int codiceCandidato) {
			boolean trovato = false;
			Connection conn;
			
			//vedo se nella tabella Candidato è presente il codice che gli passo come parametro
			String query = "select codice FROM candidato where codice='" + codiceCandidato + "'";
			try {
				conn = ConnectionManager.getconnection();
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(query);
				if (rs.next()) {
					trovato = false;
				} 
				else 
					{
					trovato = true;
					}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return trovato;
		}
}
