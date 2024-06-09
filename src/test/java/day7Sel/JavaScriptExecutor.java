package day7Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(opt);
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.switchTo().frame(0);
		
		WebElement a = driver.findElement(By.xpath("//input[@id='RESULT_TextField-0']"));
		
		//a.sendKeys("How are you?");
		
		
		WebElement b = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		
		//b.click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		jse.executeScript("arguments[0].setAttribute('value','Suvarna Kodukula')", a);
		
		jse.executeScript("arguments[0].click();", b);
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
