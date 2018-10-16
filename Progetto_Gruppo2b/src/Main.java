import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Prodotto> lista_Daniela= new LinkedList<Prodotto>();
		double tot_daniela= 0;
		Cliente c_daniela= new Cliente("12344566", "Daniela", "Guardabascio", 124);
		Prodotto p_daniela1= new Prodotto(00001, "Pasta fresca", 1, 28);
		Prodotto p_daniela2= new Prodotto(00002, "Acqua ferrarelle", 3, 28);
		lista_Daniela.add(p_daniela2);
		lista_Daniela.add(p_daniela1);
		tot_daniela = GestioneScontrinoDaniela.SpesaTotale(lista_Daniela);
		
		Scontrino scontrino_d= new Scontrino("1234", c_daniela, lista_Daniela, tot_daniela);
		
		System.out.println(scontrino_d.toString());

	}

}
