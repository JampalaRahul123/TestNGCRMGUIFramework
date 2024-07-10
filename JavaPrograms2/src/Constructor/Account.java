package Constructor;

public class Account {
	String userName;
	long accNo;
	double bal;
	static String BankName="State Bank Of India";
	public Account(String userName,long accNo,double bal){
		this.userName=userName;
		this.accNo=accNo;
		this.bal=bal;
	}
	public void deposit(double amount) {
		bal=bal+amount;
	}
	public void withDraw(double amount) {
		if(bal>=amount) {
			bal=bal-amount;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
		public void checkBalance() {
			System.out.println(bal);
		 }
}
