package atmProgram�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bakiye = 1000;
		String islemler = "1. i�em : bakiye ��renme\n"
						 +"2. i�lem: Para �ekme\n"
						 +"3.i�lem : Para Yat�rma\n"
						 +"��k�� i�in q'ya bas�n";
		System.out.println("*****************");
		System.out.println("islemler");
		System.out.println("*****************");
		
		while(true) {
			
			System.out.println("islemi seciniz");
			String islem = scanner.next();
			if(islem.equals("q")) {
				System.out.println("programdan ��k�l�yor");
				break;
			}else if (islem.equals("1")) {
				System.out.println("bakiyeniz: " +bakiye);
			}else if (islem.equals("2")) {
				System.out.println("�ekmek istedi�iniz tutar: ");
				int tutar = scanner.nextInt(); // e�er nextIntten sonra kodunuzun ba�ka yerinde nextLine varsa bnunun alt�na tekrar yazmak gerekir.
				//scanner.next(); hocan�n dedi�i patlad� ?????
				if(bakiye-tutar<0) {
					System.out.println("yetersiz bakiye. Bakiyeniz: "+bakiye);
				}else {
					bakiye-= tutar;
					System.out.println("yeni bakiyeniz: " +bakiye);
				}
			}else if (islem.equals("3")) {
				System.out.println("yat�rmak istedi�iniz tutar� giriniz: ");
				int yat�r�lan = scanner.nextInt();
				bakiye+=yat�r�lan;
				System.out.println("bakiyeniz: " +bakiye);
			}
			else {
				System.out.println("ge�ersiz i�lem");
			}
		}

	}

}
