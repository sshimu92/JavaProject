package basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderExample {

	public static String[][] testData() throws IOException{
	
		FileInputStream fis = new FileInputStream("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\FileTest\\names.xlsx");

	// For Handling Excel Files we have to use XSSF workBook

	XSSFWorkbook workBook = new XSSFWorkbook(fis);

	XSSFSheet sheet = workBook.getSheetAt(0);

	String sh = sheet.getSheetName();
    System.out.println("Sheet: "+ sh);

	int rowCount = sheet.getPhysicalNumberOfRows();
	System.out.println("Total no of rows: " + rowCount);

	int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("Total no of columns: " + colCount);
	
	System.out.println();
	
	String[][] data = new String[rowCount][colCount];
	
	DataFormatter df = new DataFormatter();
	
	for(int i=0; i<rowCount; i++) {
		
		for(int j=0; j<colCount; j++) {
			
		data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
		     		
		}
		
	}
	
	return data;
	
	}
}
