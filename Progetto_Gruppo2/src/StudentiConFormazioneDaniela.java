import java.util.LinkedList;

public class StudentiConFormazioneDaniela {

	public static LinkedList<Studente> listaStudentiFormati(LinkedList<Studente> listaStudenti){
		LinkedList<Studente> nuovaLista = new LinkedList<Studente>();
		
		for (Studente st : listaStudenti) {
			if (st.getCorsiFormazione().size()>0) {
				nuovaLista.add(st);
			}
			
		}
		
		return nuovaLista;
		
	}
}
