package Inheritance;

public class AccountExecution {

	public static void main(String[] args) {
Savings user1=new Savings("Rahul",5000.0,25,"rahuljampala1998@gmail.com");
user1.checkBal();
user1.withdraw(500.0);
user1.checkBal();
user1.applyROIOfSavings();
user1.checkBal();
user1.detailsOfSavings();
System.out.println("------------------");
Current user2=new Current("Raja",6000.0,32,8897143512l);
user2.checkBal();
user2.withdraw(200.0);
user2.checkBal();
user2.applyROIOfCurrent();
user2.checkBal();
user2.detailsOfCurrent();

	}

}
