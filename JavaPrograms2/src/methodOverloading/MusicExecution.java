package methodOverloading;

public class MusicExecution {

	public static void main(String[] args) {
		Music m1 = new Music("Kalallo", "Karthik", "Virupaksha", 2023);
		m1.available("Kalallo");
		m1.available("Kalallo", "Virupaksha");
		m1.available("Kalallo", 2023);
		m1.available("Kalallo", "Karthik", "Virupaksha");

	}

}
