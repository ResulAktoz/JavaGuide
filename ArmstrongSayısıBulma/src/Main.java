import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("say�y� giriniz: ");
		int sayi= scanner.nextInt();
		System.out.println("basamak say�s�: ");
		int basamakSayisi = scanner.nextInt();
		
		int geciciSayi= sayi;
		int toplam =0;
		do {
			int basamakDegeri = geciciSayi %10; //birler basama��n� buluyoruz
			geciciSayi = geciciSayi/10;// ilk i�lemde mesela 1634� 10 b�ler int oldu�u i�in say� 163 kal�r devam eder bu sayede basamak de�erlerini al�yoruz.
			toplam += Math.pow(basamakDegeri, basamakSayisi);
		}while(geciciSayi>0);
		if(sayi == toplam) {
			System.out.println("bu say� armstrong say�d�r");
		}else {
			System.out.println("bu say� armstrong say�s� de�ildir");
		}

	}

}
