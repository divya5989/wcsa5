package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToAmazon {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.gecko.driver", "./drivers/geckodriver.exe");

		// for AMAZON
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_31");
		driver.findElement(By.cssSelector("input[id^='ap_']")).sendKeys("Gohan@abc.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='c']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}