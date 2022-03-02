package YurtD�����k��Program�;

import java.util.Scanner;

public class Passenger implements rulesOfAbroad{
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Passenger() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yat�r�lan har� bedelini giriniz: ");
		this.harc= scanner.nextInt();
		
		System.out.println("Herhangi bir siyasi yasa��n�z bulunuyor mu ? (Evet ya da Hay�r) "); 
		String cevap = scanner.next();
		
		if(cevap.equals( "Evet")) {
			this.siyasiYasak=true;
		}else {
			this.siyasiYasak=false;
		}
		
		System.out.println("Vizeniz bulunuyor mu? (Evet ya da Hay�r) ");
		
		String cevap2 = scanner.next();
		
		if(cevap2.equals( "Evet")) {
			this.vizeDurumu=true;
		}else {
			this.vizeDurumu=false;
		}
		
		
	}
	@Override
	public boolean yurtDisiHarciKontrol() {
		
		if(this.harc<15) {
			System.out.println("L�tfen harc�n�z� tam yat�r�n");
			return false;
		}else {
			System.out.println("Har� i�lemi tamam. ");
			return true;
		}
		
		
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak==true) {
			System.out.println("Siyasi yasa��n�z bulunuyor. Yurt d���na ��kamazs�n�z");
			return false;
		}else {
			System.out.println("Siyasi yasa��n�z bulunmuyor. ");
			return true;
		}
		
	}
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vizeDurumu==true) {
			System.out.println("Vize i�lemleri tamamd�r");
			return true;
		}else {
			System.out.println("Vizeniz bulunmamaktad�r.");
		}
		return false;
	}

}
