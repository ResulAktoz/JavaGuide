package �al��anlar;

public class Developer extends Worker{
	private String developingArea;
	
	public Developer(int Id, String name, String lastName, String developingArea) {
		//super(worker.getId(),worker.getName(),worker.getLastName());
		super(Id, name, lastName);
		this.developingArea = developingArea;
		
	}
	public void format(String operatingSystem) {
		System.out.println(getName() + " " +operatingSystem+ " ni y�kl�yor");
		
	}
	@Override
	public void show�nformation() {
		super.show�nformation();//sa� t�k source override k�sm�ndan.
		System.out.println("Yaz�l�mc�n�n Alan�: " +developingArea);
		
	}
	 
	
	

}
