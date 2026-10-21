package Java;

public class Main2 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(500);
		account.withdraw(200);
		
		System.out.println("Final Balance: " + account.getBalance());
	}
}
