package interfaces.example;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountHolder accountHolder = new AccountHolder();
		HDFC hdfc = new HDFC();
		while (true) {
			System.out.println("1.CreateAccount\n2.Deposit\n3.WithDraw\n4.CheckBalance\n5.Exit");
			System.out.println("select option");
			int option = scanner.nextInt();

			switch (option) {
			case 1: {
				System.out.println("enter account holder number");
				int number = scanner.nextInt();
				System.out.println("enter account holder name");
				String name = scanner.next();
				System.out.println("enter account holder password");
				String password = scanner.next();
				System.out.println("enter account holder email");
				String email = scanner.next();
				System.out.println("enter account holder balance");
				double balance = scanner.nextDouble();

				accountHolder.setAccountNumber(number);
				accountHolder.setBalance(balance);
				accountHolder.setEmail(email);
				accountHolder.setPassword(password);
				accountHolder.setName(name);

			}
				break;
			case 2: {
				System.out.println("enter account holder balance");
				int balance = scanner.nextInt();
				hdfc.deposit(balance, accountHolder);
			}
				break;

			case 3: {
				System.out.println("enter account holder balance");
				int balance = scanner.nextInt();
				double b=hdfc.withdraw(balance, accountHolder);
				System.out.println("available balance = "+b);
			}
				break;
			case 4: {
				System.out.println("enter account holder password");
				String pass = scanner.next();
				double balance=hdfc.checkBalance(pass, accountHolder);
				System.out.println("available balance = "+balance);
			}
				break;
			case 5: {
				System.exit(0);
			}
				break;

			default: {
				System.out.println("invalid choice");
			}
				break;
			}
		}
	}
}
