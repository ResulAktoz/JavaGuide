import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. say�y� girin: ");
		
		int sayi1 = scanner.nextInt();
		
		System.out.print("2.say�y� girin: ");
		
		int sayi2 = scanner.nextInt();
		
		System.out.print("3.say�y� girin: ");
		
		int sayi3 = scanner.nextInt();
		
		int maks= -1;
//		benim yazd���m
//		if(sayi1>sayi2&& sayi1 >sayi3) {
//			System.out.println("maksinmum say�: " +sayi1);
//			
//		}
//		else if(sayi2>sayi3) {
//			System.out.println("maks. say�: " +sayi2);
//		}
//		else {
//			System.out.println("mak say�: " +sayi3);
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
		System.out.println("maksimum say� = " +maks);
	}
		//if i�ine e�ittir koyunca b�t�n say�alr e�it olsa da maks diye ��kt� veriyor.

}
