package Beyblade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Beyblade programýna hoþgeldiniz...");
		System.out.println("Çýkýþ için q ya basýnýz");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("hangi beyblade'i üretmek istiyorsunuz: ");
			String beyblade = scanner.nextLine();
			if(beyblade.equals("q")) {
				System.out.println("sistemden çýkýlýyor..");
			}else {
				BeybladeFactory beybladeFactory = new BeybladeFactory();
				Beyblade beyBlade= beybladeFactory.makeBeyblade(beyblade);
				
				if(beyBlade==null) {
					System.out.println("geçerli beyblade adý giriniz.");
				}else {
					beyBlade.showÝnformation();
					beyBlade.showHolyMonster();
					beyBlade.attack();
				}
			}
			
		}
		

	}

}
