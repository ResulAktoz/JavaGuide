import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilonuzu Giriniz: ");
		double kilo= scanner.nextDouble();
		
		System.out.print("boyunuzu giriniz(�rn 1,76): ");
		double boy= scanner.nextDouble();
		double indeks = kilo/(Math.pow(boy, 2));
		
		if(indeks<=18.5) {
			System.out.println("zay�fs�n�z");
		}
		else if(indeks<=25) { //(indeks >=18.5 && indeks<25 diye de tan�mlanabilir
			System.out.println("normal indekse sahipsiniz");
		}
		else if(indeks<=30) {
			System.out.println("�ndeksiniz y�ksek,kilolu");
		}
		else {
			System.out.println("obez");
		}
		
	}

}
