package it.soprasteria.guardabascio.control;

import java.util.IllegalFormatException;
import java.util.LinkedList;
import java.util.Scanner;

import it.soprasteria.guardaascio.dao.impl.DefaultCandidatoDao;
import it.soprasteria.guardaascio.dao.impl.DefaultTelefonoDao;
import it.soprasteria.guardabascio.model.Candidato;
import it.soprasteria.guardabascio.model.Telefono;
import it.soprasteria.guardabascio.model.TitoloStudio;

public class Control {

	// stampa elenco di tutti i candidati
	public static void StampaCandidati(LinkedList<Candidato> listaCandidati) {
		System.out.println("Elenco Candidati presenti nell'archivio");
		for (Candidato c : listaCandidati) {
			System.out.println(c.toString());
		}
	}

	// metodo statico per l'inseriemnto di un nuovo candidato ed il relativo numero
	// di telefono
	// eseguo due insert in parallelo.
	// sulla tabella candidato e sulla tabella Telefono
	public static void InserisciCandatoNumero(Scanner s, DefaultCandidatoDao cDao) throws IllegalFormatException {

		DefaultTelefonoDao tDao = new DefaultTelefonoDao();

		Candidato c = new Candidato();
		Telefono t = new Telefono();

		// (codice, cognome, nome, viaresidenza, capResidenza, cittaResidenza,
		// dataNascita, luogoNascita)
		System.out.println("Inserimento dati candidato");
		System.out.println("Inserisci il codice");
		int codice = Integer.parseInt(s.nextLine());
		c.setCodice(codice);

		// prima di proseguire all'inseriemnto di tutti i dati verifico che quel codice
		// non sia presente
		if (cDao.selectByTipo(codice).getCodice() > 0) {
			System.out.println("Codice gia presente");
		}

		else {
			// (codice, cognome, nome, viaresidenza, capResidenza, cittaResidenza,
			// dataNascita, luogoNascita)
			String line = "";
			System.out.println("Inserisci il cognome");
			line = s.nextLine();
			c.setCognome(line);

			System.out.println("Inserisci il nome");
			line = s.nextLine();
			c.setNome(line);

			System.out.println("Inserisci la Via");
			line = s.nextLine();
			c.setViaresidenza(line);

			System.out.println("Inserisci il cap");
			line = s.nextLine();
			c.setCapResidenza(line);

			System.out.println("Inserisci la citta");
			line = s.nextLine();
			c.setCittaResidenza(line);

			System.out.println("Inserisci la data di nascita (aaaa-mm-gg)");
			line = s.nextLine();
			c.setDataNascita(line);

			System.out.println("Inserisci il luogo di nascita");
			line = s.nextLine();
			c.setLuogoNascita(line);

			// richiamo la query per inserire un nuovo candidato
			cDao.InsertCandidato(c);

			// Insrimento numero di telefono

			System.out.println("Inserisci il numero di telefono");
			line = s.nextLine();
			t.setNumero(line);
			t.setCandidato(codice);

			// richiamo al quesry per inserire il nuemro di telefono del nuovo candidato
			tDao.InsertTelefono(t);

			// faccio una quesry per stamapre il riepilogo delle informazioni inserire
			System.out.println(cDao.selectByTipo(codice).toString());
			System.out.println(tDao.selectByTipo(codice).toString());
		}

	}

	// Modifica dati del candidato
	public static void ModificaResidenzaCandidato(Scanner s, DefaultCandidatoDao cDao) throws IllegalFormatException {
		System.out.println("Inserire il codice del Candidato da modificare");
		int codice = Integer.parseInt(s.nextLine());
		Candidato c = cDao.selectByTipo(codice);
		if (c.getCodice() > 0) {
			// Stampa dati attuali candidato prima della modifica
			System.out.println("Dati candidato");
			System.out.println(c.toString());

			System.out.println("Inserisci la via");
			String viaResidenza = s.nextLine();

			System.out.println("Inserire Cap residenza - max 5 caratteri");
			String cap = s.nextLine();

			// se il cap inseriro è iu lungo di 5 caratteri il cap non viene aggiornato
			String capResidenza = c.getCapResidenza();
			if (cap.length() <= 5) {
				capResidenza = cap;
			}

			System.out.println("Inserisci la citta");
			String cittaResidenza = s.nextLine();

			cDao.AggiornaResidenza(codice, viaResidenza, capResidenza, cittaResidenza);
		} else {
			System.out.println("Candidato non presente");
		}

		// stampa dati candidato aggiornati
		System.out.println(cDao.selectByTipo(codice).toString());

	}

	
	// metodo per cercare i titoli di studio posseduti da ogni candidato
	public static void VisualizzaTitoliCandidato(Scanner s, DefaultCandidatoDao cDao) throws IllegalFormatException {

		LinkedList<TitoloStudio> lista = new LinkedList<TitoloStudio>();

		System.out.println("Inserisci il codice del candidato");
		int codice = Integer.parseInt(s.nextLine());
		Candidato c = new Candidato();

		// prima di proseguire verifico che quel codice sia presente
		if (cDao.selectByTipo(codice).getCodice() > 0) {
			
			// verifico che il candidato abbia dei titoli di studio
			if (cDao.VisualizzaTitoli(codice).size() > 0) {
				lista = cDao.VisualizzaTitoli(codice);
				c = cDao.selectByTipo(codice);
				System.out.println("Candidato : " + c.getCognome() + "\nTitoli posseduti ");
				for (TitoloStudio t : lista) {
					System.out.println(t.getDescrizione());
				}
			}
			else {
				System.out.println("Il candidato non ha titoli di studio");
			}
		} else {
			System.out.println("Candidato non presente");
		}

	}
}
