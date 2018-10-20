package it.soprasteria.homework4.santoro.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import com.mysql.jdbc.Connection;

import it.soprasteria.homework4.santoro.ConnectionManager;
import it.soprasteria.homework4.santoro.dao.CandidatoDao;
import it.soprasteria.homework4.santoro.model.Candidato;

public class Default_Candidato_Dao implements CandidatoDao{

	public void insert(Candidato candidato) {
		Connection conn;
		
		String query="INSERT IGNORE INTO CANDIDATO VALUES("+candidato.getCodice()+", '"+candidato.getCognome()+"' ,'"+ candidato.getNome()+"' , '"+candidato.getViaResidenza()+"',"
				+ " '"+ candidato.getCapResidenza()+"' , '" + candidato.getCittaResidenza()+"' , '"+candidato.getDataNascita()+"' , '" + candidato.getLuogoNascita()+"')";
		
		try {
			
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement=conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Candidato selectByTipo(int codice) {
		
		Candidato candidato = null;
		Connection conn;
		String query="Select *from candidato where codice='"+codice+"'";
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery(query);
			if(rs.next()) {
				int codice1 = rs.getInt("codice");
				String cognome = rs.getString("cognome");
				String nome = rs.getString("nome");
				String viaResidenza = rs.getString("viaresidenza");
				String capResidenza = rs.getString("capresidenza");
				String cittaResidenza = rs.getString("cittaresidenza");
				String dataNascita = rs.getString("datenascita");
				String luogoNascita = rs.getString("luogonascita");
				candidato = new Candidato(codice1,cognome,nome,viaResidenza,capResidenza,cittaResidenza,dataNascita,luogoNascita);
			}
			
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return candidato;
	}

	public void update(int codice,String viaResidenza,String capResidenza,String cittaResidenza) {
		Connection conn;
		String query="Update candidato set viaresidenza='"+viaResidenza+"',capresidenza='"+capResidenza+"',cittaresidenza='"+cittaResidenza+"' where codice="+codice+"";
		
		
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);

			
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public LinkedList<String> titoloStudiCandidati() {
		Connection conn;
		LinkedList<String>l=new LinkedList<String>();
		String query="select candidato.nome,candidato.cognome,titolostudio.descrizione from candidato,istruzione,titolostudio where candidato.codice=istruzione.candidato and istruzione.titolo=titolostudio.codice;";
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				String concatenate=null;
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String titoloStudio = rs.getString("descrizione");
				concatenate=nome+" "+cognome+" "+titoloStudio;
				l.add(concatenate);
			}
			
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	
		return l;
	}
	
	public LinkedList<Candidato> selectAll() {
		Candidato candidato=null;
		LinkedList<Candidato>l=new LinkedList<Candidato>();
		Connection conn;
		String query="Select *from candidato;";
		try {
			conn=(Connection) ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				int codice1 = rs.getInt("codice");
				String cognome = rs.getString("cognome");
				String nome = rs.getString("nome");
				String viaResidenza = rs.getString("viaresidenza");
				String capResidenza = rs.getString("capresidenza");
				String cittaResidenza = rs.getString("cittaresidenza");
				String dataNascita = rs.getString("datenascita");
				String luogoNascita = rs.getString("luogonascita");
				candidato = new Candidato(codice1,cognome,nome,viaResidenza,capResidenza,cittaResidenza,dataNascita,luogoNascita);
				l.add(candidato);
			}
			
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return l;
	}
	
		
}
	
	


