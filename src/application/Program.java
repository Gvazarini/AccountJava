package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) 
	{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter Account Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("is ther an initial deposit (y/n)?: ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') 
		{
			System.out.print("Enter with the deposit amount:");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else
		{
			account = new Account(number, holder);
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter with a deposit amount: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Account status update:");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter with a withdraw amount: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Account status update:");
		System.out.println(account);
		
		sc.close();
	}

}
