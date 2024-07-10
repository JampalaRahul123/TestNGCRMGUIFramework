package practice.testng.priority;

import org.testng.annotations.Test;

public class ContactTest1 {
	@Test 
	public void createContactTest() {
		System.out.println("Execute createContactTest with -->HDFC");
	}
	@Test
	public void modifyContactTest() {
		System.out.println("Execute Query insert contact into db==>ICICI");
		System.out.println("Execute modifyContactTest with -->HDFC=>ICICI");
	}
	@Test 
	public void deleteContactTest() {
		System.out.println("Execute Query insert contact into db==>UPI");
		System.out.println("Execute deleteContactTest --> ICICI");
}
}