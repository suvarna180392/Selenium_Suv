package day1Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAuto {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();  //Sets the system property to chrome driver using the driver manager from pom.xml
		
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		//WebDriverManager.edgedriver().setup();
		
		
		EdgeOptions opt = new EdgeOptions();
		
		opt.setBrowserVersion("125.0.2535.67");
		
		
		driver = new EdgeDriver(opt);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		//WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}

}
