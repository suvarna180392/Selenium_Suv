package day3Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://automationexercise.com/");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id(""));
		
		driver.close();
		driver.quit();
		
		
		//Get Methods of driver
		
		
		driver.get("url");
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
		driver.getPageSource();
		
		driver.getWindowHandle(); //Returns a String
		
		driver.getWindowHandles(); //Returns a Set{}
		
		
		
		
		
		//Conditional Methods of driver
		
		
boolean flag=driver.findElement(By.xpath("//a[@href='/products']")).isDisplayed();
		
		
		System.out.println("Status of element is "+flag);
		
		//isEnabled();
		
		System.out.println(driver.findElement(By.xpath("//a[@href='/products']")).isEnabled());
		
		
		

//		isSelected();
		
		driver.get("https://materializecss.com/radio-buttons.html");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Yellow']/preceding-sibling::input")).isSelected());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
