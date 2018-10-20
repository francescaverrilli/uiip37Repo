package it.soprasteria.guardaascio.dao.impl;

import java.sql.*;
import java.util.LinkedList;

import it.soprasteria.guardabascio.dao.CandidatoDao;
import it.soprasteria.guardabascio.model.Candidato;
import it.soprasteria.guardabascio.model.TitoloStudio;
import it.soprasteria.homework4.ConnectionManager;

public class DefaultCandidatoDao<Titolo> implements CandidatoDao{

	// Metodo epr inserire un nuovo candidato
	public void InsertCandidato(Candidato c) {
		Connection conn;
		//Candidato(codice, cognome, nome, viaresidenza, capResidenza, cittaResidenza, dataNascita, luogoNascita)
		String query="INSERT IGNORE INTO CANDIDATO VALUES("+c.getCodice()+", '"+c.getCognome()+"' ,'"+ c.getNome()+"' , '"+
														c.getViaresidenza()+"', '"+ c.getCapResidenza()+"' , '" + 
														c.getCittaResidenza()+"' , '"+
														c.getDataNascita()+"' , '" + c.getLuogoNascita()+"')";
		
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

	//metodo per selezionare i titoli di studio di un candidato
	public LinkedList<TitoloStudio> VisualizzaTitoli(int codice) {
		
		LinkedList<TitoloStudio> lista =  new LinkedList<TitoloStudio>();
		TitoloStudio t= new TitoloStudio();
		
		Connection conn;
		String query= "SELECT descrizione FROM  TITOLOSTUDIO  "
				+ " INNER JOIN  istruzione ON istruzione.titolo = titolostudio.codice "
				+ " INNER JOIN candidato ON candidato.codice = istruzione.candidato "
				+  "WHERE candidato.codice='"+ codice+"'";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn .createStatement();
			ResultSet rs= statement.executeQuery(query);
			while(rs.next()) {
				String descrizione = rs.getString("descrizione");
				t= new TitoloStudio(codice, descrizione);
				lista.add(t);
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

		return lista;	
	}
	
	// metodo per aggiornare la residenza di un candidato.
	// oltre al candidato passiamo i dati della nuova residenza
	public void AggiornaResidenza(int codice, String viaResidenza, String capResidenza, String cittaResidenza) {
		
		Connection conn;
		String query="UPDATE Candidato set viaResidenza= '"+ viaResidenza + "', capResidenza= '" +capResidenza +"', cittaResidenza= '" + cittaResidenza +"'  WHERE codice='"+codice +"'";
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

	// usiamo questo metodo per stampare il candidato una volta
	// aggiornati i campi.
	
	public Candidato selectByTipo(int codice) {
		Candidato c = new Candidato();
		Connection conn;
		String query= "Select * from candidato where codice= '"+ codice +"'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn .createStatement();
			ResultSet rs= statement.executeQuery(query);
			if(rs.next()) {
				int codice1= rs.getInt("codice");
				String cognome = rs.getString("cognome");
				String nome = rs.getString("nome");
				String viaresidenza= rs.getString("viaresidenza");
				String capResidenza = rs.getString("capresidenza");
				String cittaResidenza = rs.getString("cittaresidenza");
				String datanascita = rs.getString("datanascita");
				String luogonascita = rs.getString("luogonascita");
				c = new Candidato(codice1, cognome, nome, viaresidenza, capResidenza, cittaResidenza, datanascita, luogonascita);
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
		return c;

	}

	// Metrodo per stampare tutti i candidati
	public LinkedList<Candidato> stampaCandidati() {
		LinkedList<Candidato> listaCandidati= new LinkedList<Candidato>();
		Candidato c = new Candidato();
		Connection conn;
		
		String query= "Select * from candidato";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn .createStatement();
			ResultSet rs= statement.executeQuery(query);
			while(rs.next()) {
				int codice1= rs.getInt("codice");
				String cognome = rs.getString("cognome");
				String nome = rs.getString("nome");
				String viaresidenza= rs.getString("viaresidenza");
				String capResidenza = rs.getString("capresidenza");
				String cittaResidenza = rs.getString("cittaresidenza");
				String datanascita = rs.getString("datanascita");
				String luogonascita = rs.getString("luogonascita");
				c = new Candidato(codice1, cognome, nome, viaresidenza, capResidenza, cittaResidenza, datanascita, luogonascita);
				listaCandidati.add(c);
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
		return listaCandidati;
	}

}
