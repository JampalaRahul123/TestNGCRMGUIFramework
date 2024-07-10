package com.testngcast.crm.regressionorgtest;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testngcast.crm.generic.regressionbasetest.BaseClass;
import com.testngcast.crm.generic.objectrepositoryutility.CreatingNewOrganizationPage;
import com.testngcast.crm.generic.objectrepositoryutility.HomePage;
import com.testngcast.crm.generic.objectrepositoryutility.OrganizationInfoPage;
import com.testngcast.crm.generic.objectrepositoryutility.OrganizationsPage;

public class CreateOrganizationTest extends BaseClass {

	@Test(groups={"smokeTest"})
	public void createOrganizationTest() throws IOException {
		// Create Object to read data From Excel File
		String orgName = eLib.getDataFromExcel("org", 1, 2) + jLib.getRandomNumber(); // To Generate random Number
		// step 1 : Navigate To Organization Module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();
		// step 2 : Click on Create Organization Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();
		// step 3 : Enter all the details and create new organization
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrg(orgName);
		// Step 4 : Verify Header Message Expected Result
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String headerInfo = oip.getHeaderMsg().getText();
		boolean status=headerInfo.contains(orgName);
		Assert.assertEquals(status, true); // Hard Assert
	}

	@Test(groups={"regressionTest"})
	public void createOrganizationWithIndustriesTest() throws IOException, InterruptedException {
		// Create Object to read data From Excel File
		String orgName = eLib.getDataFromExcel("org", 4, 2) + jLib.getRandomNumber(); // To Generate random Number
		String industry = eLib.getDataFromExcel("org", 4, 3); // To Generate random Number
		String type = eLib.getDataFromExcel("org", 4, 4); // To Generate random Number
		// step 1 : Navigate To Organization Module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();
		// step 2 : Click on Create Organization Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();
		// step 3 : Enter all the details and create new organization
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrgWithIndustry(orgName, industry, type);
		Thread.sleep(3000);
		// Step 4 : Verify the industries,type and orgName info
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String headerInfo = oip.getHeaderMsg().getText();
		boolean status=headerInfo.contains(orgName);
		Assert.assertEquals(status, true); // Hard Assert
		String actIndustries = oip.getIndustryName().getText();
		SoftAssert AssertObj  = new SoftAssert(); //Soft Assert
		AssertObj.assertEquals(actIndustries, industry);
		String actType = oip.getTypeName().getText();
		AssertObj.assertEquals(actType, type); //Soft Assert
		AssertObj.assertAll();
	}

	@Test (groups={"regressionTest"})
	public void CreateOrganizationWithPhoneNumber() throws IOException,InterruptedException {
		// Create Object to read data From Excel File
		String orgName = eLib.getDataFromExcel("org", 7, 2) + jLib.getRandomNumber(); // To Generate random Number
		String phoneNumber = eLib.getDataFromExcel("org", 7, 3); // To Generate random Number
		// step 1 : Navigate To Organization Module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();
		// step 2 : Click on Create Organization Button
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateNewOrgBtn().click();
		// step 3 : Enter all the details and create new organization
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.createOrgWithPhone(orgName, phoneNumber);
		Thread.sleep(3000);
		// Step 4 : Verify the phonenumber and org name info
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actPhoneNumber = oip.getPhoneNo().getText(); 
		SoftAssert AssertObj  = new SoftAssert(); //Soft Assert
		boolean phone=actPhoneNumber.contains(phoneNumber);
		AssertObj.assertEquals(phone,true);
		String actOrgName = oip.getHeaderMsg().getText();
		boolean org=actOrgName.contains(orgName);
		Assert.assertEquals(org, true); //Hard Assert
		AssertObj.assertAll();
	}
}