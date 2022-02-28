package guessGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int numberToGuess = random.nextInt(1000);
		int numberOfTries=0;
		
		Scanner scanner = new Scanner(System.in);
		boolean t =true;
		do{
		System.out.print("Please enter the guess(It should be between the 0 to 1000): ");
		int guess = scanner.nextInt();
		
		
	 if(guess == numberToGuess) {
			
			numberOfTries++;
			System.out.println("You find the number on your " +numberOfTries+ "guess. The number is " +guess);
			
		}else if (guess < numberToGuess) {
			numberOfTries++;
			System.out.println("Your guess is low");
		}else {
			System.out.println("Your guess is high");
		}
		
		System.out.println("Do you want to play again ? (1-Yes,2-No)");
		String again = scanner.next();
		
		if(again.equals("1")) {
			continue;
		}else if(again.equals("2")) {
			t=false;
			
			break;
		}
		
		}while(t); 
			System.out.println("Number is: " +numberToGuess+ "and you have " +numberOfTries+ " tries to find number.");
			
			System.out.println("Game finished.");
			
		
//			if(again.equals("1")) {
//				
//			}if(again.equals("2")) {
//				break;
//			}
//			
//		}
//			System.out.println("Game is finish.");
	

	
}
}
