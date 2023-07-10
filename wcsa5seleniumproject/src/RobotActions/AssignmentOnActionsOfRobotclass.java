package RobotActions;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnActionsOfRobotclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch blue stone
		driver.get("https://www.bluestone.com/");
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		// move to watch jwellery
		Actions act = new Actions(driver);
		WebElement target1 = driver.findElement(By.xpath("//a[text()='Band']")));
		Thread.sleep(4000);
		//click and hold filter by text
		WebElement target2 = driver.findElement(By.xpath(""))
		
		for(int i=1;i<=2;i++)
		{
	    act.doubleClick(target2).perform();
	    act.clickAndHold(target2).perform();
		}
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//verify 1 design displayed or not
		if(driver.findElement(null))
		

	}

}
