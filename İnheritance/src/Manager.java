
public class Manager extends Worker{
	private int personResponsible;
	
	public Manager(String name, int wage, String department, int personResponsible) {
		
		super(name, wage, department); // bunu yapt���m�z zaman direkt getname ile managerden �ekebiliyoruz
		this.personResponsible = personResponsible;
		
	
	}
	
	public void makeRaise(int raiseAmount) {
		System.out.println("�al��anlara " +raiseAmount+ " tl zam yap�ld�");
	}
	
	public void show�nformation() {
		super.show�nformation();//alternatif yol
		/*System.out.println("isim " +getName());
		System.out.println("Maa� " +getWage());
		System.out.println("Departman " +getDepartment());*/
		System.out.println("Sorumlu olunan ki�i say�s� " +personResponsible); 
		
	}
	

}
