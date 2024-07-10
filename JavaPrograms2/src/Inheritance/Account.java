package Inheritance;

public class Account {
String userName;
double bal;
int age;
public Account(String userName,double bal,int age) {
	this.userName=userName;
	this.bal=bal;
	this.age=age;
}
public String deposit(double amt) {
	bal=bal+amt;
	return "bal is:"+bal;
}
public void checkBal()
{
	System.out.println(bal);
}
}
