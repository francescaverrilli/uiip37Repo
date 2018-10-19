package it.sopra.dipietro;

import Model.Aereo;
import Model.Aeroporto;
import Model.Volo;
import dao.AereoDao;
import dao.AeroportoDao;
import dao.VoloDao;
import dao.impl.defaultAereoDao;
import dao.impl.defaultAeroportoDao;
import dao.impl.defautVoloDao;

public class App {
	
	public static void main(String[] args) {
		Aereo a1 = new Aereo("A35", 250, 1000);
		Aereo a2 = new Aereo("shut", 300, 7564);
		Aereo a3 = new Aereo("B747", 678, 73643);
		AereoDao aereoDao = new defaultAereoDao();
		
		aereoDao.insert(a1);
		aereoDao.insert(a2);
		aereoDao.insert(a3);
		
		System.out.println(aereoDao.selectByTipo(a1.getTipoAereo()));
		System.out.println(aereoDao.selectByTipo(a2.getTipoAereo()));
		System.out.println(aereoDao.selectByTipo(a3.getTipoAereo()));
		
		aereoDao.update(a1.getTipoAereo(),a1);
		aereoDao.update(a2.getTipoAereo(),a2);
		aereoDao.update(a3.getTipoAereo(),a3);
		
		Aeroporto aeroporto1 = new Aeroporto ("Napoli","Italia",5);
		Aeroporto aeroporto2 = new Aeroporto ("Roma","Italia",10);
		Aeroporto aeroporto3 = new Aeroporto ("Barcellona","Spagna",8);
		Aeroporto aeroporto4 = new Aeroporto ("NewYork","Stati Uniti",20);
		AeroportoDao aeroportoDao = (AeroportoDao) new defaultAeroportoDao();

		aeroportoDao.insert(aeroporto1);
		aeroportoDao.insert(aeroporto2);
		aeroportoDao.insert(aeroporto3);
		aeroportoDao.insert(aeroporto4);
		
		System.out.println(aeroportoDao.selectByCitta(aeroporto1.getCittà()));
		System.out.println(aeroportoDao.selectByCitta(aeroporto2.getCittà()));
		System.out.println(aeroportoDao.selectByCitta(aeroporto3.getCittà()));
		System.out.println(aeroportoDao.selectByCitta(aeroporto4.getCittà()));
		
		aeroportoDao.update(aeroporto1.getCittà(),aeroporto1);
		aeroportoDao.update(aeroporto2.getCittà(),aeroporto2);
		aeroportoDao.update(aeroporto3.getCittà(),aeroporto3);
		aeroportoDao.update(aeroporto4.getCittà(),aeroporto4);
		
		Volo volo1 = new Volo (1,"lunedì","Roma","Amsterdam","F35",12,15);
		VoloDao voloDao = new defautVoloDao();
		voloDao.insert(volo1);
		System.out.println(voloDao.selectByGiornoID(volo1.getGiornoSett(),volo1.getIdVolo()));
		voloDao.update(volo1.getGiornoSett(),volo1.getIdVolo(),volo1);
		
	}
}
