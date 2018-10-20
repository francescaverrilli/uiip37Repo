package it.soprasteria.homework4.santoro;
import java.util.LinkedList;
import java.util.Scanner;

import it.soprasteria.homework4.santoro.dao.impl.Default_Candidato_Dao;
import it.soprasteria.homework4.santoro.dao.impl.Default_Telefono_Dao;
import it.soprasteria.homework4.santoro.model.Candidato;
import it.soprasteria.homework4.santoro.model.Telefono;

/**
 * Hello world!
 *
 */
public class App_Santoro 
{
    public static void main( String[] args )
    {	int scelta;
    	LinkedList<String>l;
    	LinkedList<Candidato>lcand;
    	Scanner scan=new Scanner(System.in);
    	Default_Candidato_Dao dafaultCandidato=new Default_Candidato_Dao();
    	Default_Telefono_Dao defaultTelefono=new Default_Telefono_Dao();

    	do {
    		System.out.println("**************************MENU HOMEWORK4 SANTORO SERGIO GABRIELE************************************");
    		System.out.println("UTENTE SELEZIONA FRA UNA DELLE SEGUENTI SCELTE");
    		System.out.println("1 : INSERIMENTO DI UN CANDIDATO E DEL SUO NUMERO TELEFONICO");
    		System.out.println("2 : RICERCA CANDIDATO TRAMITE CODICE");
    		System.out.println("3 : VISUALIZZAZIONE DI TUTTI I TITOLI DI STUDIO DI UN CANDIDATO");
    		System.out.println("4 : AGGIORNAMENTO RESIDENZA DI UN CANDIDATO");
    		System.out.println("5 : STAMPA CANDIDATI");
    		System.out.println("6 : FINE");
    		scelta=Integer.parseInt(scan.nextLine());
    		
    		switch(scelta) {
    			case 1:
    				System.out.println("Utente inserisci un codice per il candidato");
    				int cod=Integer.parseInt(scan.nextLine());
    				Candidato cand=dafaultCandidato.selectByTipo(cod);
    				if(cand==null) {
    					System.out.println("Utente inserisci il numero di telefono del candidato");
    					String numero=scan.nextLine();
    					Telefono t=defaultTelefono.selectByTipo(numero);
    					if(t==null) {
    						System.out.println("Utente inserisci il cognome del candidato");
    						String cognome=scan.nextLine();
    						System.out.println("Utente inserisci il nome del candidato");
    						String nome=scan.nextLine();
    						System.out.println("Utente inserisci la via di residenza del candidato");
    						String viaResidenza=scan.nextLine();
    						System.out.println("Utente inserisci il cap di residenza del candidato");
    						String capResidenza=scan.nextLine();
    						System.out.println("Utente inserisci la citta di residenza del candidato");
    						String cittaResidenza=scan.nextLine();
    						System.out.println("Utente inserisci la data di nascita del candidato nel formato yyy-MM-GG esempio 1991-12-21");
    						String data=scan.nextLine();
    						System.out.println("Utente inserisci la citta di nascita del candidato");
    						String cittaNascita=scan.nextLine();
    						Candidato candidato = new Candidato(cod,cognome,nome,viaResidenza,capResidenza,cittaResidenza,data,cittaNascita);
    						dafaultCandidato.insert(candidato);
    						Telefono telefono=new Telefono(numero,candidato.getCodice());
    						defaultTelefono.insert(telefono);
    						System.out.println("il nuovo candidato è stato inserito correttamente nella tabella candidato");
    					}
    					else
    						System.out.println("Numero già presente in rubrica impossibile inserire un nuvo candidato");
    				}
    				else {
    					System.out.println("Codice candidato già presente nel db impossibile inserire candidato");
    				}
    				break;
    			case 2:
    				System.out.println("Utente inserisci un codice per il candidato da ricercare");
    				int codice=Integer.parseInt(scan.nextLine());
    				Candidato cand1=dafaultCandidato.selectByTipo(codice);
    				if(cand1==null) {
    					System.out.println("Candidato non presente nel db");
    				}
    				else {
    					System.out.println(cand1);
    				}
    				break;
    			case 3:
    				l=dafaultCandidato.titoloStudiCandidati();
    				if(l.size()!=0) {
    					for(String ris:l)
    						System.out.println(ris);
    				}
    				else
    					System.out.println("Non ci sono candidati con titoli di studio");
    				break;
    			case 4:
    				System.out.println("Utente inserisci il codice del candidato di cui si vuole cambiare la residenza");
    				int cod1=Integer.parseInt(scan.nextLine());
    				Candidato cand2=dafaultCandidato.selectByTipo(cod1);
    				if(cand2!=null) {
        				System.out.println("Utente inserisci la nuova via di resisdenza");
        				String via=scan.nextLine();
        				System.out.println("Utente inserisci il nuovo cap di resisdenza");
        				String cap=scan.nextLine();
        				System.out.println("Utente inserisci la nuova citta di resisdenza");
        				String citta=scan.nextLine();
        				dafaultCandidato.update(cod1,via,cap,citta);
        				System.out.println("Modifica effettuata correttamente");
    				}
    				else
    					System.out.println("Impossibile effettuare la modifica candidato non presente nel db");
    				break;
    			
    			case 5:
    				lcand=dafaultCandidato.selectAll();
    				if(lcand.size()!=0) {
    					System.out.println(lcand);
    				}
    				else
    					System.out.println("Spiacente tabella vuota");
    				break;
    			
    			case 6:
    				System.out.println("FINEEEEEEEEEEEEEEE");
    				break;
    			default:
    				System.out.println("Utente inserisci una scelta valida");
    		}
    		
    	}while(scelta!=6);
    	scan.close();
    }
}
