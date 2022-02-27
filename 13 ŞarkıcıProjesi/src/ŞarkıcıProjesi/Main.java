package ÞarkýcýProjesi;

import java.util.Scanner;

public class Main {
	
	private static Singers singers = new Singers();	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void writeProcces() {
		
		System.out.println("\t 0-Ýþlemleri Görüntüle");
		System.out.println("\t 1-Þarkýcýlarý Görüntüle");
		System.out.println("\t 2-Þarkýcý Ekle");
		System.out.println("\t 3-Þarkýcý Güncelle");
		System.out.println("\t 4-Þarkýcý Sil");
		System.out.println("\t 5-Þarkýcý Ara");
		System.out.println("\t 6-Uygulamadan Çýk");
	}
	
	public static void showSinger() {
		singers.writeSingers();
	}
	public static void addSinger() {
		System.out.print("Eklemek Ýstediðiniz Þarkýcýnýn Ýsmi: ");
		String name= scanner.next();
		singers.addSinger(name);
		
	}
	
	public static void updateSinger() {
		System.out.print("Eklemek Ýstediðiniz Þarkýcýnýn Ýsmini Giriniz: ");
		String name= scanner.next();
		System.out.print("Eklemek istediðiniz sýrayý giriniz.(1,2,3): ");
		int position = scanner.nextInt();
		
		
		singers.updateSinger(name, position-1);
	}
	public static void removeSinger() {
		System.out.print("Silmek istediðiniz Þarkýcýnýn Sýrasýný Giriniz (1,2,3): ");
		int position = scanner.nextInt();
		int number = position-1;
		singers.removeSinger(number);
	}
	
	public static void searchSinger() {
		System.out.print("Aramak istediðiniz Þarkýcýnýn Adýný giriniz: ");
		String name= scanner.next();
		singers.searchSinger(name);
	}

	public static void main(String[] args) {
		
		System.out.println("\t Þarkýcý uygulamasýna hoþgeldiniz..");
		
		writeProcces();
		
		boolean out = false;
		int procces;
		
		while(!out) { //not out dediðimiz için true oluyor. Sonsuz döngüye girecez ancak 6 deðeri bastýðýmýz zaman true olacak yani döngüden çýkacaz
			System.out.println("Bir Ýþlem Seçiniz");
			
			procces = scanner.nextInt();
			switch(procces) {
			
			case 0:
				writeProcces();
				break;
			case 1:
				//singers.writeSingers();
				showSinger();
				
				break;
			case 2:
				//singers.addSinger("");
				addSinger();
				break;
			case 3:
				//singers.updateSinger(null, null);
				updateSinger();
				break;
			case 4:
				//singers.removeSinger(procces);
				removeSinger();
				break;
			case 5:
				//singers.searchSinger(null);
				searchSinger();
				break;
			case 6:
				out= true;
				System.out.println("Uygulamadan Çýkýlýyor...");
				break;
			}
			
			
		}
		
	}
	

}
