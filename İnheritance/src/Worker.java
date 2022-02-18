
public class Worker { //superclass //baseclass temel ana class //subclass yani alt s�n�f
	
	private String name;
	private int wage;
	private String department;
	
	public Worker() { //extends yapabilmek i�in bunu tan�mlamak gerekiyor !!!!
		super();
	}

	public Worker(String name, int wage, String department) {
		super();
		this.name = name;
		this.wage = wage;
		this.department = department;
	}
	
	public void work () {
		
		System.out.println("Worker work...");
	}
	
	public void show�nformation() {
		System.out.println("isim " +name);
		System.out.println("Maa� " +wage);
		System.out.println("Departman " +department);
	}
	
	public void changeDepartment(String newDepartment) {
		System.out.println("Department chancing");
		this.department = newDepartment;
		
		System.out.println("Yeni Departman: " +this.department);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
