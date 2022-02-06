import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("iþlem numarasý giriniz: ");
		int islem = scanner.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("1.iþlem");
			break;
		case 2:
			System.out.println("2.iþlem");
			break;
		case 3:
			System.out.println("3.iþlem");
			break;
			default :
			System.out.println("geçersiz iþlem");
		
		}
		
	}

}
