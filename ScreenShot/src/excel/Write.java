package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	

	public static void  writeData() throws IOException
	{
        String path = System.getProperty("user.dir")+"//India.xlsx";
		
		File src = new File(path);
		
		//To load the excel file
		
		FileInputStream fis= new FileInputStream(src);
		
		// To access the workbook
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Ganesh1");
		
		File fout=new File(path);
		
		FileOutputStream fos= new FileOutputStream(fout);
		
	    sh1.getRow(0).getCell(3).setCellValue("New created");
			
	}

}
