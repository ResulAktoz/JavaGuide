package Ýnheritance2;

public class Dog extends Animal{
	
	private int numberOfTeeth;
	
	public Dog(Animal animal, int numberOfTeeth) {
		super(animal.getName(),animal.getWeight(),animal.getHeight(),animal.getNumberOfLeg());
		this.numberOfTeeth = numberOfTeeth;
		
		
	}
	
	public void showÝnformation() {
		super.showÝnformation();
		System.out.println("number of teeth " +numberOfTeeth);
	}
	
	public void move(int speed) {
		System.out.println("köpek " +speed+ " ile hareket ediyor");
	}
	
	public void run(int speed) {
		System.out.println("köpek koþuyor " );
		//super.move(speed); 
		move(speed);
	}
	
	// override etmediðimizde üst sýnýftakileri çaðýrýyor ama override edersek direkt bu sýnýf için tanýmladýðýmýzý alýr bu sayede kodu deðiþtirmek zorunda kalmayýz
	
	
	
	

}
