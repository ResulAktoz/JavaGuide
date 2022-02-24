import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//int[] array= {1,2,3,4,5,6};
		
		//int[][] array1= new int[2][2];
		
		/*array1[0][0] = 10;
		array1[0][1]=20;
		array1[1][0]=30;
		array1[1][1]=40;*/
		
		//int[][]array2 ={{10,20},{30,40}};
		
		//System.out.println(array2[0][1]);
		int[][] array1= new int[2][2];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			for(int j=0; j<2;j++) {
				
				//System.out.println("i= " +i+ "j= " +j);0 0 0 1 1 0 1 1 şeklinde çıktı veriyor
				array1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("****************");
		
		for(int i=0;i<2;i++) {
			for(int j=0; j<2;j++) {
				
				//System.out.println("i= " +i+ "j= " +j);0 0 0 1 1 0 1 1 şeklinde çıktı veriyor
				System.out.print(array1[i][j]+ " ");
			}
			System.out.println("");
		}
	}

}
