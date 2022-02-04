import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Sayýyý giriniz: ");
		
		int sayi1= scanner.nextInt();
		
		System.out.print("2.sayýyý giriniz: ");
		
		int sayi2 = scanner.nextInt();
		
		System.out.println("deðiþtirilmeden önce sayýlarýn deðerleri");
		System.out.println("Sayý 1 = " +sayi1+ "Sayý 2 = " +sayi2);
		
		int gecicisayi= sayi1;
		sayi1 = sayi2;
		
		System.out.println("Yeni deðerler için");
		
		System.out.println("Sayý 1 in yeni deðeri" +sayi1+"dir");
		
		sayi2= gecicisayi;
		
		System.out.print("Sayý 2 nin yeni deðeri" +sayi2+"dir");

	}

}
