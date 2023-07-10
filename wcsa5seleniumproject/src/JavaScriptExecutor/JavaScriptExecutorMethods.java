package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the Browser
		driver.manage().window().maximize();
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //launch the Web application
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		// by apply scroll Left
		jse.executeScript("window.scrollBy(-5000,0)");
		Thread.sleep(2000);
		//by apply scroll right
		jse.executeScript("Window.scrollBy(5000,0)");
		// need to run

	

	}

}
