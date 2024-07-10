package com.testngcast.crm.Assertions;

import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetExample2 {

	@Test
	public void homePageTest(Method mtd) {
		// To get the method name dynamically, we use a class called Method which is present in java.reflect package
		System.out.println(mtd.getName() + " Test Start ");
			System.out.println("Step-1");
		    System.out.println("Step-2");
		    Assert.assertEquals("Home", "Home");
		    System.out.println("Step-3");
		    Assert.assertEquals("Home-CRM", "Home-CRM");
		    System.out.println("Step-4");
		System.out.println(mtd.getName() + " Test End");
	}

	@Test
	public void verifyLogoHomePageTest(Method mtd) {
		// To get the method name dynamically, we use a class called Method which is present in java.reflect package
		System.out.println(mtd.getName() + " Test Start ");
		System.out.println("Step-1");
	    System.out.println("Step-2");
	    Assert.assertTrue(true);
	    System.out.println("Step-3");
	    System.out.println("Step-4");
		System.out.println(mtd.getName() + " Test End");
		}
	}