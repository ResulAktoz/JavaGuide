package StaticInnerClass;

public class Mathematic {
	
	private double PI= Math.PI; //BBuray� static yaparsak ��kt� k�sm�nda mathPI yerine direkt PI yazabiliriz.
	
	public static class Area{
		
		public static void circleArea(int r) {
			System.out.println("Alan= " +(Math.pow(r, 2)*Math.PI));
		}
		
	}

}
