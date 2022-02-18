package oopAtm;

import java.util.Scanner;

public class Login {
	public boolean login(Hesap hesap) {
		
		Scanner scanner = new Scanner(System.in);
		String kullanýcýAdý;
		String parola;
		
		System.out.println("kullanýcý adý: ");
		kullanýcýAdý= scanner.next();
		
		System.out.println("parola: ");
		parola = scanner.next();
		
		if(hesap.getKullanýcýAdý().equals(kullanýcýAdý) && hesap.getParola().equals(parola)) {
			
			return true;
		}else {
			return false;
		}
		
		
	}

}
