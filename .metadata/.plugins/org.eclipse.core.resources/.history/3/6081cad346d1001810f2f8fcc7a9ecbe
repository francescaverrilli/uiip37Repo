import java.util.LinkedList;

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
				System.out.println("La persona numero "+(i+1)+" non è campana");
			}
		}
	}
	


}
