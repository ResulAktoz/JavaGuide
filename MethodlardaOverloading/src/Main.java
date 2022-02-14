
public class Main {
	
//	public static void toplama(String a, String b) {
//		System.out.println(a+ " " +b );
//	}
//	
//	public static void toplama(int a, int b) {
//		System.out.println("toplamlar " +(a+b));
//	}
//	
//	public static void toplama(int a, int b, int c) {
//		System.out.println("toplamlar " +(a+b+c));
//	}
	
	public static void skorhesapla(String isim, int puan) {
		System.out.println(isim+ " adlý oyuncunun " +puan+ " puaný var");
	}
	public static void skorhesapla(int puan) {
		System.out.println("isimsiz oyuncunun " +puan+ " puaný var");
	}
	public static void skorhesapla(String isim) {
		System.out.println(isim+ " adlý oyuncunun puaný yok");
	}
	public static void main(String[] args) {
//		toplama(3, 4, 4);
//		toplama(2, 5);
//		toplama("Resul", "Aktoz");
		skorhesapla("Resul", 150);
		skorhesapla("Ertuðrul");
		skorhesapla(145);
		
//		
		

	}

}
