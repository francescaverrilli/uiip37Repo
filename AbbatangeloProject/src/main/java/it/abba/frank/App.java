package it.abba.frank;

import java.util.LinkedList;
import java.util.Scanner;

import it.abba.frank.dao.CandidatoDao;
import it.abba.frank.dao.impl.DefaultCandidatoDao;
import it.abba.frank.model.Candidato;
import it.abba.frank.model.TitoloStudio;

public class App {
	public static void main(String[] args) {
		CandidatoDao cd1 = new DefaultCandidatoDao();

		// Menù
		Scanner scan = new Scanner(System.in);
		int scelta;
		do {
			System.out.println("\n*********Menù opzioni*********");
			System.out.println("1) Inserisci Candidato e Telefono");
			System.out.println("2) Cerca Titoli di Studio di un Candidato");
			System.out.println("3) Aggiorna Residenza Candidato");
			System.out.println("4) Visualizza Candidati");
			System.out.println("5) Esci");
			scelta = Integer.parseInt(scan.nextLine());
			boolean caso1 = false;
			switch (scelta) {
			case 1:
				while (caso1 == false) {
					System.out.println("Inserisci l'ID Candidato: ");
					int IDIns = scan.nextInt();
					scan.nextLine();
					if (cd1.checkID(IDIns) == true) {
						System.out.println("Inserisci il Cognome: ");
						String cognomeIns = scan.nextLine();
						System.out.println("Inserisci il Nome: ");
						String nomeIns = scan.nextLine();
						System.out.println("Inserisci la via di residenza: ");
						String viaIns = scan.nextLine();
						System.out.println("Inserisci il CAP: ");
						String capIns = scan.nextLine();
						System.out.println("Inserisci la città di residenza: ");
						String cittaIns = scan.nextLine();
						System.out.println("Inserisci la data di nascita AAAA-MM-GG: ");
						String datanIns = scan.nextLine();
						System.out.println("Inserisci il luogo di nascita: ");
						String luogonIns = scan.nextLine();
						System.out.println("Inserisci il telefono: ");
						String telefonoIns = scan.nextLine();

						Candidato can = new Candidato(IDIns, cognomeIns, nomeIns, viaIns, capIns, cittaIns, datanIns,
								luogonIns);
						cd1.insert(can, telefonoIns);
						caso1 = true;
						System.out.println("Inserimento avvenuto con successo!");
					} else {
						System.out.println("ID già presente!");
					}
				}
				break;
			case 2:
				LinkedList<Candidato> listaCandidati2 = cd1.allCandidato();
				for (int i = 0; i < listaCandidati2.size(); i++) {
					System.out.println(listaCandidati2.get(i).getCodice() + ") " + listaCandidati2.get(i).getCognome()
							+ " " + listaCandidati2.get(i).getNome());
				}
				System.out.println("Inserisci l'ID Candidato da cercare: ");
				int IDCerc = scan.nextInt();
				scan.nextLine();
				LinkedList<TitoloStudio> listaTitoli = cd1.selectByTitolo(IDCerc);
				if (listaTitoli.size() == 0) {
					System.out.println("Il candidato non ha nessun titolo");
				} else {
					System.out.println(listaTitoli);
				}

				break;
			case 3:
				LinkedList<Candidato> listaCandidati3 = cd1.allCandidato();
				for (int i = 0; i < listaCandidati3.size(); i++) {
					System.out.println(listaCandidati3.get(i).getCodice() + ") " + listaCandidati3.get(i).getCognome()
							+ " " + listaCandidati3.get(i).getNome());
				}
				System.out.println("\nInserisci l'ID Candidato da aggiornare: ");
				int IDUpdate = scan.nextInt();
				scan.nextLine();
				System.out.println("Inserisci la via di residenza: ");
				String viaUp = scan.nextLine();
				System.out.println("Inserisci il CAP: ");
				String capUp = scan.nextLine();
				System.out.println("Inserisci la città di residenza: ");
				String cittaUp = scan.nextLine();

				cd1.update(IDUpdate, viaUp, capUp, cittaUp);
				System.out.println("Aggiornamento avvenuto con successo!");
				break;
			case 4:
				LinkedList<Candidato> listaCandidati4 = cd1.allCandidato();
				System.out.println(listaCandidati4);
				break;
			default:
				System.out.println("Fine");
				break;
			}

		} while (scelta != 5);
		scan.close();
	}
}
