package Beyblade;

public class Drayka extends Beyblade{
	
	private String holyMonster;
	
	public Drayka(String beyBladeUser, int turningSpeed, int powerOfAttack, String holyMonster) {
		super(beyBladeUser,turningSpeed, powerOfAttack);
		this.holyMonster = holyMonster;
		
	}

	@Override
	public void showHolyMonster() {
		// TODO Auto-generated method stub
		//super.showHolyMonster();
		System.out.println(getbeyBladeUser()+ " " +holyMonster+ " ý ortaya çýkarýyor");
		System.out.println(getbeyBladeUser()+ " ýn saldýrýsý : Kaplan pençesi");
	}

	@Override
	public void showÝnformation() {
		// TODO Auto-generated method stub
		super.showÝnformation();
		System.out.println("Kutsal Canavar adý: " +holyMonster);
	}
	
	
	

}
