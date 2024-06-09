package day6Sel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Directory']")).click();
		
		
		driver.findElement(By.xpath("//label[normalize-space()='Job Title']/parent::div[@class='oxd-input-group__label-wrapper']/following-sibling::div/descendant::div[@tabindex='0']")).click();
		
		List<WebElement> dropDown = driver.findElements(By.xpath("//div[@role='option']/span")); //hidden dropdowns can be handled after removing blur form the DOM.
		
		
//		for() {
//			
//			if() {
//				
//				
//			}
//		}
//		
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		

	}

}
