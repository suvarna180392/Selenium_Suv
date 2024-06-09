package day9Sel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\DataDrivenTesting\\AutoExcel2.xlsx");
		
		XSSFWorkbook wbRead = new XSSFWorkbook(file);
		
		
		XSSFSheet sheet = wbRead.getSheet("Sheet1");
		
		XSSFCell cell3 = sheet.getRow(1).createCell(3);
		
		int rows = sheet.getLastRowNum();
		
		int columns = sheet.getRow(0).getLastCellNum();
		
		System.out.println(columns);
		
		FileOutputStream fileExcel = new FileOutputStream("C:\\Users\\SUVARNA\\MyAutomationPractice\\SelMaven\\DataDrivenTesting\\AutoExcel2.xlsx");
		
		
		for(int i=1; i<=rows; i++) {
			
			XSSFRow rows2 = sheet.getRow(i);
			
			for (int j=3; j<=columns; j++) {
				
				XSSFCell cellsNew = rows2.createCell(3);

				cellsNew.setCellValue("A++");
				
				
				
				System.out.println(cellsNew.getStringCellValue());
				
				
				
			}
		}
		
		
		wbRead.write(fileExcel);
				
		
		wbRead.close();
		
		file.close();
		
	
	}

}
