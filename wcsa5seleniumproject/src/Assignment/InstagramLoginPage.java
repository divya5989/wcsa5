package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramLoginPage {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver", "./drivers/geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https//:www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement("input[name*='er']")).sendKeys("admin@123");
		
}
