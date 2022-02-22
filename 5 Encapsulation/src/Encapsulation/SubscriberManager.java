package Encapsulation;

public class SubscriberManager {
	private String subscribername;
	private int balance=120; //bakiye de�eri vermezsek girdi olmazsa her bakiye 120den ba�lar.
	private String city;;
	
	public SubscriberManager() {
		super();
	}

	public SubscriberManager(String name, int balance, String city) {
		super();
		this.subscribername = name;
		if(balance >=0 && balance<= 120) {
			this.balance= balance;		
		}
		this.city = city;
		
	}
	public void useGas(int price) {
		if(this.balance - price < 0 ) {
			System.out.println("Yeterli bakiye yok");
		}else {
			balance -= price ;
			if(balance <= 0) {
				System.out.println("bakiye bitmi�tir abone merkezinden kredi y�kleyin."
						+ "kredi limiti= 120 tl");
				
			}else {
				System.out.println("yeni bakiye= " +balance);
			}
		}
	}
	public void learnBalance() {
		System.out.println("bakiye = " +balance);
	}
	
	
	
	
	

}
