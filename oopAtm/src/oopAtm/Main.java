package oopAtm;

public class Main {

	public static void main(String[] args) {
		Atm atm = new Atm();
		Hesap hesap = new Hesap("resul", "asd", 1000);
		
		atm.calis(hesap);
		System.out.println("programdan ��k�l�yor");
	}

}
