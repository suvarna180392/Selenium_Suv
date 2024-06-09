package day5Sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		String tablePath = "//table[@name='BookTable']";
		
		// find no. of rows, columns, print any column data, print all data
		
		
		int rows = driver.findElements(By.xpath(tablePath+"/descendant::tr")).size(); //no. of rows
		
		System.out.println(rows);
		
		
		int columns = driver.findElements(By.xpath(tablePath+"/descendant::tr/th")).size(); // no. of columns
		
		System.out.println(columns);
		
		
		String colData = driver.findElement(By.xpath(tablePath+"/descendant::tr[5]/td[3]")).getText();
		
		System.out.println(colData);
		
		
		//using for loop print all column data
		
		
		
		for(int i=2; i<=rows; i++ ) {
			
			
			for(int j=1; j<=columns; j++ ) {
				
				
			String columnData =	driver.findElement(By.xpath(tablePath+"/descendant::tr["+i+"]/td["+j+"]")).getText();
			
			System.out.println(columnData);
				
				
				
				
			}
			
		
		}
		
			
			
		
		
		Thread.sleep(3000);
		
		
		
		driver.quit();

	}

}
