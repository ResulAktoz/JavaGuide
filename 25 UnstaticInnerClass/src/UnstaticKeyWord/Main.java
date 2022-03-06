package UnstaticKeyWord;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Matematik.Factorial factorial = new Matematik().new Factorial();
		Matematik.Asal asal = new Matematik().new Asal();
		Matematik.Alan alan = new Matematik().new Alan();
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		String operations = "1. Faktoriyelini al. \n"
							+"2. Asal olup olmadýðýný kontrol et. \n"
							+"3. Daire için alaný hesapla.(Yarýçapý girin) \n"
							+"Çýkýþ için q'ya basýn";
		System.out.println(operations);
		
		
		while(true) {
			System.out.println("Ýþlemi seçiniz..");
			String operation = scanner.next();
			
			
			
		
		if(operation.equals("q")) {
			System.out.println("Çýkýþ yapýlýyor..");
			break;
		}else if (operation.equals("1")) {
			System.out.println("Sayý giriniz. ");
			int sayi = scanner.nextInt();
			factorial.faktöriyel(sayi);
			
		}else if(operation.equals("2")) {
			System.out.println("Sayý giriniz. ");
			int sayi = scanner.nextInt();
			asal.asalMý(sayi);
			
		}else if(operation.equals("3")) {
			System.out.println("Sayý giriniz. ");
			int sayi = scanner.nextInt();
			alan.daireAlan(sayi);
		}
		
		
		
		
		
		
		
		
		

	}
	}
}
