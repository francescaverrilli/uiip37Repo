package dao;

import Model.Aereo;

public interface AereoDao {

	public void insert(Aereo aereo);
	public Aereo selectByTipo(String tipoAereo);
	public void update (String tipoAereo, Aereo aereo);
}
