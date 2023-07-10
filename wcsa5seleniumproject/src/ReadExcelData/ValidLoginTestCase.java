package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
    System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://desktop-egpv2j5/login.do");
    
    // read the data from Excel file and test the login page 
    FileInputStream fls = new FileInputStream("./data/Actitime.xlsx");
	 Workbook wb = WorkbookFactory.create(fls);
	 Sheet sheet = wb.getSheet("validcreds");
	 Row row = sheet.getRow(1);
	 Cell cell = row.getCell(0);
	 String Validusername = cell.getStringCellValue();
	 
	 Thread.sleep(2000);
	 
	 

	}

}
