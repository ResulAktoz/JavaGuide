package Composition;

public class Resolution {
	
	private int weight;
	private int height;
	
	public Resolution() {
		super();
	}

	public Resolution(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
		//System.out.println("Ekran Çözünürlüðü= " +height+ " x " +weight);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

	
}
