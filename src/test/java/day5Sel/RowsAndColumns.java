package day5Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RowsAndColumns {
	
	
	public static int numberOfRows(WebDriver driver) {
		
		
		int rows = driver.findElements(By.xpath("//div[@id='dd-basic-pagination']/descendant::div[@class='data-den-grid-rows']/child::div")).size();
				
		return rows;
		
	}
	
	
	public static int noOfColumns(WebDriver driver) {
		
		int columns = driver.findElements(By.xpath("//div[@id='dd-basic-pagination']/descendant::div[@class='data-den-grid-rows']/descendant::div[@class='data-den-main-cells-wrapper']["+numberOfRows(driver)+"]/descendant::span")).size();
		
		return columns ;
	}

}
