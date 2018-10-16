
public class Client {

	public static void main(String[] args) {
		
		Indirizzo ind=new Indirizzo(10,"via bari",28,72013,"Ceglie Messapica","br","puglia");
		Persona p = new Persona("sergio","santoro","21/12/1991",ind);
		
		System.out.println(p.getNome());
		System.out.println(p.getCognome());
		System.out.println(p.getDataNascita());
		System.out.println(p.getIndirizzo().getVia());
		System.out.println(p.getIndirizzo().getNumerocivvico());


	}

}
