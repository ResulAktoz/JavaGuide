package �al��anlar;

public class Worker {
	private int id;
	private String name;
	private String lastName;
	
	public Worker() {
		super();
	}

	public Worker(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	public void show�nformation() {
		System.out.println("�al��an Bilgileri....");
		System.out.println("Id " +id);
		System.out.println("Ad " +name);
		System.out.println("Soyad " +lastName);
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	

}
