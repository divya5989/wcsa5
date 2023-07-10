package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToParticularWebElement {

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
		//identify the WebElement
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		//to perform scrolling operation for NewsElement
		//Location of newsElement
		 Point loc = newsElement.getLocation();
		 
		
		
		
					

	}

}
