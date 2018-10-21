import java.util.LinkedList;
import java.util.Vector;

public class ResidentiCampaniaAndrea {
	
	private LinkedList<Persona> lista_persone;
	

	
	public ResidentiCampaniaAndrea(LinkedList<Persona> lista_persone) {
		super();
		this.lista_persone = lista_persone;
	}



	public LinkedList<Persona> getLista_persone() {
		return lista_persone;
	}



	public void setLista_persone(LinkedList<Persona> lista_persone) {
		this.lista_persone = lista_persone;
	}



	public void stampa_per_regione (String regione) {
		
		for(int i=0; i< lista_persone.size();i++) {
			if(lista_persone.get(i).getNuovo_indirizzo().getRegione().equalsIgnoreCase(regione)) {
				System.out.println(lista_persone.get(i).toString());
			}
			else {
				System.out.println("La persona numero "+(i+1)+" non � campana");
			}
		}
	}
	
	public Vector<Studente> cerca_studente(Vector<Studente> vett){
		Vector<Studente> vett_temp=new Vector<Studente>();
		for(int i=0; i< vett.size();i++) {
			if(!vett.get(i).getCorsiFormazione().isEmpty()) {
				vett_temp.add(vett.get(i));
			}
		}
		return vett_temp;

	}
}