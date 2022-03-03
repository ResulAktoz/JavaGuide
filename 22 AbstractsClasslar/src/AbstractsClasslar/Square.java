package AbstractsClasslar;

public class Square extends Sekil{

	private int lengthOfSide;
	public Square(String name, int lengthOfSide) {
		super(name);
		this.lengthOfSide = lengthOfSide;
		
	}

	@Override
	void calculateArea() {
		System.out.println(getName()+ "alan�: " +Math.pow(lengthOfSide, 2)+ " d�r.");
		
	}
	
	public void calculatePerimeter() {
		System.out.println(getName()+ " �evresi " +4*lengthOfSide+ "d�r");
	}

}
