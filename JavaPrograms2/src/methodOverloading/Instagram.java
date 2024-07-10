package methodOverloading;

public class Instagram {
String un;
long mobNo;
long password;
public Instagram(String un,long mobNo,long password) {
	this.un=un;
	this.mobNo=mobNo;
	this.password=password;
}
public void login(long mobNo,long password) {
	if(this.mobNo==mobNo) {
		if(this.password==password) {
			System.out.println("Logged-In");
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	else {
		System.out.println("Incorrect Mobile Number");
	}		
}
public void login(String un,long password) {
	if(this.un==un) {
		if(this.password==password) {
			System.out.println("Logged-In");
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	else {
		System.out.println("Incorrect User Name");
	}		
}
}

