package �dmanProgram�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�dman Program�na Ho�geldiniz");
		String idmanlar ="ge�erli hareketler..\n"
						+"burpee\n"
						+"pushUp(��nav)\n"
						+"sitUp(mekik)\n"
						+"squat";
		System.out.println(idmanlar);
		System.out.println("bir idman olu�turun");
		System.out.print("burpee say�s�");
		int burpee = scanner.nextInt();
		System.out.print("pushup say�s�");
		int pushup = scanner.nextInt();
		System.out.print("situp say�s�");
		int situp = scanner.nextInt();
		System.out.print("squat say�s�");
		int squat = scanner.nextInt();
		�dman idman = new �dman(burpee, pushup, situp, squat);
		System.out.println("idman�n�z ba�l�yor");
		while(idman.idmanBittiMi()== false) {
			
			System.out.print("hareket t�r�:(burpee,pushup,situp,squat) ");
			String t�r = scanner.next();
			System.out.print("Bu hareketten ka� tane yapacaks�n�z");
			int sayi= scanner.nextInt();
			idman.hareketYap(t�r, sayi);
			
			
		}
		
		
	}

}
