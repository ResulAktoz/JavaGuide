package geometrik�ekilHesaplama;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String operations= "��lemler..\n"
							+"1. Kare Alan hesapla\n"
							+"2. ��gen Alan hesapla\n"
							+"3. Daire Alan hesapla\n"
							+"��k�� i�in q'ya bas�n�z.";
		
		while(true) {
			System.out.println(operations);
			System.out.println("Hangi i�lemi yapmak istedi�inizi se�iniz");
			String operationType = scanner.next();
			Figure figure=null;
			if(operationType.equals("q")) {
				System.out.println("��k�� yap�l�yor..");
				break;
			}else if(operationType.equals("1")) {
				System.out.println("Kenar uzunlu�u");
				int side = scanner.nextInt();
				figure = new Square("Kare1'in", side);
				figure.calculateArea();
			}
			else if(operationType.equals("2")) {
				System.out.print("��genin 1.kenar uzunlu�unu� giriniz");
				int side1= scanner.nextInt();
				System.out.print("��genin 2.kenar uzunlu�unu� giriniz");
				int side2= scanner.nextInt();
				System.out.print("��genin 3.kenar uzunlu�unu� giriniz");
				int side3 = scanner.nextInt();
				figure = new Triangle("��gen1", side1, side2, side3);
				figure.calculateArea();
			}
			else if(operationType.equals("3")) {
				System.out.println("Yar��ap� Giriniz: ");
				int r = scanner.nextInt();
				figure = new Circle("Daire1", r);
				figure.calculateArea();
				
			}
			
		}
		
		
		
}
						

}
