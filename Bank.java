package interfaces.example;

public interface Bank {
	public void deposit(int balance,AccountHolder accountHolder);
	public double withdraw(int balance,AccountHolder accountHolder);
	public double checkBalance(String password,AccountHolder accountHolder);
}
