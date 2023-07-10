package PopupHandling;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.edges.driver","./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/DELL/Desktop/confirmation.html");
			//to generate  confirmation pop up to click on Submit button
           driver.findElement(By.tagName("input")).click();
           // to handle  confirmation pop up by using SwitchTo()
           Alert al = driver.switchTo().alert();
           Thread.sleep(2000);
           System.out.println(al.getText());
           al.sendKeys("Are you there?");
           
           
           
	}

}
