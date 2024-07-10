package Constructor;
import java.util.*;
public class Car {
String carName;
String model;
int year;
double price;
String color;
static String companyName="Mahindra & Mahindra";
public Car() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the car name:");
	this.carName=scan.next();
	System.out.println("enter the model: ");
	this.model=scan.next();
	System.out.println("enter the year:");
	this.year=scan.nextInt();
	System.out.println("enter the price:");
	this.price=scan.nextDouble();
	System.out.println("enter the colour :");
	this.color=scan.next();
	scan.close();
	}
public void details() {
	System.out.println(carName);
	System.out.println(model);
	System.out.println(year);
	System.out.println(price);
	System.out.println(color);
	System.out.println(companyName);
}
}

