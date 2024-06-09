package day1TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsManager implements ITestListener{
	
	public ExtentSparkReporter reporter;
	
	public ExtentReports report;
	
	public ExtentTest test;
	
	
	
	
	public  void onStart(ITestContext context) {
		
		
		reporter = new ExtentSparkReporter("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\ExtentReports\\New_Report.html");
		
		
		reporter.config().setDocumentTitle("Selenium_Java Reports");
		
		
		reporter.config().setReportName("Test_Report 9th June");
		
		reporter.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		
		report.attachReporter(reporter); // to establish connection between UI and system info	
		
		report.setSystemInfo("System_Name", "Suvarna");
		
		report.setSystemInfo("Browser", "Chrome");
		
		report.setSystemInfo("OS", "Windows 11");
		
				
	}
	
	
	// to create test
	
	public void onTestSuccess(ITestResult result) {
		
		test = report.createTest(result.getName()); 
		
		test.log(Status.PASS, "Test Case has Passed and it's name is : "+result.getName());
		
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = report.createTest(result.getName());
		
		test.log(Status.FAIL, "Test case has failed and it's name is : "+result.getName());
		
		test.log(Status.FAIL,"Reason for failure : "+result.getThrowable());
		
	}
	
	
	public void onTestSkipped(ITestResult result) {
		
		
		test = report.createTest(result.getName());
		
		test.log(Status.SKIP, "Test case has skipped and it's name is : "+result.getName());
		
		test.log(Status.SKIP,"Reason for skipping : "+result.getThrowable());
		
		
	}
	
	public void onFinish(ITestContext context) {
		
		report.flush();
		
	}
	
	

}
