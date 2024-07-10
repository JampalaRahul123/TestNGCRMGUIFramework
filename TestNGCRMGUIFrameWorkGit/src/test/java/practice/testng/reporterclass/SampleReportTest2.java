package practice.testng.reporterclass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest2 {

	ExtentReports report;
	

	@BeforeSuite
	public void configBS() {
		// Spark Report Config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report2.html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		// Add Environment Information And Create Test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
	}

	@AfterSuite
	public void configAS() {
		// To Get The BackUp of report file
		report.flush();
	}

	@Test
	public void createContactTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		//Takes Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		String filePath = ts.getScreenshotAs(OutputType.BASE64);
		// Spark Report Config
		ExtentTest test = report.createTest("createContactTest");
		test.log(Status.INFO, "Login To App");
		test.log(Status.INFO, "Navigate To Contact Page");
		test.log(Status.INFO, "Create Contact");
		if ("HDFdd".equals("HDFC")) {
			test.log(Status.PASS, "Contact is created");
		} else {
			test.addScreenCaptureFromBase64String(filePath, "ErrorFile");
		}
		System.out.println("Login To App");
	}
}