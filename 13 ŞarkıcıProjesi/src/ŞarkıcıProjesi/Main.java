package �ark�c�Projesi;

import java.util.Scanner;

public class Main {
	
	private static Singers singers = new Singers();	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void writeProcces() {
		
		System.out.println("\t 0-��lemleri G�r�nt�le");
		System.out.println("\t 1-�ark�c�lar� G�r�nt�le");
		System.out.println("\t 2-�ark�c� Ekle");
		System.out.println("\t 3-�ark�c� G�ncelle");
		System.out.println("\t 4-�ark�c� Sil");
		System.out.println("\t 5-�ark�c� Ara");
		System.out.println("\t 6-Uygulamadan ��k");
	}
	
	public static void showSinger() {
		singers.writeSingers();
	}
	public static void addSinger() {
		System.out.print("Eklemek �stedi�iniz �ark�c�n�n �smi: ");
		String name= scanner.next();
		singers.addSinger(name);
		
	}
	
	public static void updateSinger() {
		System.out.print("Eklemek �stedi�iniz �ark�c�n�n �smini Giriniz: ");
		String name= scanner.next();
		System.out.print("Eklemek istedi�iniz s�ray� giriniz.(1,2,3): ");
		int position = scanner.nextInt();
		
		
		singers.updateSinger(name, position-1);
	}
	public static void removeSinger() {
		System.out.print("Silmek istedi�iniz �ark�c�n�n S�ras�n� Giriniz (1,2,3): ");
		int position = scanner.nextInt();
		int number = position-1;
		singers.removeSinger(number);
	}
	
	public static void searchSinger() {
		System.out.print("Aramak istedi�iniz �ark�c�n�n Ad�n� giriniz: ");
		String name= scanner.next();
		singers.searchSinger(name);
	}

	public static void main(String[] args) {
		
		System.out.println("\t �ark�c� uygulamas�na ho�geldiniz..");
		
		writeProcces();
		
		boolean out = false;
		int procces;
		
		while(!out) { //not out dedi�imiz i�in true oluyor. Sonsuz d�ng�ye girecez ancak 6 de�eri bast���m�z zaman true olacak yani d�ng�den ��kacaz
			System.out.println("Bir ��lem Se�iniz");
			
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
				System.out.println("Uygulamadan ��k�l�yor...");
				break;
			}
			
			
		}
		
	}
	

}
