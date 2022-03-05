package geometrikÞekilHesaplama;

public class Circle extends Figure{

	private int r;
	
	public Circle(String name, int r) {
		super(name);
		this.r=r;
		
	}

	@Override
	void calculateArea() {
		
		System.out.println(getName()+ " alaný " +(Math.PI*Math.pow(r, 2))+ " dýr.");
		
	}

}
