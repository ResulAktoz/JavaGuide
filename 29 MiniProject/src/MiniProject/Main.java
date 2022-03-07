package MiniProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Matematik ve Fizik Problemleri programýna hoþgeldiniz..");
		
		String operations = "1. Daire Alaný hesaplama \n"
							+"2. Üçgen Çevresi hesapla \n"
							+"3. Ýki vektörün iç çarpýmýný hesaplama \n"
							+"Çýkýþ için q'ya basýn.";
		
		while(true) {
			System.out.println(operations);
			System.out.println("Ýþlemi seçiniz..");
			String operation = scanner.next();
			
			if(operation.equals("q")) {
				System.out.println("Çýkýþ yapýlýyor..");
				break;
			}else if( operation.equals("1")) {
				System.out.println("Yarýçapý giriniz.");
				int r= scanner.nextInt();
				Problem.Mathematic.circleArea(r);
				System.out.println("*****************");
				
			}else if(operation.equals("2")) {
				System.out.print("1. kenarýn ölçüsünü giriniz");
				int a= scanner.nextInt();
				System.out.print("2. kenarýn ölçüsünü giriniz");
				int b= scanner.nextInt();
				System.out.print("3. kenarýn ölçüsünü giriniz");
				int c= scanner.nextInt();
				Problem.Mathematic.triangePerimeter(a, b, c);
				System.out.println("*****************");
			}else if(operation.equals("3")) {
				Vect vect1 = new Vect("1. vektör");
				Vect vect2 = new Vect("2. vektör");
				Problem.Physics.innerProduct(vect1, vect2);
				System.out.println("*****************");
				
			}else {
				System.out.println("Geçersiz iþlem..");
			}
			
		}

	}

}
