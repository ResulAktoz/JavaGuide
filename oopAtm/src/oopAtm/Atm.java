package oopAtm;

import java.util.Scanner;

public class Atm {
	
	public void calis(Hesap hesap) {
		
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankaya ho�geldin");
		System.out.println("*****************");
		System.out.println("Kullan�c� giri�i");
		System.out.println("*****************");
		int girisHakki=3;
		while(true) {
			if(login.login(hesap)) {
				System.out.println("giri� ba�ar�l�..");
				break;
			}else {
				System.out.println("giri� ba�ar�s�z");
				girisHakki--;
				System.out.println("kalan hak " +girisHakki); 
			}
			if(girisHakki==0) {
				System.out.println("giri� hakk�n�z bitti sonra tekrar deneyin");
				return;
			}
		}
		System.out.println("*******************");
		String islemler = "1.Bakiye G�r�nt�le\n"
						+"2.Para Yat�rma\n"
						+"3.Para �ekme\n"
						+"��k�� i�in q'ya bas�n";
		System.out.println(islemler);
		System.out.println("*******************");
		while(true) {
			System.out.println("i�lemi se�iniz");
			String islem = scanner.next();
			if(islem.equals("q")) {
				System.out.println("��k�� yap�l�yor");
				break;
				
			}else if (islem.equals("1")) {
				System.out.println(hesap.getBakiye());
			}else if(islem.equals("2")){
				System.out.println("yat�rmak istedi�iniz tutar");
				int tutar = scanner.nextInt();
				hesap.paraYat�r(tutar);
				
			}else if(islem.equals("3")) {
				System.out.println("�ekmek istedi�iniz tutar");
				int tutar = scanner.nextInt();
				hesap.paraCek(tutar);
			}
				
			}
		
	}
		
	}


