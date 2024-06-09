package day5Sel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		Set<String> s = driver.getWindowHandles();
		
		for(String i : s) {
			
			driver.switchTo().window(i); 
			
			String title = driver.getTitle();
			
			if(title.equals("OrangeHRM") || title.equals("Human Resources Management Software | OrangeHRM")) {
				
				System.out.println(title);
				
				//break;		
				
				
			}
					
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
