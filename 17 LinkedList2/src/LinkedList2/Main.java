package LinkedList2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	
	public static void writeList(LinkedList<String> placeToGo) {
		
//		for (String S : placeToGo) {
//			System.out.println(S);
//		}
		
		ListIterator<String> iterator = placeToGo.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
	
	public static void addWithOrder(LinkedList<String> placeToGo, String yeni) {
		
		ListIterator<String> iterator = placeToGo.listIterator();
		
		while(iterator.hasNext()) {
			int compare = iterator.next().compareTo(yeni);// de�erleri kar��la�t�r�yoruz
			
			if(compare == 0) {
				System.out.println("Listenizde bu eleman var");
				
				return; //sadece metot bitsin diye g�nderdik
			}else if (compare < 0) {
				
				//yeni de�er iterator.next'^ten daha b�y�k . Direkt ��k�p di�er de�er var m� diye bak�yor
				//while a tekrar girip kontrol ediyor .
				
				
			}else if(compare > 0){
				
				//e�er de�er k���kse iterator'� geri al�yoruz ve de�eri oraya ekleyebiliyoruz
				
				iterator.previous();
				iterator.add(yeni);
				
				return;
				
			}
			
		}
		
		iterator.add(yeni);
	}

	public static void main(String[] args) {
		
		LinkedList<String> placeToGo = new LinkedList<String>();
		
		addWithOrder(placeToGo, "Postahane");
		addWithOrder(placeToGo, "Market");
		addWithOrder(placeToGo, "Ev");
		
		writeList(placeToGo);
		
		/*placeToGo.add("Postahane");
		placeToGo.add("Market");
		placeToGo.add("Okul");
		placeToGo.add("K�t�phane");
		placeToGo.add("Spor Salonu");
		placeToGo.add("Ev");
		
		writeList(placeToGo);
		System.out.println("************");
		
		placeToGo.add(4, "AVM");
		writeList(placeToGo);
		
		placeToGo.remove(2);
		
		System.out.println("************");
		writeList(placeToGo);*/
		
		
		
		

	}

}
