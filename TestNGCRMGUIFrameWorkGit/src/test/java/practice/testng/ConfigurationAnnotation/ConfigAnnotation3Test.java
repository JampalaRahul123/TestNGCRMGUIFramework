package practice.testng.ConfigurationAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigAnnotation3Test {

	@BeforeClass
	public void configBC() {
		System.out.println("execute BeforeClass");
	}
	@BeforeMethod
	public void configBM() {
		System.out.println("execute BeforeMethod");
	}
	@Test
	public void createContact() {
		System.out.println("execute createContact");
		}
	@Test
	public void createContactWithDate() {
		System.out.println("execute createContactWithDate");
		}
	@AfterMethod
	public void configAM() {
		System.out.println("execute AfterMethod");
		}
		@AfterClass
		public void configAC() {
			System.out.println("execute AfterClass");
	}
}
