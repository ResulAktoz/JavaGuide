package MiniProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Matematik ve Fizik Problemleri program�na ho�geldiniz..");
		
		String operations = "1. Daire Alan� hesaplama \n"
							+"2. ��gen �evresi hesapla \n"
							+"3. �ki vekt�r�n i� �arp�m�n� hesaplama \n"
							+"��k�� i�in q'ya bas�n.";
		
		while(true) {
			System.out.println(operations);
			System.out.println("��lemi se�iniz..");
			String operation = scanner.next();
			
			if(operation.equals("q")) {
				System.out.println("��k�� yap�l�yor..");
				break;
			}else if( operation.equals("1")) {
				System.out.println("Yar��ap� giriniz.");
				int r= scanner.nextInt();
				Problem.Mathematic.circleArea(r);
				System.out.println("*****************");
				
			}else if(operation.equals("2")) {
				System.out.print("1. kenar�n �l��s�n� giriniz");
				int a= scanner.nextInt();
				System.out.print("2. kenar�n �l��s�n� giriniz");
				int b= scanner.nextInt();
				System.out.print("3. kenar�n �l��s�n� giriniz");
				int c= scanner.nextInt();
				Problem.Mathematic.triangePerimeter(a, b, c);
				System.out.println("*****************");
			}else if(operation.equals("3")) {
				Vect vect1 = new Vect("1. vekt�r");
				Vect vect2 = new Vect("2. vekt�r");
				Problem.Physics.innerProduct(vect1, vect2);
				System.out.println("*****************");
				
			}else {
				System.out.println("Ge�ersiz i�lem..");
			}
			
		}

	}

}
