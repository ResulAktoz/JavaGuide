package UnstaticKeyWord;

import java.util.Scanner;

public class Matematik {
	
	private double PI = Math.PI; 
	
	public class Factorial{
		
		public void fakt�riyel(int sayi) {
			//Scanner scanner = new Scanner(System.in);
			//System.out.println("Bir say� giriniz.");
			//int sayi= scanner.nextInt();
			int fakt=1;
			 for(int i=1; i<=sayi;i++) {
				 
				 fakt *= i;
				 
			 }
			 System.out.println(fakt);
		}
		
		
		
	}
		public class Asal{
		
			public boolean asalM�(int sayi) {
			
				int i=2 ;
				while(i<sayi) {
				if(sayi%i == 0) {
					System.out.println(sayi+ " say�s� asal de�il");
					return false;
				}
			
				i++;
				
			}
				System.out.println(i+ " say�s� asal");
			return true;
		}
	}
	
		public class Alan{
			
			public void daireAlan(int r) {
				System.out.println("Alan = " +(Math.pow(r, 2)*PI));
			}
		}

}
