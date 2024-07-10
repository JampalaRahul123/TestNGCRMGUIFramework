package practice.testng.reporterclass;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest1 {

	@Test
	public void createContactTest() {
		// Spark Report Config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report1.html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		// Add Environment Information And Create Test
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
		ExtentTest test = report.createTest("createContactTest");
		test.log(Status.INFO,"Login To App");
		test.log(Status.INFO,"Navigate To Contact Page");
		test.log(Status.INFO,"Create Contact");
		if("HDFC".equals("HDFC")) {
			test.log(Status.PASS,"Contact is created");
		} else {
			test.log(Status.FAIL,"Contact isn't created");
	}
		// To Get The Backup of reporting
		report.flush();
		System.out.println("Login To App");
}
}