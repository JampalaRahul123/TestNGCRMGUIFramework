package com.testngcast.crm.generic.objectrepositoryutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {
	
	@FindBy(xpath = "//input[@alt='Create Product...']")
	private WebElement productLink;
	
	@FindBy(name="searchButton")
	private WebElement ele3;

	public WebElement getProductLink() {
		return productLink;
	}
}
