package day6Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/"); //used for left click
		
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); //used for right click, also known as context click
		
		//driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions actions = new Actions(driver);
		
	//Action act = actions.moveToElement(driver.findElement(By.xpath("//button[text()='Alert']"))).click().build();
	
	
//		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//
//		actions.contextClick(rightClick).perform();
		
		
//		
//		driver.findElement(By.xpath("//*[@class='context-menu-list context-menu-root']//span[text()='Copy']")).click();
//		
//		driver.switchTo().alert().accept();
	
	//act.perform();
		
				
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
//		
//		driver.findElement(By.xpath("//input[@id='field1']")).clear();
//		driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("Dinesh");
//		
//		WebElement element2=driver.findElement(By.xpath("//input[@id='field2']"));
//		
//		
		//WebElement element3 = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//		
		//actions.doubleClick(element3).perform();
//		
//		String text=element2.getAttribute("value");
//		
//		if(text.equals("Dinesh"))
//		{
//			System.out.println("test passed");
//		}
//		else {
//			System.out.println("failed");
//		}
		
		
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
	actions.dragAndDrop(drag, drop).perform();
	
	Thread.sleep(5000);
	
	driver.quit();
		
		
		
		

	}

}
