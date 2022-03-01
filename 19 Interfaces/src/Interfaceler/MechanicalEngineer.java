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
		
		if(array.length==0) {
			System.out.println("Herhangi bir i� tecr�bem bulunmuyor");
		}else {
			System.out.println("Makine m�hendisi olarak �u �irketlerde �al��t�m: ");
			
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
		
		
	}
	
	public void getReference(String[] array) {
		if(array.length==0) {
			System.out.println("Referans�m bulunmuyor");
		}else {
			System.out.println("Referanslar�m: ");
			
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
	}

	@Override
	public void work() {

		System.out.println("Makine M�hendisi �al���yor");
		
		
	}
	
	

}
