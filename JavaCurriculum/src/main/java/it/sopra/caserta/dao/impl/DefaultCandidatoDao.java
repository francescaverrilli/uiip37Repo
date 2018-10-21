package it.sopra.caserta.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.sopra.caserta.dao.CandidatoDao;
import it.sopra.caserta.model.Candidato;
import it.sopra.caserta.utility.ConnectionManager;

public class DefaultCandidatoDao implements CandidatoDao {

	/**
	 * Metodo per l'inserimento di un oggetto ti tipo candidato 
	 * all'interno del Database
	 * 
	 * restituisce un valore intero per verificare se l'inserimento è 
	 * avvenuto con successo.
	 */
	public int insert(Candidato candidato) {
		int ret = 0;
		Connection conn;
		String query = "INSERT IGNORE INTO candidato values(" + candidato.getCodice() + ",'" + candidato.getCognome() + "','"
				+ candidato.getNome() + "','" + candidato.getViaIndirizzo() + "','"  + candidato.getCap() + "','" + candidato.getCitta() + "','"
				+ candidato.getDataNascita() + "','" + candidato.getLuogoNascita() + "')";

		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// Insert the data;
			ret = statement.executeUpdate(query);
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ret;
		
	}
	
	/**
	 * Metodo per cercare all'interno del database un candidato
	 * attraverso il proprio codice identificativo 
	 */
	public Candidato selectByCodice(int tipo) {
		Candidato d = null;
		Connection conn;
		String query = "SELECT * FROM candidato WHERE codice=" + tipo;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				int codice = rs.getInt("codice");
				String cognome = rs.getString("cognome");
				String nome = rs.getString("nome");
				String viaresidenza = rs.getString("viaresidenza");
				String cap = rs.getString("capresidenza");
				String citta = rs.getString("cittaresidenza");
				String data = rs.getString("datanascita");
				String luogonascita = rs.getString("luogodinascita");
				d = new Candidato(codice, cognome, nome, viaresidenza, cap, citta,data,luogonascita);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	
	/**
	 * Metodo per aggiornare la residenza di un candidato.
	 * 
	 * restituisce un valore intero per verificare se l'aggiornamento è 
	 * avvenuto con successo.
	 */
	public int updateResidenza(int tipo, String indirizzo, String cap, String citta) {
		int ret = 0;
		Connection conn;
		String query = "UPDATE candidato set viaresidenza= '" + indirizzo + "', " +
					"capresidenza= '" + cap + "' , cittaresidenza='" + citta 
				+"' WHERE codice=" +tipo;
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// Insert the data;
			ret = statement.executeUpdate(query);
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
		
	}
	
	/**
	 * Metodo per cercare all'interno del Database tutti i titoli di studio
	 * di un determinato candidato.
	 * 
	 * Restituisce un Vector di stringhe con i titoli di studio del candidato.
	 */
	public Vector<String> getTitoliByCodice(int cod) {
		Vector<String> titoli = new Vector<String>();

		
		Connection conn;
		String query = "SELECT t.descrizione  FROM candidato AS c"
				+ " INNER JOIN istruzione AS i ON i.candidato = c.codice"
				+ " INNER JOIN titolostudio AS t ON t.codice = i.titolo"
				+ " WHERE c.codice ="  + cod ;
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				 titoli.add(rs.getString("descrizione"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return titoli;
	}

	/**
	 * Metoto per ricercare tutti i candidati all'interno del database. 
	 */
	public Vector<Candidato> getCandidati() {
		Vector<Candidato> candidati = new Vector<Candidato>();

		
		Connection conn;
		String query = "SELECT *  FROM candidato";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				 candidati.add(new Candidato(rs.getInt("codice"), rs.getString("cognome"),
						 rs.getString("nome"),rs.getString("viaresidenza"), 
						 rs.getString("capresidenza"), rs.getString("cittaresidenza"), 
						 rs.getString("datanascita"), rs.getString("luogodinascita")));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return candidati;
	}

}
