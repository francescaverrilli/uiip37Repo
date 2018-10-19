package it.soprasteria.guardabascio;

import java.sql.*;
import java.util.*;
import it.soprasteria.guardabascio.dao.impl.*;
import it.soprasteria.guardabascio.model.*;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IllegalFormatException {

		boolean itera = true;
		Scanner s = new Scanner(System.in);
		int scelta = 0;

		DefaultAereoDao in = new DefaultAereoDao();
		DefaultAeroportoDao apD = new DefaultAeroportoDao();
		DefaultVoloDao vD= new DefaultVoloDao();
		Aereo a;
		Aeroporto ap;
		Volo v;
		
		while (itera) {

			System.out.println("Menu agenzia");
			System.out.println("1 - Inserisci Aereo");
			System.out.println("2 - Seleziona aereo per Tipo");
			System.out.println("3 - Update aereo per Tipo");
			System.out.println("4 - Inserisci Aeroporto");
			System.out.println("5 - Seleziona Aeroporto per Tipo");
			System.out.println("6 - Update Aeroporto per citta");
			System.out.println("7 - Inserisci Volo");
			System.out.println("8 - Seleziona Volo per Codice");
			System.out.println("9 - Update Volo per id - modifica orari");
			System.out.println("Uscita dal menu.");
			scelta= Integer.parseInt(s.nextLine());
			switch (scelta) {
			case 1:
				a = new Aereo("787", 380, 300);
				in.insert(a);
				System.out.println("Aereo Inserito");
				break;
			case 2:
				String tipo = "shut";
				a = in.selectByTipo(tipo);
				System.out.println("Aereo selezionato");
				System.out.println(a.toString());
				break;
			case 3:
				a = new Aereo("787", 500, 100);
				in.update(a.getTipoAereo(), a);
				System.out.println("Aereo modificato");
				break;

			case 4:
				ap = new Aeroporto("Londra", "Inghilterra", 20);
				apD.insert(ap);
				System.out.println("Aeroporto Inserito");
				break;
			case 5:
				String citta = "Barcellona";
				ap = apD.selectByTipo(citta);
				System.out.println("Aereo selezionato");
				System.out.println(ap.toString());
				break;
			case 6:
				ap = new Aeroporto("Londra", "Inghilterra", 25);
				apD.update(ap.getCitta(), ap);
				System.out.println("Dati aeroporto aggiornati");
				break;
			case 7:
				v = new Volo(3, "Martedi", "Barcellona", "Amsterdam", "B747", 20, 22);
				vD.insert(v);
				System.out.println("Volo Inserito");
				break;
			case 8:
				int idVolo = 1 ;
				LinkedList<Volo> lvolo= new LinkedList<Volo>();
				
				lvolo= vD.selectByTipo(idVolo);
				System.out.println("Volo selezionato");
				System.out.println(lvolo.toString());
				break;	
			case 9:
				int idVolo1 = 1;
				String giornoSett = "venerdì";
				int oraPartenza = 18;
				int oraArrivo= 20;
				vD.update(idVolo1, giornoSett, oraPartenza, oraArrivo);
				System.out.println("Dati Volo aggiornati");
				break;

			case 10:
				System.out.println("Uscita menu");
				itera = false;
				break;
			default:
				System.out.println("Scelta non valida");
				break;
			}
		}
		s.close();
	}
}
