package it.sopra.caserta;

import java.util.Scanner;
import java.util.Vector;

import it.sopra.caserta.dao.CandidatoDao;
import it.sopra.caserta.dao.TelefonoDao;
import it.sopra.caserta.dao.impl.DefaultCandidatoDao;
import it.sopra.caserta.dao.impl.DefaultTelefonoDao;
import it.sopra.caserta.model.Candidato;
import it.sopra.caserta.model.Telefono;

public class AppTest { 
	
	public static void main(String[] args) {
		
		System.out.println("Benvenuto nel Database dei Curriculum");
		
		Scanner sc = new Scanner(System.in);
		
		CandidatoDao candidatoDao = new DefaultCandidatoDao();
		
		boolean end = false;
		
		do {
			System.out.println("\nSeleziona l'operazione da effettuare:");
			System.out.println("1: Inserisci un candidato");
			System.out.println("2: Visualizza i titoli di studio di un candidato");
			System.out.println("3: Aggiorna la residenza di un candidato");
			System.out.println("4: Visualizza la lista dei candidati");
			System.out.println("5: Esci");
			
			String scelta = sc.nextLine();
			
			switch (scelta) {
			case "1":
				inserisciCandidato(candidatoDao, sc);
				break;
			
			case "2":
				System.out.println("Inserisci il codice del candidato:");
				try {
					int cod = Integer.parseInt(sc.nextLine());
					// Ricerco nel DB i titoli di studio di un candidato.
					Vector<String> titoli = candidatoDao.getTitoliByCodice(cod);
					// Controllo se il candidato ha titoli di studio o non esiste
					if(!titoli.isEmpty()) {
						System.out.println("Questo candidato ha i seguenti titoli:");
						System.out.println(titoli);
					}
					else {
						System.out.println("Questo candidato non ha titoli o non esiste.");
					}
				}
				// Nel caso l'utente non inserisca un intero.
				catch (NumberFormatException e) {
					e.printStackTrace();
				}
				break;
			
			case "3":
				System.out.println("Inserisci il codice del candidato:");
				try {
					// Vengono richiesti all'utente i dati per modificare la residenza del candidato.
					int cod = Integer.parseInt(sc.nextLine());
					System.out.println("Inserisci la via:");
					String via = sc.nextLine();
					System.out.println("Inserisci il cap:");
					String cap = sc.nextLine();
					System.out.println("Inserisci la citta:");
					String citta = sc.nextLine();
					
					// Controllo se la modifica è avvenuta con successo.
					int  r =candidatoDao.updateResidenza(cod, via, cap, citta);
					if(r>0) {
						System.out.println("Residenza del candidato modificata");
					}
					else {
						System.out.println("Errore nella modifica della residenza");
					}
				}
				// Nel caso l'utente non inserisca un intero.
				catch (NumberFormatException e) {
					e.printStackTrace();
				
				}
				
				break;
			
			case "4":
				Vector<Candidato> candidati = candidatoDao.getCandidati();
				System.out.println(candidati);
				break;
			
			case "5":
				end = true;
				break;

			default:
				System.out.println("Scelta non valida");
				break;
			}
			
		}while(!end);
		
		sc.close();
	}
	
	/*
	 * Metodo di supporto per l'inserimento di un candidato e di un eventuale
	 * numero di telefono all'interno del database.
	 */
	public static void inserisciCandidato(CandidatoDao cand, Scanner sc) {
		
		try {
			System.out.println("Inserisci il codice del candidato:");
			int cod = Integer.parseInt(sc.nextLine());
			System.out.println("Inserisci il cognome del candidato:");
			String cognome = sc.nextLine();
			System.out.println("Inserisci il nome del candidato:");
			String nome = sc.nextLine();
			System.out.println("Inserisci la via di residenza del candidato:");
			String via = sc.nextLine();
			System.out.println("Inserisci il CAP di residenza del candidato:");
			String cap = sc.nextLine();
			System.out.println("Inserisci la citta di residenza del candidato:");
			String citta = sc.nextLine();
			System.out.println("Inserisci la data di nascita del candidato: (yyyy-MM-dd)");
			String dataN = sc.nextLine();
			System.out.println("Inserisci il luogo di nascita del candidato:");
			String lNascita = sc.nextLine();
			
			// Con l'intero result controllo l'effettivo inserimento del candidato all'interno del database.
			int result = cand.insert(new Candidato(cod,cognome,nome,via,cap,citta,dataN,lNascita));
			
			// Se è stato inserito correttamente si chiede se si vuole aggiungere
			// il numero di telefono
			if(result > 0) {
				System.out.println("Candidato inserito correttamente.\n"+
									"Vuoi inserire il numero di telefono Y/N");
				String scelta = sc.nextLine();
				boolean inserito = false;
				
				while(scelta.equalsIgnoreCase("Y") && !inserito) {
					TelefonoDao teleDao = new DefaultTelefonoDao();
					System.out.println("Inserisci il numero di telefono:");
					String num = sc.nextLine();
					
					// Controlla l'effettivo inserimento del numero all'interno del database.
					int ret = teleDao.insert(new Telefono(num,cod));
					
					if(ret>0) {
						inserito = true;
						System.out.println("Numero inserito correttamente");
					}
					
					// Se l'inserimento non è andato a buon fine, viene richiesto nuovamente 
					else {
						System.out.println("Errore numero non inserito. Vuoi riprovare: Y/N");
						scelta = sc.nextLine();
					}
					
				}
			}
			else {
				System.out.println("Errore nell'inserimento del candidato");
			}
		}
		// Nel caso l'utente non inserisca un intero.
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
	
	}
	
   
}
