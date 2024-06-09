package day9Sel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityManager {
	
	
	public static int rowNumber(String file, String sheetName) throws IOException {
		
		FileInputStream fileNew = new FileInputStream(file);
		
		XSSFWorkbook wbNew = new XSSFWorkbook(fileNew);
		
		XSSFSheet sheet = wbNew.getSheet(sheetName);
		
		int rowsNum = sheet.getLastRowNum();
		
		wbNew.close();
		
		fileNew.close();
		
		return rowsNum;
				
		
	}
	
	public static int cellNumber(String file, String sheetName2) throws IOException {
		
		FileInputStream newFile = new FileInputStream(file);
		
		XSSFWorkbook wrkb = new XSSFWorkbook(newFile);
		
		XSSFSheet exsh = wrkb.getSheet(sheetName2);
		
				
		int cellExc = exsh.getRow(0).getLastCellNum();
		
		wrkb.close();
		
		newFile.close();
		return cellExc;	
		
		
	}
	
	
	public static String cellData(String filePath, String sheetName3, int rows, int cells) throws IOException {
		
		FileInputStream fls = new FileInputStream(filePath);
		
		XSSFWorkbook wrk = new XSSFWorkbook(fls);
		
		XSSFSheet newSheet = wrk.getSheet(sheetName3);
		
		XSSFCell newCell =newSheet.getRow(rows).getCell(cells);
		
		String cellData = newCell.getStringCellValue();
		
		wrk.close();
		
		fls.close();
		
		
		return cellData;
		
		
	}
	

}
