package Constructor;

public class AccountExecution {

	public static void main(String[] args) {
		Account a1=new Account("Rahul",520041234l,4000.0);
		a1.checkBalance();
		a1.withDraw(500.0);
		a1.deposit(1000.0);
		a1.checkBalance();
		System.out.println("-------------");
		Account a2=new Account("Ravi",526781294l,5000.0);
		a2.checkBalance();
		a2.withDraw(1000.0);
		a2.deposit(500.0);
		a2.checkBalance();
	}
}
