package com.testngcast.crm.regressioncontacttest;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testngcast.crm.generic.regressionbasetest.BaseClass;
import com.testngcast.crm.generic.objectrepositoryutility.ContactInfoPage;
import com.testngcast.crm.generic.objectrepositoryutility.ContactsPage;
import com.testngcast.crm.generic.objectrepositoryutility.CreatingNewContactPage;
import com.testngcast.crm.generic.objectrepositoryutility.CreatingNewOrganizationPage;
import com.testngcast.crm.generic.objectrepositoryutility.HomePage;
import com.testngcast.crm.generic.objectrepositoryutility.OrganizationInfoPage;
import com.testngcast.crm.generic.objectrepositoryutility.OrganizationsPage;

public class CreateContactTest extends BaseClass {

	@Test(groups={"smokeTest"})
	public void createContactTest() throws InterruptedException,IOException {
		// Create Object to read data From Excel File
		String firstName = eLib.getDataFromExcel("contact", 1, 2) + jLib.getRandomNumber(); // To Generate random Number
		String lastName = eLib.getDataFromExcel("contact", 1, 3);
		// step 1 : Navigate To Contact Module
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();
		// step 2 : Click on Create Contact Button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateNewContactBtn().click();
		// step 3 : Enter all the details and create new contact
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createContact(firstName, lastName);
		Thread.sleep(3000);
		// Step 4 : Verify Contact Name info Expected Result
		ContactInfoPage cip = new ContactInfoPage(driver);
		String actContactName = cip.getHeaderMsg().getText();
		boolean status1=actContactName.contains(lastName);
		boolean status2=actContactName.contains(firstName);
		Assert.assertEquals(status1,true);//Hard Assert
		Assert.assertEquals(status2,true);//Hard Assert
	}

	@Test(groups={"regressionTest"})
	public void createContactWithSupportDate() throws IOException,InterruptedException {
		// Create Object to read data From Excel File
		SoftAssert AssertObj = new SoftAssert();
		String firstName = eLib.getDataFromExcel("contact", 4, 2) + jLib.getRandomNumber(); // To Generate random Number
		String lastName = eLib.getDataFromExcel("contact", 4, 3); // To Generate random Number
		// step 2 : Navigate To Contact Module
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();
		// step 3 : Click on Create Contact Button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateNewContactBtn().click();
		// step 4 : Enter all the details and create new contact
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		String startDate = jLib.getSystemDateYYYYDDMM();
		String endDate = jLib.getRequiredDateYYYYDDMM(30);
		cncp.createContactWithSupportDate(firstName, lastName, startDate, endDate);
		Thread.sleep(3000);
		// Step 5 : Verify Date Details info Expected Result
		ContactInfoPage cip = new ContactInfoPage(driver);
		String actContactName = cip.getHeaderMsg().getText();	
		boolean status1=actContactName.contains(lastName);
		boolean status2=actContactName.contains(firstName);
		Assert.assertEquals(status1,true);//Hard Assert
		Assert.assertEquals(status2,true);//Hard Assert
		String actStartDate = cip.getSupportStartDate().getText();
		AssertObj.assertEquals(actStartDate,startDate); //Soft Assert
		String actEndDate = cip.getSupportEndDate().getText();
		AssertObj.assertEquals(actEndDate,endDate); //Soft Assert
		AssertObj.assertAll();
	}

	@Test(groups={"regressionTest"})
	public void createContactWithOrgTest() throws IOException,InterruptedException {
		// Create Object to read data From Excel File
		SoftAssert AssertObj = new SoftAssert();
		String orgName = eLib.getDataFromExcel("contact", 7, 2) + jLib.getRandomNumber();// To Generate random Number
		String firstName = eLib.getDataFromExcel("contact", 7, 3) + jLib.getRandomNumber();// To Generate random Number
		String lastName = eLib.getDataFromExcel("contact", 7, 4);
		// step 2 : Navigate To Organization Module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();
		// step 3 : Click on Create Organization Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();
		// step 4 : Enter all the details and create new organization
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrg(orgName);
		Thread.sleep(3000);
		// Step 5 : Verify Header Message Expected Result
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String headerInfo = oip.getHeaderMsg().getText();
		boolean status=headerInfo.contains(orgName);
		Assert.assertEquals(status, true); // Hard Assert
		// Step 6 : Navigate To Contact Module
		hp.getContactLink().click();
		// step 7 : Click on Create Contact Button
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateNewContactBtn().click();
		// step 8 : Enter all the details and create new contact
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		String startDate = jLib.getSystemDateYYYYDDMM();
		String endDate = jLib.getRequiredDateYYYYDDMM(30);
		cncp.createContactWithOrg(firstName, lastName, startDate, endDate, orgName);
		Thread.sleep(3000);
		// Step 9 : Verify Header Message Expected Result For Contact
		ContactInfoPage cip = new ContactInfoPage(driver);
		String actContactName = cip.getHeaderMsg().getText();
		boolean status1=actContactName.contains(lastName);
		boolean status2=actContactName.contains(firstName);
		Assert.assertEquals(status1,true);//Hard Assert
		Assert.assertEquals(status2,true);//Hard Assert
		String actOrgName = cncp.getOrgName().getText();
		boolean status3=actOrgName.contains(orgName);
		Assert.assertEquals(status3,true); //Hard Assert
		String actStartDate = cip.getSupportStartDate().getText();
		AssertObj.assertEquals(actStartDate,startDate); //Soft Assert
		String actEndDate = cip.getSupportEndDate().getText();
		AssertObj.assertEquals(actEndDate,endDate); //Soft Assert
		AssertObj.assertAll();
		}
}