package �ark�c�Projesi;

import java.util.ArrayList;

public class Singers {
	
	private ArrayList<String> singerList = new ArrayList<String>();
	
	
	public void writeSingers() {
		System.out.println("�ark�c� Listesinde " +singerList.size()+ " kadar �ark�c� var.");
		
		for(int i = 0; i<singerList.size(); i++) {
			System.out.println((i+1)+ ". �ark�c�:  " +singerList.get(i));
			
		}
	}
	
	public void addSinger(String name) {
		singerList.add(name);
		System.out.println("�ark�c� Listesi G�ncellendi...");
		
	}
	
	public void updateSinger(String newName, int position) {
		
		singerList.set(position, newName);
		System.out.println("�ark�c� Listesi g�ncellendi");
	}
	
	public void removeSinger(int position) {
		
		String name = singerList.get(position);
		
		singerList.remove(position);
		
		System.out.println(name+ " isimli �ark�c� listeden silindi...");
	}
	
	public void searchSinger(String singerName) {
		
		int position = singerList.indexOf(singerName);//g�nderilen �ark�c�n�n isminden hangi indexte oldu�unu bulduruyoruz
		//ancak bu g�nderilen ismin listede olmama �ans� da var. Bu y�zden kod devam edecek.
		
		if(position>= 0) {
			System.out.println("�ark�c� bulundu..");
			System.out.println(singerName+ " isimli �ark�c� " +(position+1)+ ". pozisyonda"); //0dan ba�lad��� i�in +1 olarak ald�k
		}else {
			System.out.println("�ark�c� bulunamad�.");
		}
		
		
		
	}
	

}
