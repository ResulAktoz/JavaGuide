package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		
		/*Subscriber subscriber = new Subscriber();
		subscriber.name = "Resul Aktoz";
		subscriber.balance = 200;
		subscriber.city = "Eski�ehir";
		
		subscriber.useGas(200);*/
		
		SubscriberManager subscriberManager = new SubscriberManager("Resul", 200, "Eski�ehir");
		subscriberManager.learnBalance();

	}

}
