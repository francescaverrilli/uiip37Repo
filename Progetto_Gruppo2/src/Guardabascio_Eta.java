import java.util.LinkedList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Guardabascio_Eta {

	public static void calcolaPiuGrande (LinkedList<Persona> list_Persona) throws Exception {
		Persona p_Maggiore= new Persona();
		for (int i = 1; i<list_Persona.size(); i++) {
			Date date0=new SimpleDateFormat("dd/MM/yyyy").parse(list_Persona.get(i-1).getDataNascita());
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(list_Persona.get(i).getDataNascita());
			if(date0.before(date1)) {
				p_Maggiore=list_Persona.get(i);
			}
			else {
				p_Maggiore=list_Persona.get(i-1);
			}
			
		}
		System.out.println("La piu grande " + p_Maggiore.getNome());
	}
}
