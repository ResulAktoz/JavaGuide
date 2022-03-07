package MiniProject;

public class Problem {
	
	public static class Mathematic{
		
		public static void circleArea(int r) {
			System.out.println("Alan = " +(Math.pow(r, 2)*Math.PI));
			
		}
		
		public static void triangePerimeter(int a, int b, int c) {
			System.out.println("Üçgenin Çevresi: " +(a+b+c));
		}
		
	}
	
	public static class Physics{
		
		public static void innerProduct(Vect vect1, Vect vect2) {
			int innerproduct = vect1.getI()*vect2.getI() + vect1.getJ()*vect2.getJ() + vect1.getK()*vect2.getK();
			System.out.println(vect1.getName()+ " ile " +vect2.getName()+ "ün iç çarpýmý = " +innerproduct);
			
			
		}
		
	}

}
