package dao;

import Model.Volo;

public interface VoloDao {

	public void insert(Volo volo);
	public Volo selectByGiornoID(String giornoSett,int idVolo);
	public void update (String giornoSett,int idVolo, Volo volo);
}
