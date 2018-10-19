package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import Model.Volo;
import dao.ConnectionManager;
import dao.VoloDao;

public class defautVoloDao implements VoloDao{
	
		public void insert(Volo volo) {
			Connection conn;
			String query = "INSERT IGNORE INTO volo values('" + volo.getCittaArr() + "', " + volo.getCittaPart()+ "', "
			+ volo.getGiornoSett()+ "', " + volo.getIdVolo()
					+ ", " + volo.getOraArrivo()+ ", " + volo.getOraPartenza()+ ")";
			System.out.println(query);
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

		public Volo selectByGiornoID(String giornoSett, int idVolo) {
			Volo volo = null;
			Connection conn;
			String query = "Select * from Volo where idVolo=" + idVolo + ",&& giornoSett='"+giornoSett+"'";
			try {
				conn = ConnectionManager.getConnection();
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(query);
				if (rs.next()) {
					int indexVolo= rs.getInt("idVolo");
					String giornoSettimana = rs.getString("giornoSett");
					String cittaPart = rs.getString("cittaPart");
					String cittaArr = rs.getString("cittaArr");
					String tipoAereo = rs.getString("tipoAereo");
					int oraPartenza = rs.getInt("oraPartenza");
					int oraArrivo = rs.getInt("oraArrivo");
					volo = new Volo(indexVolo,giornoSettimana,cittaPart,cittaArr,tipoAereo,oraPartenza,oraArrivo);
				}
				
				conn.close();

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return volo;
		}

		public void update(String giornoSett, int idVolo,Volo volo) {
			Connection conn;
			String query = "UPDATE volo set Città di partenza= '" + volo.getCittaPart() + " ' , Città di arrivo= '" + volo.getCittaArr()+ 
					 " ' , Tipo Aereo= '" + volo.getTipoAereo()+ " ' , Ora di Partenza=" + volo.getOraPartenza()+  " , Ora di Arrivo=" + volo.getOraArrivo()+
					 " WHERE  Giorno della Settimana='" + volo.getGiornoSett() + "' , Index Volo= " +volo.getIdVolo();
			System.out.println(query);
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
