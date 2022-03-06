package LocalInnerClass;

public class Main {

	public static void main(String[] args) {
		
		class Area{
			
			public void circleArea(int r) {
				System.out.println("Dairenin Alaný= " +(Math.pow(r, 2)*Math.PI));
			}
		}
		
		Area area= new Area();
		Area area1 = new Area();
		Area area2 = new Area();
		
		area.circleArea(5);
		area.circleArea(3);
		area.circleArea(2);
		

	}
//	 public static void deneme() {
//		 
//	  Area area = new Area();	 //if you  open a new method you cant reach the other class which created in different method.
//		 
//	 }
	
	

}
