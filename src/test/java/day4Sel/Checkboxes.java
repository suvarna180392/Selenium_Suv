package day4Sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {		
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@value='purple']")).click();
		
		List <WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(WebElement i : checkBox) {
			
			
			if(i.getAttribute("value").equals("purple") || i.getAttribute("value").equals("orange") || i.getAttribute("value").equals("blue")) {
				
				i.click();
				
				
				//System.out.println(i);
				
				//continue;
			}
			
			
			
		}
		
		
		for(WebElement i : checkBox) {
			
//				if(i.getAttribute("value").equals("purple") || i.getAttribute("value").equals("orange") || i.getAttribute("value").equals("blue")) {
//				
//					i.click();
//				
//		
//			}
//				
//				
//				else {
//					
//					i.click();
//				}
			
			
			
			if(i.isSelected()) {
				
				i.click();
				
			}
			
			else {
				
				continue;
			}
			
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		

	}

}
