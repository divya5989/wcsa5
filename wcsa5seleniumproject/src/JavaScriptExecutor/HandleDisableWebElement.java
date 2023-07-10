package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//launch the browser
			WebDriver driver = new ChromeDriver();
			// maximize the Browser
			driver.manage().window().maximize();
			//Apply implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    //launch the Web application
			driver.get("file:///C:/Users/DELL/Desktop/selenium.html");

	}

}
