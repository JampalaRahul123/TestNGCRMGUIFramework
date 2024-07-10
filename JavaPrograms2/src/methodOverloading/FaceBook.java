package methodOverloading;

public class FaceBook {
String userName;
long mobNo;
long password;
char gender;
int age;
public FaceBook(String userName,long mobNo,long password,char gender,int age) {
	this.userName=userName;
	this.mobNo=mobNo;
	this.password=password;
	this.gender=gender;
	this.age=age;
	System.out.println("Successfully account has been created");
}
public void login(long mobNo,long password) {
if(this.mobNo==mobNo) {
	if(this.password==password) {
		System.out.println("Successfully logged-in");
	}
	else {
		System.out.println("Incorrect password");
	}
}
else {
	System.out.println("Incorrect mobNo");
}
}
public void logOut() {
	System.out.println("Successfully logged-out");
}
}

