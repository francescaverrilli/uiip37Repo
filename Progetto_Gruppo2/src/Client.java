
public class Client {

	public static void main(String[] args) {

		Indirizzo ind = new Indirizzo(10, "via bari", 28, 72013, "Ceglie Messapica", "br", "puglia");
		Persona p = new Persona("sergio", "santoro", "21/12/1991", ind);

		Indirizzo i_Daniela = new Indirizzo(10, "Via Monticchio", 4, 83031, "Ariano Irpino", "AV", "Campania");
		Persona p_Daniela = new Persona("Daniela", "Guardabascio", "19 settembre 1985", i_Daniela);

		System.out.println(p.getNome());
		System.out.println(p.getCognome());
		System.out.println(p.getDataNascita());
		System.out.println(p.getIndirizzo().getVia());
		System.out.println(p.getIndirizzo().getNumerocivvico());

		System.out.println("Dati Anagrafici");
		System.out.println(p_Daniela.getNome());
		System.out.println(p_Daniela.getCognome());
		System.out.println(p_Daniela.getDataNascita());
		System.out.println("Indirizzo:");
		System.out.println(p_Daniela.getIndirizzo().getVia() + " " + p_Daniela.getIndirizzo().getNumerocivvico() + " "
				+ p_Daniela.getIndirizzo().getCitta());
		;

		Indirizzo i = new Indirizzo(34, "Via Iscalonga", 70, 83036, "Mirabella Eclano", "AV", "Campania");
		Persona Angela = new Persona("Angela", "Di Pietro", "11/06/1992", i);

		System.out.println("Il nome della Persona è " + Angela.getNome());
		System.out.println("Il cognome" + Angela.getCognome());
		System.out.println("Nata il " + Angela.getDataNascita());
		System.out.println("Residente a" + i.getCitta() + i.getNumerocivvico() + i.getProvincia() + i.getRegione());

	}

}
