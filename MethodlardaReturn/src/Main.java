import java.util.Scanner;

public class Main {
//	public static int toplama(int a, int b, int c) {
//		//System.out.println("toplam= " +(a+b+c));
//		return (a+b+c);
//	}
	public static int ikiiletoplama(int a) {
		return a+2;
	}
	
	public static int ikiile�arpma(int b) {
		return b*2;
	}
	
	public static void main(String[] args) {
		
		//System.out.println("��kt� de�eri= " +toplama(1,2,3));
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int sayi = scanner.nextInt();
		System.out.println("yapmak istedi�iniz i�lemi belirtiniz: 1-�arpma 2-toplama ");
		
		int islem= scanner.nextInt();
//		if(islem == "�arpma") {
//			System.out.println("sonu� = " +ikiile�arpma(sayi));
//		}
//		else {
//			System.out.println("sonu� = " +ikiiletoplama(sayi));
//		}
		switch(islem) {
		case 1 :
			System.out.println("sonu�  =" +ikiile�arpma(sayi)) ;
			break;
		case 2:
			System.out.println("sonu� = " +ikiiletoplama(sayi));
			break;
		}
	}

}
