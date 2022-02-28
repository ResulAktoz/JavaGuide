package LinkedList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Php");
		languages.add("Pyhton");
		languages.add("Kotlin");
		languages.add("C#");
		
//		for(int i=0; i<languages.size(); i++) {
//			System.out.println(languages.get(i));
//		}
		System.out.println("**************");
		
		for (String S : languages) { //foreach
			System.out.println(S);
			
		}
		System.out.println("**********");
		
		languages.add(1, "C++");
		
		for (String S : languages) { //foreach
			System.out.println(S);
			
		}
		

	}

}
