package Beyblade;

public class Beyblade {
	private String beyBladeUser;
	private int turningSpeed;
	private int powerOfAttack;
	
	
	public Beyblade() {
		super();
	}


	public Beyblade(String beyBladeUser, int turningSpeed, int powerOfAttack) {
		super();
		this.beyBladeUser = beyBladeUser;
		this.turningSpeed = turningSpeed;
		this.powerOfAttack = powerOfAttack;
	}
	public void attack() {
		
		System.out.println(getbeyBladeUser()+ "" +powerOfAttack+ " ve " +turningSpeed+ " ile sald�r�yor.");
	}
	
	public void showHolyMonster() {
		System.out.println("Bu beyblade'in kutsal canavar� bulunmuyor");
		
	}
	public void show�nformation() {
		System.out.println("Beybladeci ismi: " +getbeyBladeUser());
		System.out.println("D�n�� h�z�: " +getTurningSpeed());
		System.out.println("Sald�r� g�c�: " +getPowerOfAttack());
		
	}


	public String getbeyBladeUser() {
		return beyBladeUser;
	}


	public void setbeyBladeUser(String beyBladeUser) {
		this.beyBladeUser = beyBladeUser;
	}


	public int getTurningSpeed() {
		return turningSpeed;
	}


	public void setTurningSpeed(int turningSpeed) {
		this.turningSpeed = turningSpeed;
	}


	public int getPowerOfAttack() {
		return powerOfAttack;
	}


	public void setPowerOfAttack(int powerOfAttack) {
		this.powerOfAttack = powerOfAttack;
	}
	
	
	
	

}
