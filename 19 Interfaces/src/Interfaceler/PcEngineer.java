package Interfaceler;

public class PcEngineer implements IEngineer{

	private boolean askerlik;
	private boolean adliSicil;
	
	
	public PcEngineer(boolean askerlik, boolean adliSicil) {
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

		System.out.println("Bilgisayar mühendisi olarak þu þirketlerde çalýþtým: ");
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		}
	}

}
