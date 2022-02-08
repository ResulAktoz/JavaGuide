package atmProgramý;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bakiye = 1000;
		String islemler = "1. iþem : bakiye Öðrenme\n"
						 +"2. iþlem: Para Çekme\n"
						 +"3.iþlem : Para Yatýrma\n"
						 +"Çýkýþ için q'ya basýn";
		System.out.println("*****************");
		System.out.println("islemler");
		System.out.println("*****************");
		
		while(true) {
			
			System.out.println("islemi seciniz");
			String islem = scanner.next();
			if(islem.equals("q")) {
				System.out.println("programdan çýkýlýyor");
				break;
			}else if (islem.equals("1")) {
				System.out.println("bakiyeniz: " +bakiye);
			}else if (islem.equals("2")) {
				System.out.println("çekmek istediðiniz tutar: ");
				int tutar = scanner.nextInt(); // eðer nextIntten sonra kodunuzun baþka yerinde nextLine varsa bnunun altýna tekrar yazmak gerekir.
				//scanner.next(); hocanýn dediði patladý ?????
				if(bakiye-tutar<0) {
					System.out.println("yetersiz bakiye. Bakiyeniz: "+bakiye);
				}else {
					bakiye-= tutar;
					System.out.println("yeni bakiyeniz: " +bakiye);
				}
			}else if (islem.equals("3")) {
				System.out.println("yatýrmak istediðiniz tutarý giriniz: ");
				int yatýrýlan = scanner.nextInt();
				bakiye+=yatýrýlan;
				System.out.println("bakiyeniz: " +bakiye);
			}
			else {
				System.out.println("geçersiz iþlem");
			}
		}

	}

}
