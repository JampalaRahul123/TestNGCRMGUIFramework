package com.testngcast.crm.generic.listenerUtility;

import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.testngcast.crm.generic.listenerbasetest.BaseClass;
import com.testngcast.crm.generic.webdriverutility.UtilityClassObject;

public class ListImpClass implements ITestListener, ISuiteListener {

	public ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public void onStart(ISuite suite) {
		System.out.println("Report Configuration");
		// Spark Report Config
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		spark = new ExtentSparkReporter("./AdvanceReport/report_"+time+".html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		// Add Environment Information And Create Test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
	}

	public void onFinish(ISuite suite) {
		System.out.println("Report BackUp");
		// To Get The Backup of reports
		report.flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println("===== ======>" + result.getMethod().getMethodName() + ">===START======");
		test = report.createTest(result.getMethod().getMethodName());
		UtilityClassObject.setTest(test);
		test.log(Status.INFO,result.getMethod().getMethodName()+"==> STARTED <====");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("===== ======>" + result.getMethod().getMethodName() + ">===END======");
		test.log(Status.PASS ,result.getMethod().getMethodName()+"==> COMPLETED <====");
	}

	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		//Takes Screenshot
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		String filePath = ts.getScreenshotAs(OutputType.BASE64);
		// Code To Get The TimeStamp WithOut Spaces and Colon
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filePath, testName+"_"+time);
		test.log(Status.FAIL,result.getMethod().getMethodName()+"==> FAILED <====");
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName()+"==> SKIPPED <====");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	
	public void onStart(ITestContext context) {
		
	}
	
	public void onFinish(ITestContext context) {
		
	}
}
