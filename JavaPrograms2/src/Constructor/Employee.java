package Constructor;

public class Employee {
String name;
double sal;
int id;
static String companyName="TCS";
public Employee(String s,double d,int i) {
	name=s;
	sal=d;
	id=i;
}
public void details() {
	System.out.println(name);
	System.out.println(sal);
	System.out.println(id);
	System.out.println(companyName);
}
}