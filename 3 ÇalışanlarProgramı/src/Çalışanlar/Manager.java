package Çalýþanlar;

public class Manager extends Worker{
	
	private int personResponsible;
	
	public Manager(Worker worker, int personResponsible) { 
		
		super(worker.getId(),worker.getName(),worker.getLastName());
		this.personResponsible = personResponsible;
		
	}
	

	@Override
	public void showÝnformation() {
		super.showÝnformation();
		System.out.println(getName()+getLastName()+ "yöneticimiz. ");
		System.out.println("Yöneticinin sorumlu olduðu kiþi sayýsý " +personResponsible);
		
	}
	
	public void makeRaise(int raiseAmount) {
		System.out.println("Çalýþanlara" +raiseAmount+ " tl zam yapýyor");
		
		
	}
	
	
	

}
