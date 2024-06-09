package day5Sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTable {

	public static void main(String[] args) {
				
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setBrowserVersion("125.0.6422.113");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://getdataden.com/docs/grid/features/pagination/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String tablePath = "//div[@id='dd-basic-pagination']";
		
		
		
		
	String pageSize = driver.findElement(By.xpath(tablePath+"/descendant::div[@class='data-den-pagination-info']")).getText();
		
		
		String [] pS = pageSize.split(" ");
		
		String [] splitWord = pS[0].split("-");
		
		String var1 = splitWord[1];
		
		System.out.println(var1);
		
				
		String var2 =  pS[2];
		
		System.out.println(var2);
		
		
		int k=0;
		
		
		while(k<=2) {
			
				
					
					for(int i=1; i<=RowsAndColumns.numberOfRows(driver); i++) {
						
						for(int j=1; j<=RowsAndColumns.noOfColumns(driver); j++) {
							
					String cellData = driver.findElement(By.xpath("//div[@id='dd-basic-pagination']/descendant::div[@class='data-den-grid-rows']/descendant::div[@class='data-den-main-cells-wrapper']["+i+"]/descendant::span["+j+"]")).getText();
							
							
							System.out.println(cellData);
							
							
						}
						
						
						
					}
					
					if(var1.equals(var2)) {
						
						
						System.out.println("We reached end of the content!!!");
						driver.quit();
						
					
					}
					
					else {
						
						driver.findElement(By.xpath(tablePath+"/descendant::button[@ref='data-den-pagination-next-button']")).click();
						
						int rowsInPage2 = driver.findElements(By.xpath(tablePath+"/descendant::div[@class='data-den-grid-rows']/child::div")).size();
						
						System.out.println(rowsInPage2);
						
						int columnsInPage2 = driver.findElements(By.xpath(tablePath+"/descendant::div[@class='data-den-grid-rows']/descendant::div[@class='data-den-main-cells-wrapper'][2]/descendant::span")).size();
						
						System.out.println(columnsInPage2);
						
						
					}	
					
									
			
			
			k++;
			
					
			
			
			}
		
		
		
	}
	

}
	


