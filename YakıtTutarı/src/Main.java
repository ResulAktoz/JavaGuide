import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("arac�n�z 100 km'de ortalama ka� yak�yor " );
		
		double ortalama = scanner.nextDouble();
		
		
		double kurus = (11.50*ortalama)/100;
		
		System.out.println("arac�n�z�n kilometre ba��na yakt��� yak�t fiyat�(kr)" +kurus);
		
		System.out.print("ka� kilometre gittiniz: ");
		
		double kilometre = scanner.nextDouble();
		
		double toplam = kurus*kilometre;
		
		System.out.print("toplam masraf�n�z" +toplam);

	}

}
