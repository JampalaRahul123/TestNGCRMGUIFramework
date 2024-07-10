package practice.testng.suiteexample;

import org.testng.annotations.Test;
import practice.testng.suitebaseclassexample.BaseClassExample;

public class CreateOrgTest extends BaseClassExample {

	@Test
	public void createOrgTest() {
		System.out.println("execute createOrgTest & verify");
		}
	@Test
	public void createOrgWithIndustries() {
		System.out.println("execute createOrgWithIndustries & verify");
		}
}
