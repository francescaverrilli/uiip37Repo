package it.abba.frank.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import it.abba.frank.ConnectionManager;
import it.abba.frank.dao.CandidatoDao;
import it.abba.frank.model.Candidato;
import it.abba.frank.model.TitoloStudio;

public class DefaultCandidatoDao implements CandidatoDao {

	public void insert(Candidato candidato, String telefono) {// Inserisce un candidato e il relativo numero di telefono
		Connection conn;
		String query = "INSERT IGNORE INTO candidato values('" + candidato.getCodice() + "', '" + candidato.getCognome()
				+ "', '" + candidato.getNome() + "', '" + candidato.getViaresidenza() + "', '"
				+ candidato.getCapresidenza() + "', '" + candidato.getCittaresidenza() + "', '"
				+ candidato.getDatanascita() + "', '" + candidato.getLuogonascita() + "')";
		String query2 = "INSERT IGNORE INTO telefono values('" + telefono + "', '" + candidato.getCodice() + "' )";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			statement.executeUpdate(query2);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public LinkedList<TitoloStudio> selectByTitolo(int id) { // Restituisce una lista ti titoli di studio appartenenti
		// ad un candidato
		LinkedList<TitoloStudio> lista = new LinkedList<TitoloStudio>();
		Connection conn;
		String query = "select titolostudio.codice, titolostudio.descrizione FROM (candidato inner join istruzione on candidato.codice=istruzione.candidato)inner join titolostudio on istruzione.titolo=titolostudio.codice where candidato.codice="
				+ id + "";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				int codice = rs.getInt("codice");
				String descrizione = rs.getString("descrizione");
				lista.add(new TitoloStudio(codice, descrizione));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public void update(int id, String via, String cap, String citta) { // Aggiorna la residenza di un candidato
		Connection conn;
		String query = "UPDATE candidato SET viaresidenza='" + via + "', capresidenza='" + cap + "', cittaresidenza='"
				+ citta + "' WHERE codice='" + id + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean checkID(int codice) { // Verifica se un codice del Candidato è già presente nel DB
		Connection conn;
		boolean verifica = false;
		String query = "select * FROM candidato where codice='" + codice + "'";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				verifica = false;
			} else {
				verifica = true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return verifica;
	}

	public LinkedList<Candidato> allCandidato() { // Restituisce una lista di tutti i candidati
		Connection conn;
		LinkedList<Candidato> listaid = new LinkedList<Candidato>();
		String query = "select * FROM candidato";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				int codice = rs.getInt("codice");
				String cognome = rs.getString("cognome");
				String nome = rs.getString("nome");
				String via = rs.getString("viaresidenza");
				String cap = rs.getString("capresidenza");
				String citta = rs.getString("cittaresidenza");
				String data = rs.getString("datanascita");
				String luogo = rs.getString("luogonascita");
				listaid.add(new Candidato(codice, cognome, nome, via, cap, citta, data, luogo));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaid;
	}

}
