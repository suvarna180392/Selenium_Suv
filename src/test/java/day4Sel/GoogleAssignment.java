package day4Sel;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Scanner sc = new Scanner(System.in);
		
		
		//sc.next();
		
		//String searchText = sc.next();
		
		//driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(searchText); // to give input we used the scanner class
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("frameworks");
		
		
		List <WebElement> dropDown = driver.findElements(By.xpath("//div[@class='eIPGRd']/descendant::div[@class='wM6W7d']/span/b"));
		
		
		for(WebElement i : dropDown) {
			
			if(i.getText().equals("in python")) {
				
				System.out.println(i.getText());
				
				i.click();
								
				break;			
				
			}
				
			
		}	
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
