import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("aracýnýz 100 km'de ortalama kaç yakýyor " );
		
		double ortalama = scanner.nextDouble();
		
		
		double kurus = (11.50*ortalama)/100;
		
		System.out.println("aracýnýzýn kilometre baþýna yaktýðý yakýt fiyatý(kr)" +kurus);
		
		System.out.print("kaç kilometre gittiniz: ");
		
		double kilometre = scanner.nextDouble();
		
		double toplam = kurus*kilometre;
		
		System.out.print("toplam masrafýnýz" +toplam);

	}

}
