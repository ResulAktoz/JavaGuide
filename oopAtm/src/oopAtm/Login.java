package oopAtm;

import java.util.Scanner;

public class Login {
	public boolean login(Hesap hesap) {
		
		Scanner scanner = new Scanner(System.in);
		String kullanıcıAdı;
		String parola;
		
		System.out.println("kullanıcı adı: ");
		kullanıcıAdı= scanner.next();
		
		System.out.println("parola: ");
		parola = scanner.next();
		
		if(hesap.getKullanıcıAdı().equals(kullanıcıAdı) && hesap.getParola().equals(parola)) {
			
			return true;
		}else {
			return false;
		}
		
		
	}

}
