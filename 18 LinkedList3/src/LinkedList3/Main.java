package LinkedList3;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void writeOperation() {
		System.out.println("0.Ýþlemleri Görüntüle");
		System.out.println("1.Bir sonraki þehre git");
		System.out.println("2.Bir önceki þehre git");
		System.out.println("3 Uygulamadan çýk");
		
	}
	
	public static void tourToCities(LinkedList<String> cities) {
		
		ListIterator<String> iterator = cities.listIterator();
		
		int operation;
		
		writeOperation();
		
		Scanner scanner = new Scanner(System.in);
		
		
		if(!iterator.hasNext()) { //boþsa burasý true gelir
			
			System.out.println("Herhangi bir þehir bulunmuyor");
		}
		boolean out = false;
		boolean ileri = true;
		
		
		while(!out) {
			System.out.println("Yapmak istediðiniz iþlemi giriniz.");
			operation = scanner.nextInt();
			switch(operation) {
			
			case 0:
				writeOperation();
			break;
			
			case 1:
				//System.out.println(iterator.next());
				if(!ileri) {
					if(iterator.hasNext()) {
						iterator.next();
					}
					ileri=true;
				}
				
				if(iterator.hasNext()) {
					System.out.println("Þehre gidiliyor: " +iterator.next());
				}else {
					System.out.println("Gidilecek þehir kalmadý..");
					ileri=true;
				}
				break;
			case 2:
				//System.out.println(iterator.previous());
				
				if(ileri) { //bir önceki turda ileri gidilmiþ mi
					if(iterator.hasPrevious()) {
						iterator.previous();
					}
					ileri=false;
				}
				if(iterator.hasPrevious()) {
					System.out.println("Gidilecek þehir: " +iterator.previous());
				}else {
					System.out.println("Þehir turu baþladý..");
				}
				
				break;
				
			case 3:
				out=true;
				System.out.println("Uygulamadan çýkýlýyor..");
				break;
				
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		
		cities.add("Ankara");
		cities.add("Eskiþehir");
		cities.add("Adana");
		tourToCities(cities);
		
		

	}

}
