package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHandling2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\FileTest\\testdata.xlsx");

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

		String[][] myData = new String[rowCount][colCount];

		DataFormatter df = new DataFormatter();

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				// System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j))+"\n");

				myData[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}

		}

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				System.out.print(myData[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
