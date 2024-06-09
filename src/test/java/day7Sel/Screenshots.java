package day7Sel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		//RemoteWebDriver driver  = new ChromeDriver(options); 
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/* 
		 * Search context
		 * |
		 * |
		 * |
		 * WebDriver     take Screenshot        Java Script Executor
		 * |				|
		 * |
		 * |
		 * Remote WebDriver
		 * 
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		//takes screenshot of a whole webpage
		
		TakesScreenshot ts = (TakesScreenshot)driver; //type casting from takes screenshot interface to web driver interface to avoid mismatch
		
		
		File file = ts.getScreenshotAs(OutputType.FILE); //after taking screenshot, that will be stored in a file, so we are using file type of variable.
		
		
		File location = new File("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\Screenshots\\TestScreenshot.png");
		
		FileUtils.copyFile(file, location);
		
		
		
		//screenshot of a selected element
		
		
	
		
	File amazon =driver.findElement(By.xpath("//div[@class='_fluid-quad-image-label-v2_style_fluidQuadImageLabelBody__3tld0']")).getScreenshotAs(OutputType.FILE);
	
	File location2 = new File("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\Screenshots\\AmazonScreen.png");
	
	FileUtils.copyFile(amazon, location2);
		
		
		
		driver.quit();

	}

}
