package day5Sel;

import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTables2 {

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
				
				
				//int k=0;
//				for(int i=1; i<=RowsAndColumns.numberOfRows(driver); i++) {
//					
//					for(int j=1; j<=RowsAndColumns.noOfColumns(driver); j++) {
//						
//				String cellData = driver.findElement(By.xpath("//div[@id='dd-basic-pagination']/descendant::div[@class='data-den-grid-rows']/descendant::div[@class='data-den-main-cells-wrapper']["+i+"]/descendant::span["+j+"]")).getText();
//						
//						
//				System.out.println(cellData);
//				
//				
//			}	
//			
//				}
				
				while(true) {
					
													
							if(var1.equals(var2)) {
								
								
								System.out.println("We reached end of the content!!!");
								break;
								
							
							}
							
							else {
								
								for(int i=1; i<=RowsAndColumns.numberOfRows(driver); i++) {
									
									for(int j=1; j<=RowsAndColumns.noOfColumns(driver); j++) {
										
								String cellData = driver.findElement(By.xpath("//div[@id='dd-basic-pagination']/descendant::div[@class='data-den-grid-rows']/descendant::div[@class='data-den-main-cells-wrapper']["+i+"]/descendant::span["+j+"]")).getText();
										
										
								System.out.println(cellData);
								
								
							}	
							
								}
								
								
								
							}					
							
					
					
					}
				
				driver.quit();
				
			}
			

		}
		