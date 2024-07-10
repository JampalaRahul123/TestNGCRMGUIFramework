package Constructor;

public class CarModelExecution {

	public static void main(String[] args) {
		CarModel c1 = new CarModel("Scorpio", "S11", 2020, 18.65, "Dsat Silver");
		c1.exist("Scorpio", "S11");
		CarModel c2 = new CarModel("Scorpio", "S2", 9.65, "pearl White");
		c2.exist("Scorpio", "S2");
		CarModel c3 = new CarModel("Scorpio", "S9", 18.65);
		c3.exist("Scorpio", "S9");
	}

}
