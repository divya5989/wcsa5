package DataDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {

	
		// TO store generic reusable method
		//all the  methods are non static
		
		public void readExcelData(String excelpath,String sheetName);
		FileInputStream fls = new FileInputStream();
		 Workbook wb = WorkbookFactory.create(fls);
		 Sheet sheet = wb.getSheet("validcreds");
		 Row row = sheet.getRow(1)
		

	}

}
