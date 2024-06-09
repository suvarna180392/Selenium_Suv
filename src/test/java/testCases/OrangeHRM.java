package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.HomePagePom;
import pageObjectModel.OrangeDashboard;

public class OrangeHRM {
	
	
	public WebDriver driver;
	
	
	
	@BeforeClass
	
	
	public void login_Test() {
	
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBrowserVersion("125.0.6422.113");
		
		driver = new ChromeDriver(opt);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test
	
	public void enter_user_creds() {
		
		HomePagePom hpp = new HomePagePom(driver);
		
		hpp.login_to_Orange_HRM("Admin", "admin123");
		
		OrangeDashboard ogd = new OrangeDashboard(driver);
		
		boolean success = ogd.is_login_successful();
		
		ogd.user_logout();
		
		boolean logOUtS = hpp.is_logout_successful();
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(success, true);
		
		sa.assertEquals(logOUtS, true);
		
		sa.assertAll();
		
		
	}
	
	@AfterClass

	
	public void browser_close() {
		
		driver.quit();
		
		
	}
	

}
