package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSpicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(divya);
		driver.findElement(By.xpath("//div[[@css-'css-76zvg2 r-cqee49 r-ubezar r-majxgm r-1ifxtd0 r-kc8jnq'])")))
		
		

	}

}
