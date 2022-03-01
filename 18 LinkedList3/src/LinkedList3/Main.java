package LinkedList3;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void writeOperation() {
		System.out.println("0.��lemleri G�r�nt�le");
		System.out.println("1.Bir sonraki �ehre git");
		System.out.println("2.Bir �nceki �ehre git");
		System.out.println("3 Uygulamadan ��k");
		
	}
	
	public static void tourToCities(LinkedList<String> cities) {
		
		ListIterator<String> iterator = cities.listIterator();
		
		int operation;
		
		writeOperation();
		
		Scanner scanner = new Scanner(System.in);
		
		
		if(!iterator.hasNext()) { //bo�sa buras� true gelir
			
			System.out.println("Herhangi bir �ehir bulunmuyor");
		}
		boolean out = false;
		boolean ileri = true;
		
		
		while(!out) {
			System.out.println("Yapmak istedi�iniz i�lemi giriniz.");
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
					System.out.println("�ehre gidiliyor: " +iterator.next());
				}else {
					System.out.println("Gidilecek �ehir kalmad�..");
					ileri=true;
				}
				break;
			case 2:
				//System.out.println(iterator.previous());
				
				if(ileri) { //bir �nceki turda ileri gidilmi� mi
					if(iterator.hasPrevious()) {
						iterator.previous();
					}
					ileri=false;
				}
				if(iterator.hasPrevious()) {
					System.out.println("Gidilecek �ehir: " +iterator.previous());
				}else {
					System.out.println("�ehir turu ba�lad�..");
				}
				
				break;
				
			case 3:
				out=true;
				System.out.println("Uygulamadan ��k�l�yor..");
				break;
				
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		
		cities.add("Ankara");
		cities.add("Eski�ehir");
		cities.add("Adana");
		tourToCities(cities);
		
		

	}

}
