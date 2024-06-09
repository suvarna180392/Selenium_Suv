package day6Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Datepickers {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		//Actions action = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 
		 
		 while(true) {
			 
			 String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 
			 System.out.println(month);
			 
			 String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 
			 System.out.println(year);
			 int days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::tr")).size();
			 
			 System.out.println(days);
			 
			 int date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::tr[2]/td")).size();
			 
			 System.out.println(date);
			 
			 if(month.equals("August")  && year.equals("2024")) {
				 
				 
				 System.out.println(days+"   "+date);
				 
				 
				 
				 for(int i=2; i<=days; i++) {
					 
					 
					 for(int j=1; j<=date; j++) {
						 
					WebElement selDate=	 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::tr["+i+"]/td["+j+"]"));
					
					String selectedDate = selDate.getText();
					
					int d = Integer.parseInt(selectedDate);
					
					System.out.println(selectedDate+"  is the selected date");
					
					
					if(d==24) {
						
						selDate.click();
						
								
						break;
						
					} //end of if loop
					
					
						 
					 } //end of columns for loop
					 
				 } //end of rows for loop
			 } // end of main if loop
				 
			 
			 
				 else {
					 
					 
					 driver.findElement(By.xpath("//a[@title='Next']")).click();
					 
					 
					 
				 }
				
			
			 
			 }
			 

			//Thread.sleep(5000);
			
			//driver.quit();
			 
		 }
		 
		 
	}


