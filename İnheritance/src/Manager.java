
public class Manager extends Worker{
	private int personResponsible;
	
	public Manager(String name, int wage, String department, int personResponsible) {
		
		super(name, wage, department); // bunu yaptığımız zaman direkt getname ile managerden çekebiliyoruz
		this.personResponsible = personResponsible;
		
	
	}
	
	public void makeRaise(int raiseAmount) {
		System.out.println("çalışanlara " +raiseAmount+ " tl zam yapıldı");
	}
	
	public void showİnformation() {
		super.showİnformation();//alternatif yol
		/*System.out.println("isim " +getName());
		System.out.println("Maaş " +getWage());
		System.out.println("Departman " +getDepartment());*/
		System.out.println("Sorumlu olunan kişi sayısı " +personResponsible); 
		
	}
	

}
