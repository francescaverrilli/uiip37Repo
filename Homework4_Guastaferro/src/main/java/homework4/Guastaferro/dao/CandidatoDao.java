package homework4.Guastaferro.dao;

import java.util.LinkedList;

import homework4.Guastaferro.model.Candidato;
import homework4.Guastaferro.model.TitoloDiStudio;

public interface CandidatoDao {

	public void insert(String telefono,Candidato candidato);
	public LinkedList<TitoloDiStudio> selectBytipo(int codice);
	public void update(int codice, String viaresidenza, String capresidenza, String cittaeresidenza);
	
}
