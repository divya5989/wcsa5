package ActionsofWebElement;f

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdragmethod {

public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demo.guru99.com/test/drag_drop.html");
       WebElement Src1  = driver.findElement(By.xpath("//a[text()=' SALES ' ]"));
      WebElement target1 =  driver.findElement(By.xpath("//ol[@id='loan']/decendent::li"));
       WebElement Src2 = driver.findElement(By.xpath("//a [text()=' 5000 ']"));
       WebElement target3 = driver.findElement(By.xpath("//ol[@id='amt8']/decendent::li"));
        

	}

}
