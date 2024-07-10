package practice.testng.ConfigurationAnnotation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigAnnotation1Test {

	@Test
	public void createContact() {
		System.out.println("execute createContact");
		}
	@BeforeMethod
	public void configBM() {
		System.out.println("execute BeforeMethod");
	}
}
