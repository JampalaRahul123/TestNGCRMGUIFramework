package practice.testng.suiteexample;

import org.testng.annotations.Test;
import practice.testng.suitebaseclassexample.BaseClassExample;

public class CreateContactTest extends BaseClassExample {

	@Test
	public void createContact() {
		System.out.println("execute createContact & verify ");
		}
	@Test
	public void createContactWithDate() {
		System.out.println("execute createContactWithDate & verify");
		}
}
