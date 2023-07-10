package JavaScriptExecutor;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//launch the browser
	WebDriver driver = new ChromeDriver();
	// maximize the Browser
	driver.manage().window().maximize();
	//Apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //launch the Web application
	driver.get("https://www.selenium.dev/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	// by apply scroll down
	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(-500,0)");

	


	}

}
