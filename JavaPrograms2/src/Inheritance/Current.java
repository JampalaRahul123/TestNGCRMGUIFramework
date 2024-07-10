package Inheritance;

public class Current extends Account {
long mobNo;
	public Current(String userName, double bal, int age,long mobNo) {
		super(userName, bal, age);
		this.mobNo=mobNo;
	}
	public String withdraw(double amt) {
		if(bal-amt>=5000) {
			bal=bal-amt;
			return "bal is:"+bal;
	}
		else {
			return "Insufficient Balance";
		}
	}
	public void applyROIOfCurrent() {
		bal=bal+bal*0.2;
		checkBal();
	}
	public void detailsOfCurrent() {
		System.out.println(userName);
		System.out.println(bal);
		System.out.println(age);
		System.out.println(mobNo);
	}
}
