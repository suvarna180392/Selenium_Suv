package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePagePom {
	 WebDriver driver;
	
	public HomePagePom(WebDriver driver){
		
		
		this.driver= driver;
		
		}
	
	By username = By.xpath("//input[@name='username']");
	
	By password = By.xpath("//input[@name='password']");
	
	By loginBut = By.xpath("//button[normalize-space()='Login']");

	
	
	public void login_to_Orange_HRM(String user, String pass) {
		
		driver.findElement(username).sendKeys(user);
		
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(loginBut).click();
		
		
		
	}
	
	
	public boolean is_logout_successful() {
		
		return	driver.findElement(username).isDisplayed();
		
				
	}
	
}
