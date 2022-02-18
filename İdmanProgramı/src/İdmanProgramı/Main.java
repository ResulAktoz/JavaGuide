package ÝdmanProgramý;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ýdman Programýna Hoþgeldiniz");
		String idmanlar ="geçerli hareketler..\n"
						+"burpee\n"
						+"pushUp(þýnav)\n"
						+"sitUp(mekik)\n"
						+"squat";
		System.out.println(idmanlar);
		System.out.println("bir idman oluþturun");
		System.out.print("burpee sayýsý");
		int burpee = scanner.nextInt();
		System.out.print("pushup sayýsý");
		int pushup = scanner.nextInt();
		System.out.print("situp sayýsý");
		int situp = scanner.nextInt();
		System.out.print("squat sayýsý");
		int squat = scanner.nextInt();
		Ýdman idman = new Ýdman(burpee, pushup, situp, squat);
		System.out.println("idmanýnýz baþlýyor");
		while(idman.idmanBittiMi()== false) {
			
			System.out.print("hareket türü:(burpee,pushup,situp,squat) ");
			String tür = scanner.next();
			System.out.print("Bu hareketten kaç tane yapacaksýnýz");
			int sayi= scanner.nextInt();
			idman.hareketYap(tür, sayi);
			
			
		}
		
		
	}

}
