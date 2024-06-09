package day1Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		driver.get("https://www.amazon.in/");
				
		Thread.sleep(3000);
				
		
//		WebElement search = driver.findElement(By.id("s"));
//		
//		
//		search.sendKeys("Books");
//		
//		WebElement searchInput = driver.findElement(By.className("button_search"));
//		
//		searchInput.click();
//		
//		Thread.sleep(3000);
//		
		
//		WebElement userN= driver.findElement(By.name("username"));
//		
//		userN.sendKeys("Admin");
//		
//		WebElement userP = driver.findElement(By.name("password"));
//		
//		userP.sendKeys("admin123");
//		
//		
//		WebElement login = driver.findElement(By.className("orangehrm-login-button"));
//		
//		
//		login.click();
//		
//		Thread.sleep(5000);
//		
//		WebElement loginName = driver.findElement(By.className("oxd-userdropdown-name"));
//		
//		loginName.click();
//		
//		Thread.sleep(1000);
//		
//		 WebElement logOut = driver.findElement(By.partialLinkText("Log"));
//		
		
//		WebElement logOut = driver.findElement(By.linkText("Logout"));
//		
//	logOut.click();
		
	List <WebElement> links = driver.findElements(By.tagName("a"));
	
	
	System.out.println(links.size());
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

		
		
	}

}
