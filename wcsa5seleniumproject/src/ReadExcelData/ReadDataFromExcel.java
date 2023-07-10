package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//Read data from IPL sheet
	//Implementation of read data from Excel
	 FileInputStream fls = new FileInputStream("./data/TestData.xlsx");//Provide path of file
	 Workbook wb = WorkbookFactory.create(fls);//
	 Sheet sheet = wb.getSheet("IPL");//get into the sheet
	 Row row = sheet.getRow(3);//get into the desired row
	 Cell cell = row.getCell(1);//get into the desired cell or column
	 String data = cell.getStringCellValue();//Read the data from cell
	 System.out.println(data);

	}

}
