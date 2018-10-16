package eser1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indirizzo ind1= new Indirizzo ("Via del Tintoretto",28,"Modena",41100,"MO", "Emilia Romagna");
		Persona ema= new Persona ("Emanuele", "Avallone", "18/05/1992",ind1);
System.out.println(ema);
	}

}
