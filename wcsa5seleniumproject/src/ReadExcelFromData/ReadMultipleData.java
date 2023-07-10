package ReadExcelFromData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			//Read data from IPL sheet
			//Implementation of read  multiple value data from Excel sheet by using for loop
			
			for(int i=1;i<=10;i++)
			{
			 FileInputStream fls = new FileInputStream("./data/TestData.xlsx");//Provide path of file
			 Workbook wb = WorkbookFactory.create(fls);//
			 Sheet sheet = wb.getSheet("IPL");//get into the sheet
			 Row row = sheet.getRow(i);//get into the desired row
			 Cell cell = row.getCell(1);//get into the desired cell or column
			 String data = cell.getStringCellValue();//Read the data from cell
			 Thread.sleep(3000);
			 System.out.println(data);
}

			
	}

}
