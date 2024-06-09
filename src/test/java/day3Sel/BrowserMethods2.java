package day3Sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserMethods2 {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://automationexercise.com/");  // opens a Browser with the given URL
		
		driver.manage().window().maximize();  // Maximizes the browser window
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://amazon.in");
		
		Set<String> s = driver.getWindowHandles();
		
		for(String ob:s) {
			
			driver.switchTo().window(ob);
			
			System.out.println(driver.getTitle());
			
			//System.out.println(driver.getPageSource());
			
			System.out.println(driver.getCurrentUrl());
			
			//driver.quit();
			
			
		}
		//driver.findElement(By.id("")); // used to find a Web Element using its id
		
		
		

	}

}
