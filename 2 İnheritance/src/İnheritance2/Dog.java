package �nheritance2;

public class Dog extends Animal{
	
	private int numberOfTeeth;
	
	public Dog(Animal animal, int numberOfTeeth) {
		super(animal.getName(),animal.getWeight(),animal.getHeight(),animal.getNumberOfLeg());
		this.numberOfTeeth = numberOfTeeth;
		
		
	}
	
	public void show�nformation() {
		super.show�nformation();
		System.out.println("number of teeth " +numberOfTeeth);
	}
	
	public void move(int speed) {
		System.out.println("k�pek " +speed+ " ile hareket ediyor");
	}
	
	public void run(int speed) {
		System.out.println("k�pek ko�uyor " );
		//super.move(speed); 
		move(speed);
	}
	
	// override etmedi�imizde �st s�n�ftakileri �a��r�yor ama override edersek direkt bu s�n�f i�in tan�mlad���m�z� al�r bu sayede kodu de�i�tirmek zorunda kalmay�z
	
	
	
	

}
