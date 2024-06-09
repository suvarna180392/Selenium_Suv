package day1TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	
	public void beforeSuiteMet() {
		
		System.out.println("This runs before the Test!!!"); //1
	}
	
	
	
	@AfterSuite
	
	
	public void afterSuiteM() {
		
		System.out.println("This runs after the test!!!");
	}
	
	
	
	@BeforeClass
	
	
	public void add() {
		
		
		System.out.println("This is add method");
		
		
	}
	
	@BeforeTest
	
	
	
	public void testMethod() {
		
		System.out.println("This is test Method before running the test!!");
		
		
	}
	
	
	@AfterTest
	
	public void afterTestMethod() {
		
		
		System.out.println("This is after Test Method !!!!");
	}
	
	
	@BeforeMethod
	
		public void browserOpen() {
		
		System.out.println("Opened Browser");
		
		Assert.assertEquals("Browser", "Browser"); // allows only 1 assertion
		
		}
	
	@Test(priority=-5, groups= {"ABC group", "XYZ group"} )
	
	public void goToAmazonPage() {
		
		System.out.println("Amazon page is loading");
		
		Assert.assertEquals("Amazon", "Amazon"); 
		
		}
	
	
	@Test(priority=-4, groups= {"ABC group"} )
	
	public void goToSignIn() {
		
		System.out.println("Navigated to Login");
		
		Assert.assertEquals("LOgin", "LOgin"); // allows only 1 assertion
		
		}
	
	
	@Test(priority=-3, groups= {"XYZ group", "ABC group"})
	
		public void login() {
		
		System.out.println("User Name and Password is entered");
		
		Assert.assertEquals("Out", "Out"); // allows only 1 assertion
		
		}
	
	@Test(priority=-2, groups= {"ABC group"})
	
	
	public void logoutoFAmazon() {
		
		System.out.println("Logged out successfully");
		
		Assert.assertEquals("Suvarna", "Suvarna"); // allows only 1 assertion
		
		}
	
	
	//@Test(priority=-1, dependsOnMethods={"browserOpen"})
	
	
	@AfterMethod
	
	public void browserClose() {
	
	System.out.println("Closed Browser Successfully");
	
	Assert.assertEquals("Browser close", "Browser close"); // allows only 1 assertion
	
	}
	
	
	@AfterClass
	
	
	public void sub() {
		
		
		System.out.println("This is Sub method");
		
		
	}
	
	
	
	
	

}
