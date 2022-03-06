package StaticInnerClass;

public class Mathematic {
	
	private double PI= Math.PI; //BBurayý static yaparsak çýktý kýsmýnda mathPI yerine direkt PI yazabiliriz.
	
	public static class Area{
		
		public static void circleArea(int r) {
			System.out.println("Alan= " +(Math.pow(r, 2)*Math.PI));
		}
		
	}

}
