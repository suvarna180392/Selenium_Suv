package day7Sel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchingWindows {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		driver.get("https://www.google.com/");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		
				
		driver.quit();
		
		
		

	}

}
