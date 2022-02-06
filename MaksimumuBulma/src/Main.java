import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. sayýyý girin: ");
		
		int sayi1 = scanner.nextInt();
		
		System.out.print("2.sayýyý girin: ");
		
		int sayi2 = scanner.nextInt();
		
		System.out.print("3.sayýyý girin: ");
		
		int sayi3 = scanner.nextInt();
		
		int maks= -1;
//		benim yazdýðým
//		if(sayi1>sayi2&& sayi1 >sayi3) {
//			System.out.println("maksinmum sayý: " +sayi1);
//			
//		}
//		else if(sayi2>sayi3) {
//			System.out.println("maks. sayý: " +sayi2);
//		}
//		else {
//			System.out.println("mak sayý: " +sayi3);
//		}
//
		if(sayi1>=sayi2&& sayi1 >=sayi3) {
			maks = sayi1;
		}
		else if (sayi2>=sayi3 && sayi2>=sayi1) {
			maks = sayi2;
		}
		else {
			maks = sayi3;
		}
		System.out.println("maksimum sayý = " +maks);
	}
		//if içine eþittir koyunca bütün sayýalr eþit olsa da maks diye çýktý veriyor.

}
