package Beyblade;

public class Dranza extends Beyblade {
	
	private String holyMonster;

//	public Dranza() {
//		super();
//	}
	
	public Dranza(String beyBladeUser, int turningSpeed, int powerOfAttack,String holyMonster) {
		super(beyBladeUser,turningSpeed, powerOfAttack);
		this.holyMonster = holyMonster;
	}

	@Override
	public void showHolyMonster() {
		// TODO Auto-generated method stub
		//super.showHolyMonster();
		System.out.println(getbeyBladeUser()+ " " +holyMonster+ " � ortaya ��kar�yor");
		System.out.println(getbeyBladeUser()+ " �n sald�r�s� : Alev K�l�c�");
	}

	@Override
	public void show�nformation() {
		// TODO Auto-generated method stub
		super.show�nformation();
		System.out.println("Kutsal Canavar ad�: " +holyMonster);
	}

	

	
	
	
	

}
