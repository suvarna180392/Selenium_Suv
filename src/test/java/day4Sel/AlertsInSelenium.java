package day4Sel;

import java.time.Duration;

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // autheticate pop-up
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click(); // only has to accept
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		
		//Alert alert = driver.switchTo().alert();
		
		
		//alert.accept();
		
		//alert.dismiss();
		
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
