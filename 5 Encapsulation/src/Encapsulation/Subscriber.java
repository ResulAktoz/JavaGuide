package Encapsulation;

public class Subscriber {
	public String name;
	public int balance;
	
	public String city;
	
	public void useGas(int price) {
		if(this.balance - price < 0 ) {
			System.out.println("Yeterli bakiye yok");
		}else {
			balance -= price ;
			if(balance <= 0) {
				System.out.println("bakiye bitmiþtir abone merkezinden kredi yükleyin."
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
