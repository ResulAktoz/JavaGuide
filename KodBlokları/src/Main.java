import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("yaşınızı girin");
		
		int yas = scanner.nextInt();
		
		if(yas<18) {
			System.out.println("mekana giremezsiniz");
			
		}
		else if(yas==18) {
			System.out.println("sınırdasınız");
		}
		else {
			System.out.println("mekana girebilirsiniz");
		}
		
		
	}

}
