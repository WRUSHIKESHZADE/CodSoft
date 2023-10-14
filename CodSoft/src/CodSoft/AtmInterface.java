package CodSoft;

import java.util.Scanner;

public class AtmInterface {
	
	double balance;
	int pin = 1234;
	
	public void checkpin() {
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		
		if(enteredpin == pin) {
			menu();
		}
		else {
			System.out.println("Enter valid pin");
		
		}
	}

	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check Account Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	if(option == 1) {
		checkBalance();
	}
	else if(option == 2) {
		withdrawMoney();
	}
	else if(option == 3) {
		depositMoney();
	}
	else if(option == 4) {
		return;
	}
	else {
		System.out.println("Enter a valid choice");
	}
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
		menu();
	}
	public void withdrawMoney() {
		System.out.println("Enter amount to withdraw");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		if(amount > balance) {
			System.out.println("Insufficient Balance");

			
		}
		else {
			
			balance = balance - amount;
			System.out.println("Money Withdraw Successfully");
		}
		menu();
	}
	public void depositMoney() {
		System.out.println("Enter the amount");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println("Money Deposited Successfully");
		menu();
		
	}
	
	public static void main(String[] args) {
		AtmInterface atm = new AtmInterface();
		atm.checkpin();
		
	}

}



