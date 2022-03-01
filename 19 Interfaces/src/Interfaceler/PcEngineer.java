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
			System.out.println("Askerli�i yapt�m. ");
		}else {
			System.out.println("Askerli�i hen�z yapmad�m");
		}
		
	}

	@Override
	public String graduationGpa(double degree) {
		
		
		return "Ortalama: " +degree;
	}

	@Override
	public void adliSicilSorgula() {
		if(adliSicil) {
			System.out.println("Adli sicil kayd�m bulunuyor");
		}else {
			System.out.println("Herhangi bir adli sicil kayd�m bulunmuyor");
		}
		
	}

	@Override
	public void isTecr�besi(String[] array) {

		System.out.println("Bilgisayar m�hendisi olarak �u �irketlerde �al��t�m: ");
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		}
	}

}
