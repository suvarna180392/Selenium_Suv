package day3Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//implicit wait
		
		//WebDriverWait newWait = new WebDriverWait(driver, Duration.ofSeconds(5000));//explicit wait
		
		//newWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).sendKeys("Story Books");
		
		FluentWait newWait = new FluentWait(driver);
		
		newWait.withTimeout(Duration.ofSeconds(50));
		
		newWait.pollingEvery(Duration.ofSeconds(1));
		
		newWait.ignoring(Exception.class);
		
						
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Story Books");
		
		
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		
		//newWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id='nav-search-submit-button']"))).click();
		
		
		//Thread.sleep(6000);
		
		
		//WebElement bookName = driver.findElement(By.xpath("//span[text()='108 Bedtime Stories (Illustrated) - Story Book for Kids - Fairytales - 4 Years to 10 Years Old - English Short Stories for Children - Read Aloud to Infants, Toddlers']/ancestor::h2/parent::div[@data-cy='title-recipe']/descendant::a[1]"));
		
		
		//String newUrl = driver.getCurrentUrl();
		
		
		//driver.switchTo().newWindow(WindowType.TAB).get(newUrl);
		
		
		WebElement bookName = (WebElement)newWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='108 Bedtime Stories (Illustrated) - Story Book for Kids - Fairytales - 4 Years to 10 Years Old - English Short Stories for Children - Read Aloud to Infants, Toddlers']/ancestor::h2/parent::div[@data-cy='title-recipe']/descendant::a[1]")));
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].click;", bookName);
			
		//Thread.sleep(1000);
		
		//System.out.println("name of the book is: "+bookName.getText());
		
//		if(bookValue.isEmpty() && bookValue.isBlank() || bookValue.equals(null)) {
//			
//			System.out.println("Book value is null!!");
//		}
//
//		else {
//			
//			
//			System.out.println(bookValue);
//		}
//		
		Thread.sleep(5000);
		
		driver.quit();
		
		System.out.println("Script executed successfully");
	}

}
