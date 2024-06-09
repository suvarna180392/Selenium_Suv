package day8Sel;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\DataDrivenTesting\\AutoExcel2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sh = workbook.getSheet("Sheet1");
		
		
		
		XSSFRow row = sh.getRow(1);
		
		XSSFCell cell = row.getCell(0);
		
		
		String cellData = cell.getStringCellValue();
		
		System.out.println(cellData);
		
		int rows = sh.getLastRowNum();
		
		int cells = sh.getRow(0).getLastCellNum();		
		
		for(int i=0; i<=rows; i++) {
			XSSFRow rowNew = sh.getRow(i);
			
			
			
			for(int j=0; j<=cells; j++) {
				
				XSSFCell newCell = rowNew.getCell(j);
				
				DataFormatter formatter = new DataFormatter();
				
				String celVal = formatter.formatCellValue(newCell); // formats any type of data and prints
				
				//String celVal = newCell.getStringCellValue(); // returns only string values
				
				System.out.println(celVal);
				
				
			}
			
			
		}
		
		
		workbook.close();
		
		file.close();
		
	
		
		
		
		

	}

}
