package it.silvioCurricula;

import java.util.Scanner;

import it.silvioCurricula.dao.CandidatoDao;
import it.silvioCurricula.dao.impl.DefaultCandidatoDao;
import it.silvioCurricula.model.Candidato;

public class MainCurricula {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CandidatoDao candidatoDao = new DefaultCandidatoDao();

		int scelta;
		do {
			System.out.println("------------------MENU'------------------");
			System.out.println("1) Inserisci un candidato e il suo numero");
			System.out.println("2) Visualizza i titoli di studio di un candidato");
			System.out.println("3) Aggiorna residenza di un candidato");
			System.out.println("4) Esci");
			scelta = Integer.parseInt(input.nextLine());

			switch (scelta) {
			case 1:
				Candidato c1 = new Candidato();

				System.out.println("Inserisci il codice del nuovo candidato");
				int codice = Integer.parseInt(input.nextLine());
				c1.setCodice(codice);

				System.out.println("Inserisci il cognome del nuovo candidato");
				String cognome = input.nextLine();
				c1.setCognome(cognome);

				System.out.println("Inserisci il nome del nuovo candidato");
				String nome = input.nextLine();
				c1.setNome(nome);

				System.out.println("Inserisci la via della residenza del nuovo candidato");
				String via = input.nextLine();
				c1.setViaResidenza(via);

				System.out.println("Inserisci il CAP della città di residenza del nuovo candidato");
				String cap = input.nextLine();
				c1.setCapResidenza(cap);

				System.out.println("Inserisci la citta di residenza del nuovo candidato");
				String citta = input.nextLine();
				c1.setCittaResidenza(citta);

				System.out.println("Inserisci la data di nascita del nuovo candidato");
				String dataNascita = input.nextLine();
				c1.setDataNascita(dataNascita);

				System.out.println("Inserisci il luogo di nascita del nuovo candidato");
				String luogo = input.nextLine();
				c1.setLuogoNascita(luogo);

				System.out.println("Inserisci il numero di telefono del nuovo candidato");
				String numero = input.nextLine();

				System.out.println(c1);

				candidatoDao.insert(c1, numero);

				break;

			case 2:
				System.out.println("Questi sono i codici dei candidati presenti:");
				System.out.println(candidatoDao.selectCodiciCandidato());
				System.out.println("Di quale ti interessa sapere i titoli di studio?");

				int tuoCodice = Integer.parseInt(input.nextLine());
				if (candidatoDao.selectCodiciCandidato().contains(tuoCodice)) {
					System.out.println("Il candidato con codice " + tuoCodice + " ha questi titoli di studio: "
							+ candidatoDao.select(tuoCodice));
				} else
					System.out.println("Codice candidato non presente");

				break;
			case 3:
				System.out.println("Qesti sono i codici dei candidati presenti");
				System.out.println(candidatoDao.selectCodiciCandidato());
				System.out.println("Inserisci il codice del candidato da aggiornare");
				int id = Integer.parseInt(input.nextLine());

				if (candidatoDao.selectCodiciCandidato().contains(id)) {
					System.out.println("Inserisci la via della nuova residenza");
					String newvia = input.nextLine();

					System.out.println("Inserisci il CAP della nuova residenza");
					String newcap = input.nextLine();

					System.out.println("Inserisci la città della nuova residenza");
					String newcitta = input.nextLine();

					candidatoDao.update(id, newvia, newcap, newcitta);
				} else
					System.out.println("Codice candidato non presente");

				break;
			default:

				System.out.println("Inserisci una scelta corretta: 4 per terminare");
				break;
			}
		} while (scelta != 4);

		input.close();

	}
}
