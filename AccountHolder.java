package interfaces.example;

public class AccountHolder {

	private int accountNumber;
	private String name;
	private String password;
	private String email;
	private double balance;
	
	public AccountHolder() {
		super();
	}

	public AccountHolder(int accountNumber, String name, String password, String email, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.email = email;
		this.balance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
