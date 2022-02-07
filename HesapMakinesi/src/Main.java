import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.sayiyi giriniz");
		double a = scanner.nextDouble();
		System.out.print("2.sayiyi giriniz");
		double b = scanner.nextDouble();
		double sonuc=0;
		
		System.out.println("yapmak istediðiniz islem türünü giriniz");//burada liste þeklinmde 1 2 3 4 diye iþlemleri tanýtýp case kýsmýnda 1 2 3 4 diye tanýmlayabiliriz.
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
				System.out.println("geçersiz iþlem");
			}
		//System.out.println(+a+ islem +b+ "=" +sonuc  );

	}

}
