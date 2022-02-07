package breakvecontinuKullanýmý;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		while(true) { // burda break kullanmazsak sonsuza kadar devam eder.
//			System.out.print("Bir sayý girin ");
//			int islem = scanner.nextInt();
//			
//			if(islem == -1) {
//				System.out.println("döngüden çýkýldý");
//				break;
//			}
//			System.out.println("Ýþlem= " +islem);
//		}
		
//		for(int i=0; i<10; i++) {
//			if(i == 3 || i==5) {
//				continue; //i 3 ve 5 olduðunda alt tarafa girmeden baþa döner.
//			}
//			System.out.println("i = " +i);
//			
//		}
		
		int i =0;
		while(i<10) {
			if(i == 3 || i==5) { //i++ bu satýrýn altýna gelmeli.
				continue;
			}
			System.out.println("i = " +i);
			i++;
		} // i 3e geldiðinde i++ iþlemi continue altýnda kaldýðý için sonsuz döngüye girer eðer i++'yý if sonrasýna yazarsak döngü normal þekilde çalýþýr. 

	}

}
