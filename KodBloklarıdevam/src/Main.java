import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("i�lem numaras� giriniz: ");
		int islem = scanner.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("1.i�lem");
			break;
		case 2:
			System.out.println("2.i�lem");
			break;
		case 3:
			System.out.println("3.i�lem");
			break;
			default :
			System.out.println("ge�ersiz i�lem");
		
		}
		
	}

}
