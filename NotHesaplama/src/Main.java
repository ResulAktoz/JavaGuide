import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Vize notunuzu giriniz: ");
		int vizeS�nav� =  scanner.nextInt();
		System.out.print("Final notunuzu giriniz: ");
		int finalS�nav� = scanner.nextInt();
		double not =  (vizeS�nav� *0.4)+(finalS�nav� *0.6);
		System.out.println("okul ortalaman� gir: ");
		double ort= scanner.nextDouble();
		
		if(not>=85) {
			System.out.println("AA");
		}
		else if(not>=80 && not<85) {
			System.out.println("BA");
		}
		else if(not>=70 && not<80) {
			System.out.println("CB");
			
		
		}
		else if(not>=60 && not<70 ) {
			System.out.println("DD");
			if(ort<= 2.50) {
			System.out.println("ortalaman 2.50, �ok �al��");
			}
		}
		else {
			System.out.println("FF");
			
		}
		
		
		
			
		}

	}


