package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCode {
	

	public static String readData(int row, int column) throws IOException
	{
		String path = System.getProperty("user.dir")+"//India.xlsx";
		
		File src = new File(path);
		
		//To load the excel file
		
		FileInputStream fis= new FileInputStream(src);
		
		// To access the workbook
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Ganesh1");

		DataFormatter df = new DataFormatter();

		String formatteddatavalue = df.formatCellValue(sh1.getRow(row).getCell(column));

		return formatteddatavalue;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
