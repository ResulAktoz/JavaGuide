package StaticKeyWord;

public class Main {

	public static void main(String[] args) {
		
		Audience audience1 = new Audience("Resul");
		Audience audience2 = new Audience("Sinem");
		
		audience1.watchGame();
		
		audience2.watchGame(); //static olunca get k�sm�nda son g�ncellemeyi at�yor direkt bu sebeple ilki �al��m�yor heralde.
		
		System.out.println("seyirvi "  +Audience.getNumberOfAudience());
		System.out.println("Seyircis say�s�: " +audience1.getNumberOfAudience());
		System.out.println("Seyircis say�s�: " +audience2.getNumberOfAudience());
		
		
		
		/*System.out.println(Audience.numberOfAudience);*/
		
		hi();
		System.out.println(Math.PI);

	}
	public static void hi() {
		System.out.println("Merhaba");
	}
	

}
