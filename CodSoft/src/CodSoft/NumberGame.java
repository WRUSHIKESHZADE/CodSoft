package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String playAgain;
		do {
		Random random = new Random();
		
		int min = 1;
		int max = 100;
		int generatedNumber = random.nextInt(max - min + 1) + min;
		int maxAttempts = 7;
		int attempts = 0;
		int score = 0;
		
		System.out.println("Welcome to Guess the Number!");
        System.out.println("I've picked a number between " + min + " and " + max + ". Can you guess it?");
        
        while(attempts < maxAttempts) {
        	System.out.println("Enter Your Guessing Number...");
        	int userGuess = sc.nextInt();
        	attempts++;
        	
        	if(userGuess == generatedNumber) {
        		System.out.println("Congratulations! You've guessed the number " + generatedNumber +" in "
        				                                                 + "" + attempts + " attempts.");
        		System.out.println("Your attempts is: " + attempts);
        		score = maxAttempts - attempts + 1;
        		System.out.println("Your score is: " + score);
        		break;
        		
        	}else if(userGuess < generatedNumber) {
        		System.out.println("Your guess is too low! Try again.");
        		
        	}else {
        		System.out.println("Your guess is too high! Try again.");
        	}
        	
        }
        if(attempts == maxAttempts) {
        	System.out.println("Sorry, you've used all your attempts. The number was: " + generatedNumber);
        }
        
        System.out.println("Would you like to play again (yes/no)?");
        playAgain = sc.next();
        
		}while(playAgain.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for playing.Goodbye.");
	}
}
