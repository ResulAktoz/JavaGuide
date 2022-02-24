package ArrayCopyveSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int[] fillArray(int sayi) {
		Scanner scanner = new Scanner(System.in);
		int[] cikti = new int[sayi];
		
		for(int i=0; i<sayi;i++) {
			cikti[i] = scanner.nextInt();
			
		}
		return cikti;
		
		
		
	}
	
	public static void writeArray(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println("Element" +(i+1)+ " : " +array[i]);
		}
	}
	public static void arraySort(int[] array) {
		// Arrays Sýnýfý= arrayler üstünde iþlem yapabildiðimiz bir sýnýf.
		
		Arrays.sort(array);
		writeArray(array);
		
	}

	public static void main(String[] args) {
		
		/*int[] a= fillArray(5);
		
		
		//writeArray(a);
		
		arraySort(a); //sýralayýp çýktý veriyor */
		
		int[] a1= {1,2,3,4,5,6};
		int[] a2= {1,2,3,4,5,6};
		// ikisi farklý yerlerde tutuyor deðerleri
		//bu nedenle eþitlik kýsmýnda eþit olmadýklarýný görürüz.
		
		if(a1==a2) {
			System.out.println("Eþitler.");
		}else {
			System.out.println("Eþit deðiller.");
		}
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("Eþitler.");
		}else {
			System.out.println("Eþit deðiller.");
		}
		
		//ilk iften eþit deðiller döndü ancak ikincisinden eþitler geldi.
		

	}

}
