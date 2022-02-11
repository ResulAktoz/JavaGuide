
public class Main {
	public static void selamlama (String isim) {
		System.out.println("selamlar " +isim);
	}
	
	public static void toplama(int a ,int b, int c) {
		int toplam = a+b+c;
		//System.out.println("toplam = " +(a+b+c));
		System.out.println("toplam = " +toplam);
	}

	public static void main(String[] args) {
		selamlama("Resul");
		toplama(3, 4, 5);

	}

}
