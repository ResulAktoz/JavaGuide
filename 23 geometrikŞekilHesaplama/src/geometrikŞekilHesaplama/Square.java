package geometrik�ekilHesaplama;

public class Square extends Figure{

	private int lengthOfSide;
	
	public Square(String name, int lengthOfSide) {
		super(name);
		this.lengthOfSide= lengthOfSide;
		
	}

	@Override
	void calculateArea() {
		System.out.println(getName()+ " alan� " +Math.pow(lengthOfSide, 2)+ " d�r.");
		
	}

}
