package day2Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		
		System.out.println("Test started successfully!!");
		
		//driver.get("https://www.globalsqa.com/demo-site/");
		driver.get("https://device.pcloudy.com/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		
		WebElement signInh1 = driver.findElement(By.cssSelector("div.right_signupLogin>div.signup-form>div.justify-content-center>div.p-16>h1.signup-title-welcome"));
		
		
		String text = signInh1.getText();

		System.out.println(text);

		
		
		// WebElement googleSign = driver.findElement(By.cssSelector("button[id^='gSign']")); // ^=  prefix of a string
		
//		WebElement googleSign = driver.findElement(By.cssSelector("button[id$='CustomBtn']")); //$= suffix of a string
//		
//		googleSign.click();
		
		
//		WebElement userEmail = driver.findElement(By.cssSelector("input[name='userId']")); 
//		
//		
//		userEmail.sendKeys("Suvarna");
//		
//		
//		WebElement userPassword = driver.findElement(By.cssSelector("input[id='password']"));
//		
//		userPassword.sendKeys("Suvarna");
//		
//		
//		WebElement loginButton = driver.findElement(By.cssSelector("button[type='button'][id='loginSubmitBtn']"));
//		
//		
//		loginButton.click();
		
		
		
		WebElement emailId = driver.findElement(By.cssSelector("input[id*='rId']")); // *= is used to locate a word within a String
		
		emailId.sendKeys("suvarna");
		
		
		//WebElement userPass = driver.findElement(By.cssSelector(text));
		
		
		List <WebElement> classList = driver.findElements(By.cssSelector("input[class~='bg-white']"));
		
		System.out.println(classList.size());
		
		
		
		for(WebElement i:classList) {
			
			String listName = i.getAttribute("name");
			
			System.out.println(listName);
			
			
		}
		
		
		Thread.sleep(5000);
		
		driver.quit();
			
		System.out.println("Test executed successfully!!");
		
		

	}

}
