package pageObjectModel;

import static org.openqa.selenium.support.How.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeDashboard {
	
	
	WebDriver driver;
	
	
	public OrangeDashboard(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//h6[text()='Dashboard']") WebElement dashboard;	
	
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") WebElement userDropdown;
	
	@FindBy(how=XPATH, using="//a[text()='Logout']") WebElement logOut;
	
	
	public boolean is_login_successful() {
		
		return dashboard.isDisplayed();
		
				
	}
	
	
	public void user_logout() {
		
		userDropdown.click();
		
		logOut.click();
		
		
	}
	
	
	
	
}
