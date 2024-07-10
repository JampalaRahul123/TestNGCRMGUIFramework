package Inheritance;

public class Savings extends Account {
String emailId;
	public Savings(String userName, double bal, int age,String emailId) {
		super(userName, bal, age);
		this.emailId=emailId;
	}
public String withdraw(double amt) {
	if(bal>=amt) {
		bal=bal-amt;
		return "bal is:"+bal;
}
	else {
		return "Insufficient Balance";
	}
}
public void applyROIOfSavings() {
	bal=bal+bal*0.1;
	checkBal();
}
public void detailsOfSavings() {
	System.out.println(userName);
	System.out.println(bal);
	System.out.println(age);
	System.out.println(emailId);
}
}
