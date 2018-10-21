package AvalloneProject;

import java.util.Scanner;

import Dao.CandidatoDao;
import Dao.impl.defaultCandidatoDao;
import Model.Candidato;


public class App 
{
    public static void main( String[] args )
    {
    	
    	CandidatoDao candidatoDao = new defaultCandidatoDao();
    	int scelta;
    	
    	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
    	System.out.println("°°°°°°°°°°°°°°°MENU°°°°°°°°°°°°°°°°°°°°°°°°°ARCHIVIO°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
    	System.out.println("Benvenuto nel menu del programma che gestisce l'archivio dei curricula\n\n");
    	do  {
    	System.out.println("Scegli l'operazione che vuoi effetuare:\n");
    	System.out.println("1]Digita 1 per inserire un  nuovo candidato nell'archivio \n");
    	System.out.println("2]Digita 2 per visualizzare tutti i titoli di studio di un candidato \n");
    	System.out.println("3]Digita 3 per aggiornare la residenza di un candidato \n");
    	System.out.println("4]Digita 0 per uscire dal programma \n");
    	
    	Scanner in= new Scanner(System.in);
    	String input = in.nextLine();
    	scelta= Integer.parseInt(input);
    	
    	
    	
    	
    		switch(scelta) {
    		case 1:
    			System.out.println("Inserisci il codice del candidato che vuoi aggiungere: \n");
    			String input1 = in.nextLine();
    			int ins= Integer.parseInt(input1);
    			System.out.println("Inserisci il cognome del candidato che vuoi aggiungere: \n");
    			String input2 = in.nextLine();
    			System.out.println("Inserisci il nome del candidato che vuoi aggiungere: \n");
    			String input3 = in.nextLine();
    			System.out.println("Inserisci la via di residenza del candidato che vuoi aggiungere: \n");
    			String input4 = in.nextLine();
    			System.out.println("Inserisci il CAP di residenza del candidato che vuoi aggiungere: \n");
    			String input5 = in.nextLine();
    			System.out.println("Inserisci la citta di residenza del candidato che vuoi aggiungere: \n");
    			String input6 = in.nextLine();
    			System.out.println("Inserisci la data di nascita del candidato che vuoi aggiungere: \n");
    			String input7 = in.nextLine();
    			System.out.println("Inserisci la citta di nascita del candidato che vuoi aggiungere: \n");
    			String input8 = in.nextLine();
    			System.out.println("Inserisci il numero di telefono del candidato che vuoi aggiungere: \n");
    			String input9 = in.nextLine();
    			
    			
    			
    	    	Candidato c1 = new Candidato (ins,input2,input3, input4,input5,input6,input7,input8);
    	    	
    	    	candidatoDao.insert(c1,input9);
    	    	System.out.println("Le informazioni del candidato che hai inserito sono : \n");
    	    	System.out.println(c1);
    	    	
    	    	break;
    			
    			
    		case 2:
    			System.out.println("Inserisci il codice del candidato di cui vuoi vedere il/i titolo/i di studio \n");
    			String input11 = in.nextLine();
    	    	int cod= Integer.parseInt(input);
    	    	System.out.println(candidatoDao.selectByTitoloStudio(cod));
    	    	break;
    	    	
    		case 3:
    			System.out.println("Inserisci il codice del candidato di cui vuoi aggiornare la residenza \n");
    			String input00 = in.nextLine();
    	    	int codi= Integer.parseInt(input);
    			System.out.println("Inserisci la via di residenza del candidato che vuoi aggiornare: \n");
    			String input22 = in.nextLine();
    			System.out.println("Inserisci il CAP di residenza del candidato che vuoi aggiornare: \n");
    			String input33 = in.nextLine();
    			System.out.println("Inserisci la citta di residenza del candidato che vuoi aggiornare: \n");
    			String input44 = in.nextLine();
    			candidatoDao.update(input22,input33,input44,codi);
    			break;
    	    default:
    	    	System.out.println("Scelta non consentita,RIPROVA \n");
    	    	
    		
    		}	
    	}while(scelta!=0);
    	
    	
    	
    }
}
