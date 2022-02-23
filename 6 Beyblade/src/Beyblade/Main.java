package Beyblade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Beyblade program�na ho�geldiniz...");
		System.out.println("��k�� i�in q ya bas�n�z");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("hangi beyblade'i �retmek istiyorsunuz: ");
			String beyblade = scanner.nextLine();
			if(beyblade.equals("q")) {
				System.out.println("sistemden ��k�l�yor..");
			}else {
				BeybladeFactory beybladeFactory = new BeybladeFactory();
				Beyblade beyBlade= beybladeFactory.makeBeyblade(beyblade);
				
				if(beyBlade==null) {
					System.out.println("ge�erli beyblade ad� giriniz.");
				}else {
					beyBlade.show�nformation();
					beyBlade.showHolyMonster();
					beyBlade.attack();
				}
			}
			
		}
		

	}

}
