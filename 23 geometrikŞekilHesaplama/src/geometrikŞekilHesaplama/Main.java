package geometrikÞekilHesaplama;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String operations= "Ýþlemler..\n"
							+"1. Kare Alan hesapla\n"
							+"2. Üçgen Alan hesapla\n"
							+"3. Daire Alan hesapla\n"
							+"Çýkýþ için q'ya basýnýz.";
		
		while(true) {
			System.out.println(operations);
			System.out.println("Hangi iþlemi yapmak istediðinizi seçiniz");
			String operationType = scanner.next();
			Figure figure=null;
			if(operationType.equals("q")) {
				System.out.println("Çýkýþ yapýlýyor..");
				break;
			}else if(operationType.equals("1")) {
				System.out.println("Kenar uzunluðu");
				int side = scanner.nextInt();
				figure = new Square("Kare1'in", side);
				figure.calculateArea();
			}
			else if(operationType.equals("2")) {
				System.out.print("Üçgenin 1.kenar uzunluðunuý giriniz");
				int side1= scanner.nextInt();
				System.out.print("Üçgenin 2.kenar uzunluðunuý giriniz");
				int side2= scanner.nextInt();
				System.out.print("Üçgenin 3.kenar uzunluðunuý giriniz");
				int side3 = scanner.nextInt();
				figure = new Triangle("Üçgen1", side1, side2, side3);
				figure.calculateArea();
			}
			else if(operationType.equals("3")) {
				System.out.println("Yarýçapý Giriniz: ");
				int r = scanner.nextInt();
				figure = new Circle("Daire1", r);
				figure.calculateArea();
				
			}
			
		}
		
		
		
}
						

}
