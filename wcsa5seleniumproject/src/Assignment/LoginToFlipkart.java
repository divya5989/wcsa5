package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToFlipkart
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
     	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("hp Laptops");
    	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    	
    	
    	
	}
}
    	
	
	

