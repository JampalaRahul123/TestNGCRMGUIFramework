package Constructor;

public class EmployeeExecution {

	public static void main(String[] args) {
		Employee e1=new Employee("Rahul",40000.0,24);
		e1.details();
		System.out.println("----------");
		Employee e2=new Employee("Raja",50000.0,32);
		e2.details();
	}

}
