import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ya��n�z� girin");
		
		int yas = scanner.nextInt();
		
		if(yas<18) {
			System.out.println("mekana giremezsiniz");
			
		}
		else if(yas==18) {
			System.out.println("s�n�rdas�n�z");
		}
		else {
			System.out.println("mekana girebilirsiniz");
		}
		
		
	}

}
