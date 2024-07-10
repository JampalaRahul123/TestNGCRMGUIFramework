package practice.testng;
import org.testng.annotations.Test;

import com.testngcast.crm.generic.basetest.BaseClass;
import com.testngcast.crm.generic.objectrepositoryutility.LoginPage;

/**
 * test class for contact module
 *  @author Rahul
 */
public class SearchContactTest extends BaseClass {
	/**
	 * Scenario 1 : login()==>NavigateContact==>CreateContact()==>Verify
	 */
	@Test
	public void searchContactTest() {
		/*Step 1 : Login To App */
		LoginPage lp = new LoginPage(driver);
		lp.loginToapp("url", "username", "password");
	}
}
