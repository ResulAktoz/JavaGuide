package UnstaticKeyWord;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Matematik.Factorial factorial = new Matematik().new Factorial();
		Matematik.Asal asal = new Matematik().new Asal();
		Matematik.Alan alan = new Matematik().new Alan();
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		String operations = "1. Faktoriyelini al. \n"
							+"2. Asal olup olmad���n� kontrol et. \n"
							+"3. Daire i�in alan� hesapla.(Yar��ap� girin) \n"
							+"��k�� i�in q'ya bas�n";
		System.out.println(operations);
		
		
		while(true) {
			System.out.println("��lemi se�iniz..");
			String operation = scanner.next();
			
			
			
		
		if(operation.equals("q")) {
			System.out.println("��k�� yap�l�yor..");
			break;
		}else if (operation.equals("1")) {
			System.out.println("Say� giriniz. ");
			int sayi = scanner.nextInt();
			factorial.fakt�riyel(sayi);
			
		}else if(operation.equals("2")) {
			System.out.println("Say� giriniz. ");
			int sayi = scanner.nextInt();
			asal.asalM�(sayi);
			
		}else if(operation.equals("3")) {
			System.out.println("Say� giriniz. ");
			int sayi = scanner.nextInt();
			alan.daireAlan(sayi);
		}
		
		
		
		
		
		
		
		
		

	}
	}
}
