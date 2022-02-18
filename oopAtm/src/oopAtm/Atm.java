package oopAtm;

import java.util.Scanner;

public class Atm {
	
	public void calis(Hesap hesap) {
		
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankaya hoþgeldin");
		System.out.println("*****************");
		System.out.println("Kullanýcý giriþi");
		System.out.println("*****************");
		int girisHakki=3;
		while(true) {
			if(login.login(hesap)) {
				System.out.println("giriþ baþarýlý..");
				break;
			}else {
				System.out.println("giriþ baþarýsýz");
				girisHakki--;
				System.out.println("kalan hak " +girisHakki); 
			}
			if(girisHakki==0) {
				System.out.println("giriþ hakkýnýz bitti sonra tekrar deneyin");
				return;
			}
		}
		System.out.println("*******************");
		String islemler = "1.Bakiye Görüntüle\n"
						+"2.Para Yatýrma\n"
						+"3.Para Çekme\n"
						+"Çýkýþ için q'ya basýn";
		System.out.println(islemler);
		System.out.println("*******************");
		while(true) {
			System.out.println("iþlemi seçiniz");
			String islem = scanner.next();
			if(islem.equals("q")) {
				System.out.println("çýkýþ yapýlýyor");
				break;
				
			}else if (islem.equals("1")) {
				System.out.println(hesap.getBakiye());
			}else if(islem.equals("2")){
				System.out.println("yatýrmak istediðiniz tutar");
				int tutar = scanner.nextInt();
				hesap.paraYatýr(tutar);
				
			}else if(islem.equals("3")) {
				System.out.println("çekmek istediðiniz tutar");
				int tutar = scanner.nextInt();
				hesap.paraCek(tutar);
			}
				
			}
		
	}
		
	}


