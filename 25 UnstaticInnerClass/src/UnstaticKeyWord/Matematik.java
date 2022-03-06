package UnstaticKeyWord;

import java.util.Scanner;

public class Matematik {
	
	private double PI = Math.PI; 
	
	public class Factorial{
		
		public void faktöriyel(int sayi) {
			//Scanner scanner = new Scanner(System.in);
			//System.out.println("Bir sayý giriniz.");
			//int sayi= scanner.nextInt();
			int fakt=1;
			 for(int i=1; i<=sayi;i++) {
				 
				 fakt *= i;
				 
			 }
			 System.out.println(fakt);
		}
		
		
		
	}
		public class Asal{
		
			public boolean asalMý(int sayi) {
			
				int i=2 ;
				while(i<sayi) {
				if(sayi%i == 0) {
					System.out.println(sayi+ " sayýsý asal deðil");
					return false;
				}
			
				i++;
				
			}
				System.out.println(i+ " sayýsý asal");
			return true;
		}
	}
	
		public class Alan{
			
			public void daireAlan(int r) {
				System.out.println("Alan = " +(Math.pow(r, 2)*PI));
			}
		}

}
