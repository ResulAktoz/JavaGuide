package Ýnheritance2;

public class Animal {
	
	private String name;
	private int weight;
	private int height;
	private int numberOfLeg;
	
	public Animal() {
		super();
		
	}

	public Animal(String name, int weight, int height, int numberOfLeg) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.numberOfLeg = numberOfLeg;
	}
	
		public void eatFood() {
			System.out.println("hayvan þu anda yemek yiyor ");
		}
		
		public void move(int speed) {
			System.out.println("hayvan " +speed+ " ile hareket ediyor");
		}
		public void showÝnformation() {
			System.out.println("adý " +name);
			System.out.println("Kilo  " +weight);
			System.out.println("Boy  " +height);
			System.out.println("ayak Sayýsý  " +numberOfLeg);
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getNumberOfLeg() {
		return numberOfLeg;
	}

	public void setNumberOfLeg(int numberOfLeg) {
		this.numberOfLeg = numberOfLeg;
	}
	
	
	
	

}
