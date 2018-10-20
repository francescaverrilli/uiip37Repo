package DiPietroProject;


import java.util.Scanner;

import Dao.CandidatoDao;
import Dao.impl.defaultCandidatoDao;
import Model.Candidato;

public class App {
	public static void main(String[] args) {

		Candidato c1 = new Candidato(8, "Di Pietro", "Angela", "via Iscalonga", "83036", "MirabellaEclano",
				"1992-06-11", "Benevento");
		Candidato c2 = new Candidato(9, "Barbato", "Silvio", "contada Pino", "82100", "Benevento", "1991-06-09",
				"Benevento");
		Candidato c3 = new Candidato(10, "Annicchiarico", "Chiara", "via Pascoli", "83030", "Zungoli", "1990-12-4",
				"Avellino");
		Candidato c4 = new Candidato(23, "Avallone", "Emanuele", "via Prezzolini", "84013", "Salerno", "1992-05-18",
				"Salerno");
		Candidato c5 = new Candidato(29, "Caserta", "Vincenzo", "via Cesinola", "83018", "San Martino Valle Caudina",
				"1992-11-27", "Benevento");

		CandidatoDao candidatoDao = new defaultCandidatoDao();

		candidatoDao.insert(c1, "339892648");
		candidatoDao.insert(c2, "3276453809");
		candidatoDao.insert(c3, "347678909");
		candidatoDao.insert(c4, "3333424678");
		candidatoDao.insert(c5, "3889843628");

		System.out.println(candidatoDao.selectByTitoloStudio(c1.getCodice()));
		System.out.println(candidatoDao.selectByTitoloStudio(c2.getCodice()));


		candidatoDao.update("Via pescole", "83039", "Zungoli", 8);

		System.out.println("***************");
		System.out.println("** CURRICULA **");
		System.out.println("***************\n");

		boolean itera = true;
		int scelta = -1;

		while (itera) {

			System.out.println("\n******** MENU PRINCIPALE ********");
			System.out.println("Digitare: ");
			System.out.println("1 - Visualizza lista codici dei candidati");
			System.out.println("2 - Inserisci un nuovo candidato e il suo numero di telefono");
			System.out.println("3 - Visualizza il/i titolo/i di studio di un candidato");
			System.out.println("4 - Aggiorna la residenza di un candidato");
			System.out.println("5 - EXIT");

			Scanner s = new Scanner(System.in);
			scelta = Integer.parseInt(s.nextLine());

			switch (scelta) {
			case 1:
				System.out.println("I codici dei candidati presenti nel Database sono i seguenti:"+ candidatoDao.selectByCodice());
				break;
				
			case 2:
				System.out.println("Inserisci il codice del candidato:");
				int codice = Integer.parseInt(s.nextLine());
				System.out.println("Inserisci il cognome del candidato:");
				String cognome = s.nextLine();
				System.out.println("Inserisci il nome del candidato:");
				String nome = s.nextLine();
				System.out.println("Inserisci la via in cui risiede del candidato:");
				String viaresidenza = s.nextLine();
				System.out.println("Inserisci il cap di residenza del candidato:");
				String capresidenza = s.nextLine();
				System.out.println("Inserisci la città di residenza del candidato:");
				String cittaresidenza = s.nextLine();
				System.out.println("Inserisci la data di nascita del candidato:");
				String datanascita = s.nextLine();
				System.out.println("Inserisci il luogo di nascita del candidato:");
				String luogonascita = s.nextLine();
				Candidato c = new Candidato(codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza,
						datanascita, luogonascita);
				System.out.println("Inserisci il numero di telefono del candidato:");
				String numero = s.nextLine();
				System.out.println("Riepilogo delle credenziali appena inserite: " + c.toString());
				candidatoDao.insert(c, numero);

				break;

			case 3:
				System.out.println("Scegli il candidato di interesse mediante il codice:");
				int codicecandidato = Integer.parseInt(s.nextLine());
				System.out.println(candidatoDao.selectByTitoloStudio(codicecandidato));
				break;

			case 4:
				System.out.println("Digita il codice del candisato:");
				int cod = Integer.parseInt(s.nextLine());
				System.out.println("Inserisci la nuova Via di Residenza del candidato:");
				String via = s.nextLine();
				System.out.println("Inserisci il nuovo cap di residenza del candidato:");
				String cap = s.nextLine();
				System.out.println("Inserisci la nuova città di residenza del candidato:");
				String citta = s.nextLine();
				candidatoDao.update(via, cap, citta, cod);
				System.out.println("Aggiornamento andato a buon fine");
				break;

			case 5:
				System.out.println("Sei uscito");
				break;

			default:
				System.out.println("Inserisci una scelta corretta per continuare, altrimenti premi 5 per uscire");
				break;

			}
		}
	}
}
