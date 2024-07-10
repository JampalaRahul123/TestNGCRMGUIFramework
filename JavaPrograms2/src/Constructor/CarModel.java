package Constructor;

public class CarModel {
	String carName;
	String model;
	int year;
	double price;
	String color;
	static String companyName = "Mahindra & Mahindra";

	public CarModel(String carName, String model, int year, double price, String color) {
		this.carName = carName;
		this.model = model;
		this.year = year;
		this.price = price;
		this.color = color;
		System.out.println(companyName);
		System.out.println("Successfully car has been registered with new model name:" + model);
	}

	public CarModel(String carName, String model, double price, String color) {
		this.carName = carName;
		this.model = model;
		this.price = price;
		this.color = color;
		System.out.println(companyName);
		System.out.println("Successfully car has been registered with new model name:" + model);
	}

	public CarModel(String carName, String model, double price) {
		this.carName = carName;
		this.model = model;
		this.price = price;
		System.out.println(companyName);
		System.out.println("Successfully car has been registered with new model name:" + model);
	}

	public void exist(String carName, String model) {
		if (this.carName == carName) {
			if (this.model == model) {
				System.out.println("Car exists in market");
			} else {
				System.out.println("model name is wrong");
			}
		} else {
			System.out.println("car name is wrong");
		}
	}
}
