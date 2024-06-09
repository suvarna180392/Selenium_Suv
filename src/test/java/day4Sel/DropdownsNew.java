package day4Sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownsNew {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
		
		
		List <WebElement> course = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for(WebElement i : course) {
			
			if(i.getAttribute("value").equals("Java")  || i.getAttribute("value").equals("MySQL") || i.getAttribute("value").equals("Bootstrap")) {
				
				i.click();
			}
			
			else if (i.getAttribute("value").equals("HTML")  || i.getAttribute("value").equals("CSS") ) {
				
				i.click();
				
				
			}
					
		}
		
		
		
				
		
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		

	}

}
