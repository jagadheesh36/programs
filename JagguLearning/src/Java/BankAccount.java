package Java;

public class BankAccount {
	private double balance = 1000;
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance) {
		balance = balance - amount; 
		}else {
			System.out.println("Insuffient balance");
		}
	}
		public double getBalance() {
			return balance;
	}
		
}


