import java.util.Scanner;

public class Main {
	public static void selamlama() {
		System.out.println("merhaba nas�ls�n�z");
		System.out.println("selamlar");
	}
	public static void faktoriyel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("say� giriniz");
		int sayi= scanner.nextInt();
		int faktoriyel = 1;
		while(sayi>0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("sonu�= " +faktoriyel);
		
	}
	public static void main(String[] args) {
		
		faktoriyel();
		//selamlama();
	}

}
