package Çalışanlar;

public class Manager extends Worker{
	
	private int personResponsible;
	
	public Manager(Worker worker, int personResponsible) { 
		
		super(worker.getId(),worker.getName(),worker.getLastName());
		this.personResponsible = personResponsible;
		
	}
	

	@Override
	public void showİnformation() {
		super.showİnformation();
		System.out.println(getName()+getLastName()+ "yöneticimiz. ");
		System.out.println("Yöneticinin sorumlu olduğu kişi sayısı " +personResponsible);
		
	}
	
	public void makeRaise(int raiseAmount) {
		System.out.println("Çalışanlara" +raiseAmount+ " tl zam yapıyor");
		
		
	}
	
	
	

}
