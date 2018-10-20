package Guastaferro.it.soprasteria.guastaferro;

import java.util.LinkedList;
import java.util.Scanner;

import homework4.Guastaferro.dao.impl.DefaultCandidatoDao;
import homework4.Guastaferro.model.Candidato;
import homework4.Guastaferro.model.TitoloDiStudio;

public class App 
{
    public static void main( String[] args ) {
    	
    	DefaultCandidatoDao dfc= new DefaultCandidatoDao();
    	
        System.out.println( "Ciao, inserisci l'operazione da svolgere:\n"
        		+ "1) Inserisci un candidato;\n"
        		+ "2) Visualizza i titoli di studio di un candidato;\n"
        		+ "3) Aggiorna la residenza di un candidato;\n"
        		+ "4)Esci;" );
        
        Scanner input= new Scanner(System.in);
        String scelta= input.nextLine();
        int scel=Integer.parseInt(scelta);
        
        while(scel!=4) {
        	
        	switch (scel) {
        	
        	case 1:
        		System.out.println("Inserisci il codice del candidato");
        		Scanner code=new Scanner(System.in);
        		int codice=code.nextInt();
        		System.out.println("Inserisci il cognome del candidato");
        		Scanner cog=new Scanner(System.in);
        		String cognome=cog.nextLine();
        		System.out.println("Inserisci il nome del candidato");
        		Scanner no=new Scanner(System.in);
        		String nome= no.nextLine();
        		System.out.println("Inserisci la via di residenza del nuovo candidato");
        		Scanner via_res=new Scanner(System.in);
        		String via_residenza=via_res.nextLine();
        		System.out.println("Inserisci il cap di residenza del nuovo candidato");
        		Scanner cap_res=new Scanner(System.in);
        		String cap_residenza=cap_res.nextLine();
        		System.out.println("Inserisci la città di residenza del nuovo candidato");
        		Scanner cit_res= new Scanner(System.in);
        		String cit_residenza=cit_res.nextLine();
        		System.out.println("Inserisci la data di nascita del nuovo candidato");
        		Scanner d_d_n=new Scanner(System.in);
        		String d_d_nascita=d_d_n.nextLine();
        		System.out.println("Inserisci il luogo di nascita del nuovo candidato");
        		Scanner l_d_n= new Scanner(System.in);
        		String luogodinascita=l_d_n.nextLine();
        		System.out.println("Inserisci il numero di telefono del candidato");
        		Scanner cell= new Scanner(System.in);
        		String phone=cell.nextLine();
        		Candidato nuovo_candidato= new Candidato(codice, cognome, nome, via_residenza, cap_residenza, cit_residenza, d_d_nascita, luogodinascita);
        		dfc.insert(phone,nuovo_candidato);
        		//System.out.println(nuovo_candidato.toString());
        		System.out.println("Il candidato è stato inserito correttamente");
        		break;
        		
        	case 2:
        		LinkedList<TitoloDiStudio> list= new LinkedList<TitoloDiStudio>();
        		System.out.println("Inserisci il codice del candidato di cui vuoi conoscerne i titoli");
        		Scanner c= new Scanner(System.in);
        		int co=c.nextInt();
        		list=dfc.selectBytipo(co);
        		for(int j=0; j<list.size();j++) {
        			System.out.println(list.get(j));
        		}
        		break;
        		
        	case 3:
        		System.out.println("Inserisci il codice del candidato");
        		Scanner cc=new Scanner(System.in);
        		int codice1=cc.nextInt();
        		System.out.println("Inserisci la nuova strada del candidato");
        		Scanner n_strada=new Scanner(System.in);
        		String nuova_strada=n_strada.nextLine();
        		System.out.println("Inserisci il nuovo cap del candidato");
        		Scanner n_cap=new Scanner(System.in);
        		String nuovo_cap=n_cap.nextLine();
        		System.out.println("Inserisci la nuova città del candidato");
        		Scanner n_citta=new Scanner(System.in);
        		String nuova_citta=n_citta.nextLine();
        		dfc.update(codice1, nuova_strada, nuovo_cap, nuova_citta);
        		break;
        	
        	default:
        		System.out.println("L'operazione seguente non è supportata");
        		break;
        	}
        	
        	System.out.println( "Inserisci l'operazione da svolgere:\n"
            		+ "1) Inserisci un candidato;\n"
            		+ "2) Visualizza i titoli di studio di un candidato;\n"
            		+ "3) Aggiorna la residenza di un candidato;\n"
            		+ "4)Esci;" );
            
            input= new Scanner(System.in);
            scelta= input.nextLine();
            scel=Integer.parseInt(scelta);
        }
        
        System.out.println("Grazie per aver utilizzato il software!");
        
    }
}
