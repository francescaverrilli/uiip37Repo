import java.util.LinkedList;

public class CorsoFormazioneAnnicchiarico {
public static LinkedList<Studente> corsiFormazione (LinkedList<Studente> elencoCorsi){
	LinkedList<Studente> listaCorsi= new LinkedList<Studente>();
	for(Studente s : elencoCorsi ) {
		if(s.getCorsiFormazione().equals(listaCorsi)) {
			listaCorsi.add(s);
		}
	}
	return listaCorsi;
}
}
