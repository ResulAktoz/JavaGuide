package Çalýþanlar;

public class Developer extends Worker{
	private String developingArea;
	
	public Developer(int Id, String name, String lastName, String developingArea) {
		//super(worker.getId(),worker.getName(),worker.getLastName());
		super(Id, name, lastName);
		this.developingArea = developingArea;
		
	}
	public void format(String operatingSystem) {
		System.out.println(getName() + " " +operatingSystem+ " ni yüklüyor");
		
	}
	@Override
	public void showÝnformation() {
		super.showÝnformation();//sað týk source override kýsmýndan.
		System.out.println("Yazýlýmcýnýn Alaný: " +developingArea);
		
	}
	 
	
	

}
