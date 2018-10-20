package it.silvioCurricula.CurricolaSilvio.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.silvioCurricula.CurriculaSilvio.dao.CandidatoDao;
import it.silvioCurricula.CurriculaSilvio.model.Candidato;
import it.silvioCurricula.CurriculaSilvio.model.TitoloStudio;

public class DefaultCandidatoDao implements CandidatoDao {

	public void insert(Candidato candidato, String numero) {
		Connection conn;
		String query = "insert ignore into candidato values(" + candidato.getCodice() + ",'" + candidato.getCognome()
				+ "','" + candidato.getNome() + "','" + candidato.getViaResidenza() + "','"
				+ candidato.getCapResidenza() + "','" + candidato.getCittaResidenza() + "','"
				+ candidato.getDataNascita() + "','" + candidato.getLuogoNascita() + "')";

		String query2 = "insert ignore into telefono values('" + numero + "'," + candidato.getCodice() + ")";

		try {
			conn = ConnectionManager.getConnction();
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

	public Vector<TitoloStudio> select(int codiceC) {
		Connection conn;
		Vector<TitoloStudio> totTitoliStudiCand = new Vector<TitoloStudio>();

		String query = "select titolostudio.codice, titolostudio.descrizione from (candidato inner join istruzione on candidato.codice="
				+ "istruzione.candidato) inner join titolostudio on istruzione.titolo=titolostudio.codice where candidato.codice="
				+ codiceC;

		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				int codice = rs.getInt("codice");
				String descrizione = rs.getString("descrizione");
				totTitoliStudiCand.add(new TitoloStudio(codice, descrizione));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return totTitoliStudiCand;

	}

	public void update(int codice, String via, String cap, String citta) {
		Connection conn;
		String query = "Update Candidato set viaresidenza='" + via + "', capresidenza='" + cap + "', cittaresidenza='"
				+ citta + "' where candidato.codice=" + codice;
		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Vector<Integer> selectCodiciCandidato() {
		Connection conn;
		Vector<Integer> listaCodici = new Vector<Integer>();

		String query = "select candidato.codice from candidato";

		try {
			conn = ConnectionManager.getConnction();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				int codice = rs.getInt("codice");
				listaCodici.add(codice);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return listaCodici;

	}

}
