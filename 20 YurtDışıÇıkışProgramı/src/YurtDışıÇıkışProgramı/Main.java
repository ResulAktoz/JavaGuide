package YurtD�����k��Program�;
import java.lang.InterruptedException;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Havaliman�na ho� geldiniz. ");
		String sartlar = "Yurtd��� ��k�� Kurallar... \n"
						+"Herhangi bir siyasi yasa��n�z�n bulunmamas� gerekiyor.\n"
						+"15 TL har� bedelini tam olarak yat�rman�z gerekiyor.\n"
						+"Gidece�iniz �lkeye vizenizin bulunmas� gerekiyor.";
		
		String message = "Yurtd��� �artlar�ndan hepsini sa�laman�z gerekiyor.";
		
		//Passanger passanger1 = new Passanger();
		
//		passanger1.yurtDisiHarciKontrol();
//		passanger1.siyasiYasakKontrol();
//		passanger1.vizeDurumuKontrol();/		
		while(true) {
			
			System.out.println("******************");
			System.out.println(sartlar);
			System.out.println("******************");
			
			Passenger passenger1 = new Passenger();
			System.out.println("Har� bedeli kontrol ediliyor");
			
			Thread.sleep(3000); //3 saniye durduruyoruz.
			
			if(passenger1.yurtDisiHarciKontrol()==false) {
				System.out.println(message);
				continue;
				
			}
			
			System.out.println("Siyasi yasak kontrol ediliyor");
			
			Thread.sleep(3000);
			
			if(passenger1.siyasiYasakKontrol()==false) {
				System.out.println(message);
				continue;
			}
			
			System.out.println("Vize durumu kontrol ediliyor");
			Thread.sleep(3000);
			
			if(passenger1.vizeDurumuKontrol()==false) {
				System.out.println(message);
				continue;
			}
				
			
			System.out.println("Yurtd���na ��k���n�zda bir problem yok. �yi tatiller! ");
			break;
			
			
			
			
		}

	}

}
