import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.sayiyi giriniz");
		double a = scanner.nextDouble();
		System.out.print("2.sayiyi giriniz");
		double b = scanner.nextDouble();
		double sonuc=0;
		
		System.out.println("yapmak istedi�iniz islem t�r�n� giriniz");//burada liste �eklinmde 1 2 3 4 diye i�lemleri tan�t�p case k�sm�nda 1 2 3 4 diye tan�mlayabiliriz.
		String islem = scanner.next();
		
		switch(islem) {
		case "*":
			sonuc = a*b;
			System.out.println(+a+ islem +b+ "=" +sonuc  );
			break;
		case "/":
			sonuc = a/b;
			System.out.println(+a+ islem +b+ "=" +sonuc  );
			break;
		case "+":
			sonuc= a+b;
			System.out.println(+a+ islem +b+ "=" +sonuc  );
			break;
		case "-":
			sonuc= a-b;
			System.out.println(+a+ islem +b+ "=" +sonuc  );
			break;
			
			default:
				System.out.println("ge�ersiz i�lem");
			}
		//System.out.println(+a+ islem +b+ "=" +sonuc  );

	}

}
