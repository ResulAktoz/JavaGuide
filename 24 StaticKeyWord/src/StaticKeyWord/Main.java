package StaticKeyWord;

public class Main {

	public static void main(String[] args) {
		
		Audience audience1 = new Audience("Resul");
		Audience audience2 = new Audience("Sinem");
		
		audience1.watchGame();
		
		audience2.watchGame(); //static olunca get kýsmýnda son güncellemeyi atýyor direkt bu sebeple ilki çalýþmýyor heralde.
		
		System.out.println("seyirvi "  +Audience.getNumberOfAudience());
		System.out.println("Seyircis sayýsý: " +audience1.getNumberOfAudience());
		System.out.println("Seyircis sayýsý: " +audience2.getNumberOfAudience());
		
		
		
		/*System.out.println(Audience.numberOfAudience);*/
		
		hi();
		System.out.println(Math.PI);

	}
	public static void hi() {
		System.out.println("Merhaba");
	}
	

}
