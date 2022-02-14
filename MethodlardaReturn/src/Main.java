import java.util.Scanner;

public class Main {
//	public static int toplama(int a, int b, int c) {
//		//System.out.println("toplam= " +(a+b+c));
//		return (a+b+c);
//	}
	public static int ikiiletoplama(int a) {
		return a+2;
	}
	
	public static int ikiileçarpma(int b) {
		return b*2;
	}
	
	public static void main(String[] args) {
		
		//System.out.println("çýktý deðeri= " +toplama(1,2,3));
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi = scanner.nextInt();
		System.out.println("yapmak istediðiniz iþlemi belirtiniz: 1-çarpma 2-toplama ");
		
		int islem= scanner.nextInt();
//		if(islem == "çarpma") {
//			System.out.println("sonuç = " +ikiileçarpma(sayi));
//		}
//		else {
//			System.out.println("sonuç = " +ikiiletoplama(sayi));
//		}
		switch(islem) {
		case 1 :
			System.out.println("sonuç  =" +ikiileçarpma(sayi)) ;
			break;
		case 2:
			System.out.println("sonuç = " +ikiiletoplama(sayi));
			break;
		}
	}

}
