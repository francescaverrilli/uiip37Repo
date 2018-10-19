package dao;

import Model.Aeroporto;

public interface AeroportoDao {

	public void insert(Aeroporto aeroporto);
	public Aeroporto selectByCitta(String citta);
	public void update (String citta, Aeroporto aeroporto);

}
