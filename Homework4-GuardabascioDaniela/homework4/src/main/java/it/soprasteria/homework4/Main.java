package it.soprasteria.homework4;

import java.sql.SQLException;
import java.util.Scanner;

import it.soprasteria.guardaascio.dao.impl.DefaultCandidatoDao;
import it.soprasteria.guardabascio.model.Candidato;
import it.soprasteria.guardabascio.control.*;

/**
 *
 * Il programma dovrà tramite standard input e output fornire le seguenti
 * funzionalità: Inserimento di un candidato e del suo telefono Visualizzazione
 * di tutti i titoli di studio di un candidato Aggiornamento della residenza di
 * un candidato
 * 
 * @author Guardabascio Daniela
 *
 */

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		boolean itera = true;
		Scanner s = new Scanner(System.in);
		int scelta = 0;
		DefaultCandidatoDao cDao = new DefaultCandidatoDao();
		Candidato c;

		while (itera) {
			System.out.println("**** Menu Archivio Candidati ******");
			System.out.println("1 - Stampa tutti i candidati");
			System.out.println("2 - Inserimento Candidato e numero telefono");
			System.out.println("3 - Visualizza titoli di studio candidato");
			System.out.println("4 - Aggiornamento residenza candidato");
			System.out.println("5 - Uscita dal menu.");
			scelta = Integer.parseInt(s.nextLine());
			switch (scelta) {

			case 1:
				// stampa di tutti i candidati
				// Richiamo il metodo statico implememtato nel package
				// it.soprasteria.guardabascio.control
				Control.StampaCandidati(cDao.stampaCandidati());
				break;
				
			case 2:
				// Inserimento di un nuovo candidato e relativo numero di teelfono
				// Richiamo il metodo statico implememtato nel package
				// it.soprasteria.guardabascio.control
				Control.InserisciCandatoNumero(s, cDao);
				break;
			case 3:
				// Visualizza titoli di studio di un candidato
				// Richiamo il metodo statico implememtato nel package
				// it.soprasteria.guardabascio.control
				Control.VisualizzaTitoliCandidato(s , cDao);
				break;
			case 4:
				// Caso in cui si voglia aggiornare la residenza di un particolare candidato
				// Richiamo il metodo statico implememtato nel package
				// it.soprasteria.guardabascio.control
				Control.ModificaResidenzaCandidato(s, cDao);
				break;
			case 5:
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
