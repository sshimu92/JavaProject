package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

public static String[][] testdata() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\FileTest\\testdata1.xlsx");

		// For Handling Excel Files we have to use XSSF workBook

		XSSFWorkbook workBook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workBook.getSheetAt(0);

		String sh = sheet.getSheetName();
		System.out.println("Sheet: " + sh);

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

	public static void main(String[] args) {
		
		//print test data in matrix format
		
		try {
			
			String [][] data = testdata();
			
			for(int i=0; i<data.length; i++) {
				
				for(int j=0; j<data[i].length; j++) {
					
					System.out.print(data[i][j]+ " ");
				}
			
				System.out.println();
			}
		
		} catch(IOException e) {
				
				e.printStackTrace();
			}
		
	}
}
