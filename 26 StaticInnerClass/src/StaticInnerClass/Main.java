package StaticInnerClass;

public class Main {

	public static void main(String[] args) {
		
		 Mathematic.Area area = new Mathematic.Area();
		
		area.circleArea(5);
		Mathematic.Area.circleArea(5);  //void  methodu static olunca direkt böyle kullanabiliyoruz.
	}

}
