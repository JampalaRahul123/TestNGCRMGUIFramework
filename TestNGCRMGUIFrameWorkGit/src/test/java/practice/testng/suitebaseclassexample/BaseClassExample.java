package practice.testng.suitebaseclassexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassExample {
	@BeforeSuite
	public void configBS() {
		System.out.println("====connect to DB, Report Config===");
	}
	@BeforeClass
	public void configBC() {
		System.out.println("===launch browser===");
	}
	@BeforeMethod
	public void configBM() {
		System.out.println("=login=");
	}
	@AfterMethod
	public void configAM() {
		System.out.println("=logout=");
	}
	@AfterClass
	public void configAC() {
	System.out.println("===close the browser===");
}
	@AfterSuite
	public void configAS() {
		System.out.println("===close Db, Report backup===");
	}
}
