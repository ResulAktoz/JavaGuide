
public class Main {

	public static void main(String[] args) {
		String [] array= {"Elma","Armut","Kiraz"};
		//for(int i =0;i<array.length;i++) {
			//System.out.println(array[i]);
		//}
		int[] array2= {1,2,3,4,5,6,7};
		Deneme[] array3 = {new Deneme ("Resul"), new Deneme("Aktoz")};
		for(Deneme b : array3) {
			b.write();
		}
		
		for(String a : array) {
			System.out.println(a);
		}
		
		
		for(int i: array2) {
			System.out.println(i);
		}

	}

}
