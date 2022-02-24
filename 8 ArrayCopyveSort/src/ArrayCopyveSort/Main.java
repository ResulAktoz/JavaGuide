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
		// Arrays S�n�f�= arrayler �st�nde i�lem yapabildi�imiz bir s�n�f.
		
		Arrays.sort(array);
		writeArray(array);
		
	}

	public static void main(String[] args) {
		
		/*int[] a= fillArray(5);
		
		
		//writeArray(a);
		
		arraySort(a); //s�ralay�p ��kt� veriyor */
		
		int[] a1= {1,2,3,4,5,6};
		int[] a2= {1,2,3,4,5,6};
		// ikisi farkl� yerlerde tutuyor de�erleri
		//bu nedenle e�itlik k�sm�nda e�it olmad�klar�n� g�r�r�z.
		
		if(a1==a2) {
			System.out.println("E�itler.");
		}else {
			System.out.println("E�it de�iller.");
		}
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("E�itler.");
		}else {
			System.out.println("E�it de�iller.");
		}
		
		//ilk iften e�it de�iller d�nd� ancak ikincisinden e�itler geldi.
		

	}

}
