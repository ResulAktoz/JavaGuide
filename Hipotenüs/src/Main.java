import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("dikliðin sað kenarýnýn deðerini girin ");
		
		int a = scanner.nextInt();
		
		System.out.println("dikliðin sol kenarýnýn deðerini girin ");
		 int b = scanner.nextInt();
		 
		double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.print("Hipotenüs= " +c);

	}

}
