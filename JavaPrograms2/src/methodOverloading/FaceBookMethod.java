package methodOverloading;

public class FaceBookMethod {
	String name;
	long mobNo;
	long password;
	char gender;
	int age;
	public FaceBookMethod(String name,long mobNo,long password,char gender,int age) {
		this.name=name;
		this.mobNo=mobNo;
		this.password=password;
		this.gender=gender;
		this.age=age;
		System.out.println("Successfully account has been created for user:"+name);
	}
	public FaceBookMethod(String name,long mobNo,long password) {
		this.name=name;
		this.mobNo=mobNo;
		this.password=password;
		System.out.println("Successfully account has been created for user:"+name);
	}
	public FaceBookMethod(String name,long mobNo,long password,int age) {
		this.name=name;
		this.mobNo=mobNo;
		this.password=password;
		this.age=age;
		System.out.println("Successfully account has been created for user:"+name);
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
