import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayýyý giriniz: ");
		int sayi= scanner.nextInt();
		System.out.println("basamak sayýsý: ");
		int basamakSayisi = scanner.nextInt();
		
		int geciciSayi= sayi;
		int toplam =0;
		do {
			int basamakDegeri = geciciSayi %10; //birler basamaðýný buluyoruz
			geciciSayi = geciciSayi/10;// ilk iþlemde mesela 1634ü 10 böler int olduðu için sayý 163 kalýr devam eder bu sayede basamak deðerlerini alýyoruz.
			toplam += Math.pow(basamakDegeri, basamakSayisi);
		}while(geciciSayi>0);
		if(sayi == toplam) {
			System.out.println("bu sayý armstrong sayýdýr");
		}else {
			System.out.println("bu sayý armstrong sayýsý deðildir");
		}

	}

}
