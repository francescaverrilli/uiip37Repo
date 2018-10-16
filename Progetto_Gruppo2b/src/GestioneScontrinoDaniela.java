import java.util.LinkedList;

public class GestioneScontrinoDaniela {

	public static double SpesaTotale(LinkedList<Prodotto> lista_Daniela) {

		double totale=0;

		for ( Prodotto p : lista_Daniela) {
			totale+=p.getCosto();
		}
		
		return totale;
		
	}

}
