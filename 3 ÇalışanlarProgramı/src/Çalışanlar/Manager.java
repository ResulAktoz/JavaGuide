package �al��anlar;

public class Manager extends Worker{
	
	private int personResponsible;
	
	public Manager(Worker worker, int personResponsible) { 
		
		super(worker.getId(),worker.getName(),worker.getLastName());
		this.personResponsible = personResponsible;
		
	}
	

	@Override
	public void show�nformation() {
		super.show�nformation();
		System.out.println(getName()+getLastName()+ "y�neticimiz. ");
		System.out.println("Y�neticinin sorumlu oldu�u ki�i say�s� " +personResponsible);
		
	}
	
	public void makeRaise(int raiseAmount) {
		System.out.println("�al��anlara" +raiseAmount+ " tl zam yap�yor");
		
		
	}
	
	
	

}
