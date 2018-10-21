package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import Dao.CandidatoDao;
import Dao.ConnectionManager;
import Model.Candidato;
import Model.TitoloStudio;

public class defaultCandidatoDao implements CandidatoDao {

	public void insert(Candidato candidato, String telefono) {
		Connection conn;
		String query = "INSERT IGNORE INTO candidato values(" + candidato.getCodice() + ", '" + candidato.getCognome()
				+ "' , '" + candidato.getNome() + "' , '" + candidato.getViaresidenza() + "' , '"
				+ candidato.getCapresidenza() + "' , '" + candidato.getCittaresidenza() + "' , '"
				+ candidato.getDatanascita() + "' , '" + candidato.getLuogonascita() + "')";
		String query1 = "INSERT IGNORE INTO telefono values('" + telefono + "' , " + candidato.getCodice() + ")";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			statement.executeUpdate(query1);
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Vector<TitoloStudio> selectByTitoloStudio(int codice) {
		Connection conn;
		Vector<TitoloStudio> listaTitoli = new Vector<TitoloStudio>();
		String query = "select titolostudio.codice, titolostudio.descrizione from candidato inner join istruzione on candidato.codice=istruzione.candidato\r\n"
				+ "inner join titolostudio on istruzione.titolo=titolostudio.codice\r\n" + "where candidato.codice="
				+ codice;
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				int codiceTitolo = rs.getInt("codice");
				String descrizione = rs.getString("descrizione");
				TitoloStudio titolo = new TitoloStudio(codiceTitolo, descrizione);
				listaTitoli.add(titolo);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTitoli;
	}

	public void update(String viaresidenza, String capresidenza, String cittaresidenza, int codice) {
		Connection conn;
		String query = "Update Candidato set ViaResidenza= '"+ viaresidenza + "' , CapResidenza='" + capresidenza
				+ "' , CittaResidenza='" + cittaresidenza+ "' WHERE Candidato.codice=" + codice;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
