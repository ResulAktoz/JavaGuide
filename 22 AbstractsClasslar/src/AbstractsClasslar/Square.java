package AbstractsClasslar;

public class Square extends Sekil{

	private int lengthOfSide;
	public Square(String name, int lengthOfSide) {
		super(name);
		this.lengthOfSide = lengthOfSide;
		
	}

	@Override
	void calculateArea() {
		System.out.println(getName()+ "alaný: " +Math.pow(lengthOfSide, 2)+ " dýr.");
		
	}
	
	public void calculatePerimeter() {
		System.out.println(getName()+ " çevresi " +4*lengthOfSide+ "dýr");
	}

}
