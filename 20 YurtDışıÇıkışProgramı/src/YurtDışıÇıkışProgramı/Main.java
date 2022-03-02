package YurtDýþýÇýkýþProgramý;
import java.lang.InterruptedException;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Havalimanýna hoþ geldiniz. ");
		String sartlar = "Yurtdýþý Çýkýþ Kurallar... \n"
						+"Herhangi bir siyasi yasaðýnýzýn bulunmamasý gerekiyor.\n"
						+"15 TL harç bedelini tam olarak yatýrmanýz gerekiyor.\n"
						+"Gideceðiniz ülkeye vizenizin bulunmasý gerekiyor.";
		
		String message = "Yurtdýþý þartlarýndan hepsini saðlamanýz gerekiyor.";
		
		//Passanger passanger1 = new Passanger();
		
//		passanger1.yurtDisiHarciKontrol();
//		passanger1.siyasiYasakKontrol();
//		passanger1.vizeDurumuKontrol();/		
		while(true) {
			
			System.out.println("******************");
			System.out.println(sartlar);
			System.out.println("******************");
			
			Passenger passenger1 = new Passenger();
			System.out.println("Harç bedeli kontrol ediliyor");
			
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
				
			
			System.out.println("Yurtdýþýna çýkýþýnýzda bir problem yok. Ýyi tatiller! ");
			break;
			
			
			
			
		}

	}

}
