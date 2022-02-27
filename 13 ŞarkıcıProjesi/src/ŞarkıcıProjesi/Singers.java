package ÞarkýcýProjesi;

import java.util.ArrayList;

public class Singers {
	
	private ArrayList<String> singerList = new ArrayList<String>();
	
	
	public void writeSingers() {
		System.out.println("Þarkýcý Listesinde " +singerList.size()+ " kadar þarkýcý var.");
		
		for(int i = 0; i<singerList.size(); i++) {
			System.out.println((i+1)+ ". Þarkýcý:  " +singerList.get(i));
			
		}
	}
	
	public void addSinger(String name) {
		singerList.add(name);
		System.out.println("Þarkýcý Listesi Güncellendi...");
		
	}
	
	public void updateSinger(String newName, int position) {
		
		singerList.set(position, newName);
		System.out.println("Þarkýcý Listesi güncellendi");
	}
	
	public void removeSinger(int position) {
		
		String name = singerList.get(position);
		
		singerList.remove(position);
		
		System.out.println(name+ " isimli þarkýcý listeden silindi...");
	}
	
	public void searchSinger(String singerName) {
		
		int position = singerList.indexOf(singerName);//gönderilen þarkýcýnýn isminden hangi indexte olduðunu bulduruyoruz
		//ancak bu gönderilen ismin listede olmama þansý da var. Bu yüzden kod devam edecek.
		
		if(position>= 0) {
			System.out.println("Þarkýcý bulundu..");
			System.out.println(singerName+ " isimli þarkýcý " +(position+1)+ ". pozisyonda"); //0dan baþladýðý için +1 olarak aldýk
		}else {
			System.out.println("Þarkýcý bulunamadý.");
		}
		
		
		
	}
	

}
