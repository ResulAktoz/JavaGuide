import java.util.Scanner;

public class Main {
	public static void selamlama() {
		System.out.println("merhaba nasýlsýnýz");
		System.out.println("selamlar");
	}
	public static void faktoriyel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayý giriniz");
		int sayi= scanner.nextInt();
		int faktoriyel = 1;
		while(sayi>0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("sonuç= " +faktoriyel);
		
	}
	public static void main(String[] args) {
		
		faktoriyel();
		//selamlama();
	}

}
