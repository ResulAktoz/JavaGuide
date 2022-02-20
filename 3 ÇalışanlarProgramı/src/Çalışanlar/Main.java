package Çalýþanlar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Worker worker1 = new Worker(1, "Resul", "Aktoz");
		Worker worker2 = new Worker(2, "Sinem", "Kestek");
		Worker worker3= new Worker(3,"Tarço","Reis");
		
		
//		Worker worker1 = new Worker(1, "Resul", "Aktoz");
//		Worker worker2 = new Worker(2, "Sinem", "Kestek");
//		Worker worker3= new Worker(3,"Tarço","Reis");
//		Manager manager1= new Manager(worker3, 2);
//		
//		Developer developer1 = new Developer(worker1, "Java");
//		Developer developer2 = new Developer(worker2,"Javascript");
//		
//		developer1.showÝnformation();
//		developer2.showÝnformation();
//		manager1.showÝnformation();
//		manager1.makeRaise(1500);
//		developer2.format("Maaþ sisteminin yeni hali");
//		benim yaptýðým program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Çalýþanlar Programýna Hoþgeldiniz*****");
		
		String islemler= "Ýþlemler...\n"
						+"1. Yazýlýmcý Ýþlemleri \n"
						+"2. Yönetici Ýþlemleri \n"
						+"Çýkýþ için q'ya basýn";
		System.out.println("*******************");
		System.out.println(islemler);
		System.out.println("*******************");
		while(true) {
			System.out.println("iþlemi Seçiniz");
			String islem= scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("programdan çýkýlýyor");
				break;
			}else if(islem.equals("1")) {
				Developer developer1 = new Developer(1,"Resul","Aktoz", "Javascript");
				String developerOperates = "1.Format At \n"
										+"2. Bilgileri Göster \n"
										+"Çýkýþ için q'ya basýn";
				System.out.println(developerOperates);
				while(true) {
					System.out.println("iþlemi seçin");
					String developerOperate = scanner.nextLine();
					if(developerOperate.equals("q")) {
						System.out.println("sistemden çýkýlýyor");
						break;
					}else if(developerOperate.equals("1")) {
						System.out.println("Ýþletim sistemi: ");
						String operatingSystem = scanner.nextLine();
						developer1.format(operatingSystem);
						
						
					}else if(developerOperate.equals("2")) {
						developer1.showÝnformation();
					}else {
						System.out.println("geçersiz bir yazýlým iþlemi");
					}
					
							
							}
				
			}else if(islem.equals("2")) {
				Manager manager1 = new Manager(worker3, 2);
				String managerProcess = "Yönetici Ýþlemleri\n"
										+"1. Zam yap "
										+"bilgileri göster "
										+"Çýkýþ için q'ya basýnýz";
				while(true) {
					System.out.println("Ýþlem Seçiniz: ");
					String managerOperate =scanner.next();
					if(managerOperate.equals("q")){
						System.out.println("sistemden çýkýlýyor....");
						break;
					}else if(managerOperate.equals("1")) {
						System.out.println("Yöneticinin ne kadar zamn yapmasýný istiyorsunuz");
						int amount= scanner.nextInt();
						manager1.makeRaise(amount);
						
					}else if(managerOperate.equals("2")){
						manager1.showÝnformation();
						
					}else {
						System.out.println("geçersiz yönetici iþlemi.");
					}
				}
										
				
			}
			
			
		}
		

	}

	private static Worker Worker(int i, String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
