package day9Sel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadExcelFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(opt);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		int rowsOrange = ExcelUtilityManager.rowNumber("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\DataDrivenTesting\\OrangeDemo.xlsx", "Sheet1");
		
		System.out.println(rowsOrange);
		
		
		int cellsOrange = ExcelUtilityManager.cellNumber("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\DataDrivenTesting\\OrangeDemo.xlsx", "Sheet1");
		
		System.out.println(cellsOrange);
		
		String userName = ExcelUtilityManager.cellData("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\DataDrivenTesting\\OrangeDemo.xlsx", "Sheet1", 1, 0);
		
		String passWord = ExcelUtilityManager.cellData("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\DataDrivenTesting\\OrangeDemo.xlsx", "Sheet1", 1, 1);
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		
		System.out.println(userName);
		
		user.sendKeys(userName);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		System.out.println(passWord);
		
		password.sendKeys(passWord);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
