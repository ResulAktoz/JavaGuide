package breakvecontinuKullan�m�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		while(true) { // burda break kullanmazsak sonsuza kadar devam eder.
//			System.out.print("Bir say� girin ");
//			int islem = scanner.nextInt();
//			
//			if(islem == -1) {
//				System.out.println("d�ng�den ��k�ld�");
//				break;
//			}
//			System.out.println("��lem= " +islem);
//		}
		
//		for(int i=0; i<10; i++) {
//			if(i == 3 || i==5) {
//				continue; //i 3 ve 5 oldu�unda alt tarafa girmeden ba�a d�ner.
//			}
//			System.out.println("i = " +i);
//			
//		}
		
		int i =0;
		while(i<10) {
			if(i == 3 || i==5) { //i++ bu sat�r�n alt�na gelmeli.
				continue;
			}
			System.out.println("i = " +i);
			i++;
		} // i 3e geldi�inde i++ i�lemi continue alt�nda kald��� i�in sonsuz d�ng�ye girer e�er i++'y� if sonras�na yazarsak d�ng� normal �ekilde �al���r. 

	}

}
