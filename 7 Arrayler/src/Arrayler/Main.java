package Arrayler;

import java.util.Scanner;

public class Main {
	
	public static void writeArray(int [] array) {
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Element " +(i+1)+ " : " +array[i]);
			
		}
		
	}
	
	public static double findAverage(int[] array) {
		
		int result=0;
		for(int i = 0;i<array.length;i++) {
			result += array[i];
			
			
		}
		return (double)result/array.length; //eğer double yazmazsak ondalıklı kısmı saymadan sonuç veriyor.
	}

	public static void main(String[] args) {
		//int[] a = new int[10]; // int array cinsinden bir referans aldık
		
//		a[5] = 32;
//		a[9] = 50;
// 		double[] b;
		
		/*int[] a = {30,40,50,60,70};
		
		System.out.println(a[0]);
		
		int[] a = new int[5];
		for(int i=0; i<5;i++) {
			a[i] = i*4+2;*/
		int[] a = new int[5];
			
		/*Scanner scanner = new Scanner(System.in);
		for(int i=0 ; i<5 ; i++) {
			
			a[i]= scanner.nextInt();
		
					
		
		}*/
		
		int[] b= {10,24,30,40,50};
		
		writeArray(b);
		System.out.println("Ortalama: " +findAverage(b));
		
		//System.out.println("Arrayin uzunluğu " +b.length);
		
		/*System.out.println("******************");
		for(int i=0; i<5;i++) {
		
		System.out.println(a[i]);
		
		
		
	}*/
	}		

}
