package day1TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CrossBrower_ParallelTesting {
	
	

	WebDriver driver;
	
	@BeforeClass
	
	@Parameters({"browser"})
	
	public void openBrowser(String bname) {
		
		
		if(bname.equals("Chrome")) {		
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		driver = new ChromeDriver(options);
		
		}
		
		else if(bname.equals("Edge")) {
			
			EdgeOptions opt = new EdgeOptions();
			
			opt.setBrowserVersion("125.0.2535.67");
			
			driver = new EdgeDriver(opt);
			
		}
		
		
		else {
			
			
			driver= new FirefoxDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	@Test
	
	public void loginToOrange() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		String displayTitle = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		
		boolean userId =  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).isDisplayed();
		
		
		System.out.println("Test executed!!!!!!!!!");
		
				
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
			
		Assert.assertTrue(true);		
	}
	

	
	
		@AfterClass
	
	public void closeBrowser() {
		
		driver.quit();
		
		
	}

}
