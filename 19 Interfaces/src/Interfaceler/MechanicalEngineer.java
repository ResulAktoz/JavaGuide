package Interfaceler;

public class MechanicalEngineer implements IEngineer,Working {

	
	private boolean askerlik;
	private boolean adliSicil;
		
	
	public MechanicalEngineer(boolean askerlik, boolean adliSicil) {
		super();
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
	}

	@Override
	public void askerlikDurumuSorgula() {
		
		if(askerlik) {
			System.out.println("Askerliði yaptým. ");
		}else {
			System.out.println("Askerliði henüz yapmadým");
		}
		
		
		
		
		
	}

	@Override
	public String graduationGpa(double degree) {
		
		return "Ortalama: " +degree;
	}

	@Override
	public void adliSicilSorgula() {
		
		if(adliSicil) {
			System.out.println("Adli sicil kaydým bulunuyor");
		}else {
			System.out.println("Herhangi bir adli sicil kaydým bulunmuyor");
		}
		
	}

	@Override
	public void isTecrübesi(String[] array) {
		
		if(array.length==0) {
			System.out.println("Herhangi bir iþ tecrübem bulunmuyor");
		}else {
			System.out.println("Makine mühendisi olarak þu þirketlerde çalýþtým: ");
			
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
		
		
	}
	
	public void getReference(String[] array) {
		if(array.length==0) {
			System.out.println("Referansým bulunmuyor");
		}else {
			System.out.println("Referanslarým: ");
			
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
	}

	@Override
	public void work() {

		System.out.println("Makine Mühendisi çalýþýyor");
		
		
	}
	
	

}
