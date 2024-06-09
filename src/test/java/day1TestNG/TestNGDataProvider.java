package day1TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDataProvider {
	
	
	WebDriver driver;
	
	@BeforeClass
	
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@DataProvider(name="OrangeData")
	
	public String[][] dataProviderMethod() {
		
		String[][] loginCreds = {{"Admin", "admin123"}, {"admin", "admin123"},{"Admin", "admin@1234"}};
		
				
		return loginCreds;
				
	}
	
	
	@Test(priority=1, dataProvider="OrangeData")
	
	public void loginToOrange(String username, String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		String displayTitle = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		
		boolean userId =  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).isDisplayed();
		
		
		System.out.println("Test executed!!!!!!!!!");
		
				
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		
//		Assert.assertTrue(userId);  //need to give the actual assert value
//		
//		Assert.assertEquals(displayTitle, "Dashboard"); // hard assertions as we are using Assert class
//		
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(userId);
		
		sa.assertEquals(displayTitle, "Dashboard");
		
		sa.assertAll(); 
		

		
	}
	

	
	
	@AfterClass
	
	public void closeBrowser() {
		
		driver.quit();
		
		
	}
	
	
}
