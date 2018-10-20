package it.soprasteria.annicchiarico.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.soprasteria.annicchiarico.dao.CandidatoDao;
import it.soprasteria.annicchiarico.dao.ConnectionManager;
import it.soprasteria.annicchiarico.model.Candidato;
import it.soprasteria.annicchiarico.model.TitoloStudio;

public class DefaultCandidatoDao implements CandidatoDao {

	// metodo per l'inserimento di un candidato e del suo rispettivo telefono
	// attraverso due query
	public void insert(Candidato candidato, String telefono) {
		Connection conn;

		/*
		 * Candidato(int codice, String cognome, String nome, String viaresidenza,
		 * String capresidenza, String cittaresidenza, String datanascita, String
		 * luogonascita)
		 */

		String query1 = "INSERT IGNORE INTO candidato values ('" + candidato.getCodice() + "','"
				+ candidato.getCognome() + "','" + candidato.getNome() + "','" + candidato.getViaresidenza() + "','"
				+ candidato.getCapresidenza() + "','" + candidato.getCittaresidenza() + "','"
				+ candidato.getDatanascita() + "','" + candidato.getLuogonascita() + "')";

		String query2 = "INSERT IGNORE INTO telefono values ('" + telefono + "', '" + candidato.getCodice() + "')";

		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query1);
			statement.executeUpdate(query2);
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// metodo per la visualizzazione di tutti i titoli di studio di un candidato
	public Vector<TitoloStudio> selectByTitoloStudio(int cod) {

		Connection conn;

		Vector<TitoloStudio> vectorTitoloStudio = new Vector<TitoloStudio>();

		String query = "Select TitoloStudio.codice, TitoloStudio.descrizione from (candidato inner join istruzione on candidato.codice= istruzione.candidato) inner join titoloStudio on "
				+ "istruzione.titolo = titoloStudio.codice where candidato.codice =" + cod + "";

		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				int codiceTitolo = rs.getInt("codice");
				String descrizione = rs.getString("descrizione");

				TitoloStudio titolo = new TitoloStudio(codiceTitolo, descrizione);

				vectorTitoloStudio.add(titolo);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vectorTitoloStudio;
	}

	// metodo per la visualizzazione di tutti i codici dei candidati presenti nel
	// Database
	public Vector<Integer> selectByCodice() {
		Connection conn;
		String query = "select candidato.codice from candidato";

		Vector<Integer> listaCodici = new Vector<Integer>();
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int codCandidato = rs.getInt("codice");
				listaCodici.add(codCandidato);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCodici;
	}

	// metodo per l'aggiornamento della residenza di un candidato
	public void update(String viaresidenza, String capresidenza, String cittaresidenza, int codice) {
		Connection conn;

		/*
		 * Candidato(int codice, String cognome, String nome, String viaresidenza,
		 * String capresidenza, String cittaresidenza, String datanascita, String
		 * luogonascita)
		 */

		String query = " upDate candidato set  viaresidenza= '" + viaresidenza + "' , capresidenza= '" + capresidenza
				+ "' , cittaresidenza= '" + cittaresidenza + "' where Candidato.codice= " + codice;

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

}
