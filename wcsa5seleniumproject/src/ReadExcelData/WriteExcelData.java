package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	     // write the data in excel sheet
		 FileInputStream fls = new FileInputStream("./data/TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fls);
		 Sheet sheet = wb.getSheet("IPL");
		 Row row = sheet.getRow(1);//or we r using sheet.createRow(11)
		 //create a cell by using row(I)
		 Cell cell = row.getCell(2);// or we r using sheet.createCell(0)
		 //write a data into the cell
		 cell.setCellValue("pune");
		 
		 FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
         wb.write(fos);
	}

}
