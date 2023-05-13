package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read {
	
	public static void readData() throws IOException
	{
		String path = System.getProperty("user.dir")+"//India.xlsx";
		
		File src = new File(path);
		
		//To load the excel file
		
		FileInputStream fis= new FileInputStream(src);
		
		// To access the workbook
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Ganesh1");
		String value = sh1.getRow(0).getCell(1).getStringCellValue();
		 System.out.println(value);
		 
	}
	
	public static void main(String[] args) throws IOException {
		 readData();
		 
		 Write.writeData();
		
	}
		
		
		
		
		
		
		
		
		
	}
