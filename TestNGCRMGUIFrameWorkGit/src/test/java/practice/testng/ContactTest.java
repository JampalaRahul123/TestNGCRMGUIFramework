package practice.testng;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		System.out.println("Execute login");
		System.out.println("Execute navigate to contact");
		System.out.println("Execute create contact");
		System.out.println("Execute verify contact");
		System.out.println("Execute logout");
	}
	@Test
	public void createContactWithMobileNumberTest() {
		System.out.println("Execute createContactWithMobileNumberTest");
	}
}
