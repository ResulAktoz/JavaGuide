package geometrik�ekilHesaplama;

public abstract class Figure {
	
	private String name;

	public Figure(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void calculateArea();
	
	
	

}
