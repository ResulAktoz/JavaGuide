package ArrayList;

import java.util.ArrayList;

public class Main {
	
	public static void write(ArrayList<String> arraylist) {
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println("Element " +(i+1)+ " : " +arraylist.get(i));
			
		}
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> arrayList= new ArrayList<String>();
		
		arrayList.add("Resul");
		arrayList.add("Ertu�rul");
		arrayList.add("Aktoz");
		arrayList.add("Resul");
		//arrayList.remove(1);
		//arrayList.remove("Ertu�rul"); bu da ayn� i�levde �st sat�rla.
		
		/*System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		
		System.out.println(arrayList.size())*/
		
//		System.out.println(arrayList.indexOf("Resul")); // bir Resul daha olsa yine 0 g�sterirdi indexini.
//		System.out.println(arrayList.lastIndexOf("Resul"));
//		for(String a: arrayList) {
//			System.out.println(a);
//		}
		
		
		/*System.out.println("**************");
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}*/
		
		
		/*System.out.println("*************");
		arrayList.set(3, "Sinem");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}*/
		
		write(arrayList);
		
	}

}
