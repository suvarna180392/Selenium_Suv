package day7Sel;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollPagesUsingJavaScript {

	public static void main(String[] args) throws InterruptedException {


		
		
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		System.out.println(jse.executeScript("return window.pageYOffset"));//
		
		
		
		//WebElement ganesha = driver.findElement(By.xpath("//img[@alt='My Dream Carts Ganesha Om Chakra Key Holder for Home Decor Items | Stylish Key Hanger Wall Mounted Decoration |...']"));
		
		
		//jse.executeScript("arguments[0].scrollIntoView();", ganesha); // to scroll to a particular web element
		
		//jse.executeScript("window.scrollBy(0,2000)", ""); //to scroll using pixels using x and y axis
		
		
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset"));
		
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		
		
		Thread.sleep(10000);
		
		driver.quit();
		
	
	
	
	}

}
