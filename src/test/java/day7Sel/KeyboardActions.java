package day7Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://gotranscript.com/text-compare");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
		
		
		
		WebElement input2 = driver.findElement(By.xpath("//textarea[@name='text2']"));
		
		input1.sendKeys("Hi My name is Suvarna! I am learning Automation with the help of Mr. Gubbs!!");
		
		input1.click();
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform(); 
		
		actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		Thread.sleep(3000);		
		
		driver.quit();
	}

}
