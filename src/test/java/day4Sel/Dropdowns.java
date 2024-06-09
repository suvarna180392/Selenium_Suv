package day4Sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		
		Select selDropdown = new Select(driver.findElement(By.xpath("//select"))); 
		
		
		//selDropdown.selectByIndex(13);
		
		selDropdown.selectByVisibleText("Australia");
		
		//selDropdown.selectByValue("AUT");
		
		
		List <WebElement> countryList = selDropdown.getOptions();
		
		for(WebElement i: countryList ) {
			
			
			System.out.println(i.getText());
			
		}
		
		//selDropdown.deselectByVisibleText("Australia");
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
