package it.Carlo.Soprasteria.Curricula;

import java.util.Scanner;

import it.Carlo.Soprasteria.Curricula.dao.CandidatoDao;
import it.Carlo.Soprasteria.Curricula.impl.DefaultCandidatoDao;
import it.Carlo.Soprasteria.Curricula.model.Candidato;

public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	Per prova
    	
    	//N.B il primo valore (4) è la chiave primaria, pertanto se dò un valore già inserito nel db ovvero 
    	//in questo caso un valore tra 1,3,5,7,9 che sono tutti id già preseenti,
    	//non me la inserisce nel db ma non da errore poichè è scritto insert ignore
    	Candidato c = new Candidato(4, "Bianchi", "Mario", "via Giovanni Paolo", "81055", "Caserta", "1987-09-09", "Caserta");
    	
    	CandidatoDao candidatoDao = new DefaultCandidatoDao();
    	candidatoDao.insert(c, "3558676436");
    	 
          
          System.out.println(candidatoDao.selectByTitoloStudio(5)); 
          candidatoDao.update(3, "via Roma", "81023", "Palermo"); 
          */
    	
    	
    	
    	// Standard input ed output
    			Scanner s = new Scanner(System.in);
    			CandidatoDao cDao = new DefaultCandidatoDao();
    			int scelta;
    			do {
    				System.out.println("1) Inserisci un nuovo Candidato ed il suo numero di telefono");
    				System.out.println("2) inserisci l'id del candidato, ti verranno restituiti i suoi titoli di studio");
    				System.out.println("3) Aggiorna via, cap, citta per l'id del candidato inserito");
    				System.out.println("4) Esci");
    				scelta = Integer.parseInt(s.nextLine());
    				switch (scelta) {
    				case 1:
    						
    						System.out.println("Inserisci l'id del Candidato:\n ");
    						String idI = s.nextLine();
    						int idIn = Integer.parseInt(idI);

    						if (cDao.controllaSeIdPresente(idIn)) {
    							System.out.println("Inserisci il cognome: ");
    							String cognomeIn = s.nextLine();
    							System.out.println("Inserisci il nome: ");
    							String nomeIn = s.nextLine();
    							System.out.println("Inserisci la via dove risiede il candidato: ");
    							String viaIn = s.nextLine();
    							System.out.println("Inserisci il cap dove risiede il canidato: ");
    							String capIn = s.nextLine();
    							System.out.println("Inserisci la città dove risiede il candidato: ");
    							String cittaIn = s.nextLine();
    							System.out.println("Inserisci la data di nascita del candidato in formato aaaa-mm-gg: ");
    							//se non viene specificata la data scrivendo nell'ordine aaaa-mm-gg viene messo nel db 0000-00-00
    							String datanIn = s.nextLine();
    							System.out.println("Inserisci il luogo di nascita del candidato: ");
    							String luogonIn = s.nextLine();
    							System.out.println("Inserisci il telefono del candidato: ");
    							String telefonoIn = s.nextLine();

    							Candidato c = new Candidato(idIn, cognomeIn, nomeIn, viaIn, capIn, cittaIn, datanIn, luogonIn);
    							cDao.insert(c, telefonoIn);
    							System.out.println("Nuovo candidato inserito");
    							System.out.println("Il nuovo candidato inserito è: " +c+ " ed il suo numero di telefono è: " +telefonoIn);
    							} 
    							else {
    							System.out.println("Scegliere un altro Id, l'id scelto è già presente\n");
    							}
    					
    					break;
    					
    				case 2:
    					System.out.println("Inserisci l'id del Candidato di cui vuoi i titoli:\n ");
    					//se fai int id = s.nextInt() non va per i problemi dello scanner
    					//o metti s.nextLine() dopo ovvero
    					//int id = s.nextInt();
						//s.nextLine();
    					//oppure meglio fai fatto sempre
						String idS = s.nextLine();
						int idSe = Integer.parseInt(idS);
						if (!(cDao.controllaSeIdPresente(idSe))) {
						System.out.println(cDao.selectByTitoloStudio(idSe));
    					}
    					else {
    						System.out.println("Scegliere un altro Id, l'id scelto non è presente\n");
    						}
    					

    					break;
    					
    				case 3:
    					System.out.println("Inserisci l'id del Candidato di cui vuoi aggiornare id, cap e residenza:\n ");
    					String idU = s.nextLine();
						int idUp = Integer.parseInt(idU);
						if (!(cDao.controllaSeIdPresente(idUp))) {
						System.out.println("Inserisci la nuova via di residenza del candidato");
						String viaUp = s.nextLine();
						System.out.println("Inserisci il nuovo cap di residenza del candidato");
						String capUp = s.nextLine();
						System.out.println("Inserisci la nuova citta di residenza del candidato");
						String cittaUp = s.nextLine();
						cDao.update(idUp, viaUp, capUp, cittaUp);
						System.out.println(" candidato " +idU+ " aggiornato con nuova via: " +viaUp+ " nuovo cap " +capUp+ " nuova citta " +cittaUp);
						}
						else {
							System.out.println("Scegliere un altro Id, l'id scelto non è presente");
							}
    					
    					break;

    				default:
    					System.out.println("Sei uscito dal menu");
    					break;
    				}

    			} while (scelta != 4);
    			s.close();

    }
}
