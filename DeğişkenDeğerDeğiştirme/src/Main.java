import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Say�y� giriniz: ");
		
		int sayi1= scanner.nextInt();
		
		System.out.print("2.say�y� giriniz: ");
		
		int sayi2 = scanner.nextInt();
		
		System.out.println("de�i�tirilmeden �nce say�lar�n de�erleri");
		System.out.println("Say� 1 = " +sayi1+ "Say� 2 = " +sayi2);
		
		int gecicisayi= sayi1;
		sayi1 = sayi2;
		
		System.out.println("Yeni de�erler i�in");
		
		System.out.println("Say� 1 in yeni de�eri" +sayi1+"dir");
		
		sayi2= gecicisayi;
		
		System.out.print("Say� 2 nin yeni de�eri" +sayi2+"dir");

	}

}
