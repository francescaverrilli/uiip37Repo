package homework4.Guastaferro.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import homework4.Guastaferro.dao.CandidatoDao;
import homework4.Guastaferro.model.Candidato;
import homework4.Guastaferro.model.ConnectionManager;
import homework4.Guastaferro.model.TitoloDiStudio;

public class DefaultCandidatoDao implements CandidatoDao {

	public DefaultCandidatoDao() {

	}

	public void insert(String telefono,Candidato candidato) {
		Connection conn;
		String query = "INSERT IGNORE INTO CANDIDATO VALUES("+candidato.getCodice()+",'"+ candidato.getCognome()+"','"+candidato.getNome()+"','"+ candidato.getViaresidenza()+"','"+candidato.getCap()+"','"+candidato.getCittaresidenza()+"','"+candidato.getDatanascita()+"','"+candidato.getLuogodinascita()+"')" ;
		String query2="INSERT IGNORE INTO TELEFONO VALUES('"+ telefono+"',"+candidato.getCodice()+")";
		try {
			conn= ConnectionManager.getConnection();
			Statement statement= conn.createStatement();
			statement.executeUpdate(query);
			statement.executeUpdate(query2);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public LinkedList<TitoloDiStudio> selectBytipo(int codice) {
		LinkedList<TitoloDiStudio> titoli= new LinkedList<TitoloDiStudio>();
		Connection connection;
		String query=( "Select t.codice,t.descrizione from( candidato AS c Inner Join istruzione As i On c.codice=i.titolo) Inner Join titolostudio As t On i.titolo=t.codice WHERE c.codice="+codice);
		try {
			connection=ConnectionManager.getConnection();
			Statement st= connection.createStatement();
			ResultSet result=st.executeQuery(query);
			while(result.next()) {
				
				int codice2 = result.getInt("codice");
				String descrizione=result.getString("descrizione");
				titoli.add(new TitoloDiStudio(codice2, descrizione));
			}
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return titoli;
	}

	public void update(int codice, String viaresidenza, String capresidenza, String cittaresidenza) {
		Connection conn;
		String query="Update candidato set viaresidenza='"+viaresidenza+"', capresidenza='"+capresidenza+"', cittaresidenza='"+cittaresidenza+"'"+
		" WHERE candidato.codice="+codice;
		System.out.println(query);
		try {
			conn=ConnectionManager.getConnection();
			Statement s= conn.createStatement();
			s.executeUpdate(query);
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


}
