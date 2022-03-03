package AbstractsClasslar;

public abstract class Sekil {
	
	private String name;

	public Sekil(String name) {
		super();
		this.name = name;
	}
	
	public void tellName() {
		System.out.println("Bu obje " +name+ " objesidir");
	}
	
	abstract void calculateArea();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
