package it.sopraSteriaSilvio.dao;

import it.sopraSteriaSilvio.model.Aereo;
import it.sopraSteriaSilvio.model.Aeroporto;
import it.sopraSteriaSilvio.model.Volo;

public interface AereoDao {
	
	public void insert (Aereo aereo);
	public Aereo selectByTipo(String tipo);
	public void update(String tipo, Aereo aereo);
	
	public void updateAeroporto(String citta, Aeroporto aeroporto);
	public void updateVolo(int id, String giornoSett, Volo volo);

}
