package �al��anlar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Worker worker1 = new Worker(1, "Resul", "Aktoz");
		Worker worker2 = new Worker(2, "Sinem", "Kestek");
		Worker worker3= new Worker(3,"Tar�o","Reis");
		
		
//		Worker worker1 = new Worker(1, "Resul", "Aktoz");
//		Worker worker2 = new Worker(2, "Sinem", "Kestek");
//		Worker worker3= new Worker(3,"Tar�o","Reis");
//		Manager manager1= new Manager(worker3, 2);
//		
//		Developer developer1 = new Developer(worker1, "Java");
//		Developer developer2 = new Developer(worker2,"Javascript");
//		
//		developer1.show�nformation();
//		developer2.show�nformation();
//		manager1.show�nformation();
//		manager1.makeRaise(1500);
//		developer2.format("Maa� sisteminin yeni hali");
//		benim yapt���m program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�al��anlar Program�na Ho�geldiniz*****");
		
		String islemler= "��lemler...\n"
						+"1. Yaz�l�mc� ��lemleri \n"
						+"2. Y�netici ��lemleri \n"
						+"��k�� i�in q'ya bas�n";
		System.out.println("*******************");
		System.out.println(islemler);
		System.out.println("*******************");
		while(true) {
			System.out.println("i�lemi Se�iniz");
			String islem= scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("programdan ��k�l�yor");
				break;
			}else if(islem.equals("1")) {
				Developer developer1 = new Developer(1,"Resul","Aktoz", "Javascript");
				String developerOperates = "1.Format At \n"
										+"2. Bilgileri G�ster \n"
										+"��k�� i�in q'ya bas�n";
				System.out.println(developerOperates);
				while(true) {
					System.out.println("i�lemi se�in");
					String developerOperate = scanner.nextLine();
					if(developerOperate.equals("q")) {
						System.out.println("sistemden ��k�l�yor");
						break;
					}else if(developerOperate.equals("1")) {
						System.out.println("��letim sistemi: ");
						String operatingSystem = scanner.nextLine();
						developer1.format(operatingSystem);
						
						
					}else if(developerOperate.equals("2")) {
						developer1.show�nformation();
					}else {
						System.out.println("ge�ersiz bir yaz�l�m i�lemi");
					}
					
							
							}
				
			}else if(islem.equals("2")) {
				Manager manager1 = new Manager(worker3, 2);
				String managerProcess = "Y�netici ��lemleri\n"
										+"1. Zam yap "
										+"bilgileri g�ster "
										+"��k�� i�in q'ya bas�n�z";
				while(true) {
					System.out.println("��lem Se�iniz: ");
					String managerOperate =scanner.next();
					if(managerOperate.equals("q")){
						System.out.println("sistemden ��k�l�yor....");
						break;
					}else if(managerOperate.equals("1")) {
						System.out.println("Y�neticinin ne kadar zamn yapmas�n� istiyorsunuz");
						int amount= scanner.nextInt();
						manager1.makeRaise(amount);
						
					}else if(managerOperate.equals("2")){
						manager1.show�nformation();
						
					}else {
						System.out.println("ge�ersiz y�netici i�lemi.");
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
