package oopAtm;

import java.util.Scanner;

public class Login {
	public boolean login(Hesap hesap) {
		
		Scanner scanner = new Scanner(System.in);
		String kullan�c�Ad�;
		String parola;
		
		System.out.println("kullan�c� ad�: ");
		kullan�c�Ad�= scanner.next();
		
		System.out.println("parola: ");
		parola = scanner.next();
		
		if(hesap.getKullan�c�Ad�().equals(kullan�c�Ad�) && hesap.getParola().equals(parola)) {
			
			return true;
		}else {
			return false;
		}
		
		
	}

}
