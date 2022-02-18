
public class Manager extends Worker{
	private int personResponsible;
	
	public Manager(String name, int wage, String department, int personResponsible) {
		
		super(name, wage, department); // bunu yaptýðýmýz zaman direkt getname ile managerden çekebiliyoruz
		this.personResponsible = personResponsible;
		
	
	}
	
	public void makeRaise(int raiseAmount) {
		System.out.println("çalýþanlara " +raiseAmount+ " tl zam yapýldý");
	}
	
	public void showÝnformation() {
		super.showÝnformation();//alternatif yol
		/*System.out.println("isim " +getName());
		System.out.println("Maaþ " +getWage());
		System.out.println("Departman " +getDepartment());*/
		System.out.println("Sorumlu olunan kiþi sayýsý " +personResponsible); 
		
	}
	

}
