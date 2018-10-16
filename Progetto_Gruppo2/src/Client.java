
public class Client {

	public static void main(String[] args) {
		
		
		Indirizzo i_Daniela = new Indirizzo(10, "Via Monticchio", 4, 83031, "Ariano Irpino", "AV", "Campania");
		
		Persona p_Daniela= new Persona("Daniela", "Guardabascio", "19 settembre 1985", i_Daniela);
		

		System.out.println("Dati Anagrafici");
		System.out.println(p_Daniela.getNome());
		System.out.println(p_Daniela.getCognome());
		System.out.println(p_Daniela.getDataNascita());
		System.out.println("Indirizzo:");
		System.out.println(p_Daniela.getIndirizzo().getVia() + " " + p_Daniela.getIndirizzo().getNumerocivvico() + " " + p_Daniela.getIndirizzo().getCitta());;
		
	}

}
