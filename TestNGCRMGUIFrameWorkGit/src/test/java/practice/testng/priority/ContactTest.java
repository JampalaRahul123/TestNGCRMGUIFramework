package practice.testng.priority;

import org.testng.annotations.Test;

public class ContactTest {

	@Test (priority=1)
	public void createContactTest() {
		System.out.println("Execute createContactTest with -->HDFC");
	}
	@Test (priority=2)
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest with -->HDFC=>ICICI");
	}
	@Test (priority=3)
	public void deleteContactTest() {
		System.out.println("Execute deleteContactTest --> ICICI");
	}
}
