package DataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogiTestCase {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("http://desktop-egpv2j5/login.do");
		    
		    // read the data from excel file and test the login page
		   Flib flib = new flib();
		   String validusername = flib.readExcelData("./data/ActitimeTestData.xlsx","validcreds");
		   String validpassword = flib.readExcelData("./data/ActitimeTestData.xlsx\",\"validcreds");
		   
		   driver.findElement(By.name("username")).sendKeys(validusername);
		   
		   
		    

	}

}
