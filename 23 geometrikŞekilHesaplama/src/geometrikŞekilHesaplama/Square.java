package geometrikÞekilHesaplama;

public class Square extends Figure{

	private int lengthOfSide;
	
	public Square(String name, int lengthOfSide) {
		super(name);
		this.lengthOfSide= lengthOfSide;
		
	}

	@Override
	void calculateArea() {
		System.out.println(getName()+ " alaný " +Math.pow(lengthOfSide, 2)+ " dýr.");
		
	}

}
