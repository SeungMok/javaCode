package exam03;

public class AccountMain {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(100000);
		try {
			a.withdraw(300000);
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
