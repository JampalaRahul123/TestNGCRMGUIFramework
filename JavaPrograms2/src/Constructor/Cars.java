package Constructor;

public class Cars {
	String carName;
	String model;
	double price;
	String color;
	public Cars(String carName,String model,double price,String color) {
		this.carName=carName;
		this.model=model;
		this.price=price;
		this.color=color;
	}
	public void details() {
        System.out.println(carName);
        System.out.println(model);
        System.out.println(price);
        System.out.println(color);
	}
}
