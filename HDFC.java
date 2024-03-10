package interfaces.example;

public class HDFC implements Bank {

	@Override
	public void deposit(int balance, AccountHolder accountHolder) {
		double currentBalance = accountHolder.getBalance();
		accountHolder.setBalance(balance+currentBalance);
	}

	@Override
	public double withdraw(int balance, AccountHolder accountHolder) {
		if(accountHolder.getBalance()>balance) {
			double currentBalance = accountHolder.getBalance()-balance;
			accountHolder.setBalance(currentBalance);
			System.out.println("success");
			return currentBalance;
		}else {
			System.out.println("insufficient balance");
			return 0;
		}
	}

	@Override
	public double checkBalance(String password, AccountHolder accountHolder) {
		
		if(accountHolder.getPassword().equals(password)) {
			return accountHolder.getBalance();
		}else {
			System.out.println("wrong password");
			return 0;
		}
	}

	
	
}
