import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kilonuzu giriniz" );
		
		double kilo = scanner.nextDouble();
		
		System.out.println("boyunuzu giriniz (örnek (1,72)" );
		double boy = scanner.nextDouble();
		
		
		double bki = kilo/(boy * boy) ;
		
		System.out.println("beden kitle indeksiniz : " +bki );
		
		

	}

}
