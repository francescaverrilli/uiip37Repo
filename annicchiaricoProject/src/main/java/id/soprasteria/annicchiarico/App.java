package id.soprasteria.annicchiarico;

import java.util.Scanner;

import it.soprasteria.annicchiarico.dao.CandidatoDao;
import it.soprasteria.annicchiarico.dao.impl.DefaultCandidatoDao;
import it.soprasteria.annicchiarico.model.Candidato;

public class App {
	public static void main(String[] args) {
		/*
		 * Candidato(int codice, String cognome, String nome, String viaresidenza,
		 * String capresidenza, String cittaresidenza, String datanascita, String
		 * luogonascita
		 */
		Candidato c1 = new Candidato(12, "Rossi", "Gianni", "via Pascoli", "97432", "Roma", "19/03/1999", "Taranto");

		CandidatoDao candidatoDao = new DefaultCandidatoDao();

		candidatoDao.insert(c1, "3209966342");
		candidatoDao.selectByTitoloStudio(8);
		candidatoDao.update("Via San velo", "84236", "Palermo", 8);

		// menu di interazione con l'utente
		boolean i = true;
		int scelta = -1;

		while (i) {

			System.out.println("\n******** MENU ARCHIVIO CURRICULA ********");
			System.out.println("Digitare: ");
			System.out.println("1 - Visualizzare lista codici dei candidati");
			System.out.println("2 - Inserire un nuovo candidato e il rispettivo numero di telefono");
			System.out.println("3 - Visualizzare titoli di studio di un candidato");
			System.out.println("4 - Aggiornare la residenza di un candidato");
			System.out.println("5 - EXIT");

			Scanner s = new Scanner(System.in);
			scelta = Integer.parseInt(s.nextLine());

			switch (scelta) {
			case 1:
				System.out
						.println("I codici dei candidati presenti nel Database sono:" + candidatoDao.selectByCodice());
				break;

			case 2:
				System.out.println("Inserire il codice del candidato:");
				int codice = Integer.parseInt(s.nextLine());
				System.out.println("Inserire il cognome del candidato:");
				String cognome = s.nextLine();
				System.out.println("Inserire il nome del candidato:");
				String nome = s.nextLine();
				System.out.println("Inserire la via di residenza del candidato:");
				String viaresidenza = s.nextLine();
				System.out.println("Inserire il cap di residenza del candidato:");
				String capresidenza = s.nextLine();
				System.out.println("Inserire la città di residenza del candidato:");
				String cittaresidenza = s.nextLine();
				System.out.println("Inserire la data di nascita del candidato:");
				String datanascita = s.nextLine();
				System.out.println("Inserire il luogo di nascita del candidato:");
				String luogonascita = s.nextLine();
				Candidato c2 = new Candidato(codice, cognome, nome, viaresidenza, capresidenza, cittaresidenza,
						datanascita, luogonascita);
				System.out.println("Inserire il numero di telefono del candidato:");
				String numero = s.nextLine();
				System.out.println("Le informazioni relative al candidato appena inserito sono: " + c2.toString());
				candidatoDao.insert(c2, numero);

				break;

			case 3:
				System.out.println("Scegliere il codice del candidato di cui si vuole consocere i titoli di studio:");
				int codicecandidato = Integer.parseInt(s.nextLine());
				System.out.println(candidatoDao.selectByTitoloStudio(codicecandidato));
				break;

			case 4:
				System.out.println("Digitare il codice del candidato:");
				int cod = Integer.parseInt(s.nextLine());
				System.out.println("Inserire la nuova via di residenza da aggiornare:");
				String via = s.nextLine();
				System.out.println("Inserire il nuovo cap di residenza da aggiornare:");
				String cap = s.nextLine();
				System.out.println("Inserisci la nuova città di residenza da aggiornare:");
				String citta = s.nextLine();
				candidatoDao.update(via, cap, citta, cod);
				System.out.println("Aggiornamento concluso con successo");
				System.out.println("Codice candidato: " + cod + ", Nuova via di residenza:" + via
						+ ", Nuovo cap di residenza:" + cap + ", Nuova città di residenza:" + citta);
				break;

			case 5:
				System.out.println("Arrivederci");
				break;

			default:
				System.out.println("Inserire una scelta corretta per continuare, altrimenti premi 5 per uscire");
				break;

			}
		}

	}
}
