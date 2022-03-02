package YurtDýþýÇýkýþProgramý;

import java.util.Scanner;

public class Passenger implements rulesOfAbroad{
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Passenger() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yatýrýlan harç bedelini giriniz: ");
		this.harc= scanner.nextInt();
		
		System.out.println("Herhangi bir siyasi yasaðýnýz bulunuyor mu ? (Evet ya da Hayýr) "); 
		String cevap = scanner.next();
		
		if(cevap.equals( "Evet")) {
			this.siyasiYasak=true;
		}else {
			this.siyasiYasak=false;
		}
		
		System.out.println("Vizeniz bulunuyor mu? (Evet ya da Hayýr) ");
		
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
			System.out.println("Lütfen harcýnýzý tam yatýrýn");
			return false;
		}else {
			System.out.println("Harç iþlemi tamam. ");
			return true;
		}
		
		
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak==true) {
			System.out.println("Siyasi yasaðýnýz bulunuyor. Yurt dýþýna çýkamazsýnýz");
			return false;
		}else {
			System.out.println("Siyasi yasaðýnýz bulunmuyor. ");
			return true;
		}
		
	}
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vizeDurumu==true) {
			System.out.println("Vize iþlemleri tamamdýr");
			return true;
		}else {
			System.out.println("Vizeniz bulunmamaktadýr.");
		}
		return false;
	}

}
