package PopupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.edges.driver","./drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/alert.html");
	//to generate pop up to click on button
	driver.findElement(By.xpath("//button[@type='button']")).click();
	//to handle alert pop up by using Robot class
	Robot robot = new Robot();
	robot.keyPress()
	
		


	}

}
