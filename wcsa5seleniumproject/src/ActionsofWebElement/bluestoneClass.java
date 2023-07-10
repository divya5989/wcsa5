package ActionsofWebElement;

public class bluestoneClass {

	public static void main(String[] args) {
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class BluestoneTest {
		    public static void main(String[] args) {
		        // Set the path to the chromedriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Create a new instance of ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the browser and navigate to the given URL
		        driver.get("http://www.bluestone.com");

		        // Find and click the gold coins category
		        WebElement goldCoins = driver.findElement(By.xpath("//a[contains(@href, 'gold-coins')]"));
		        goldCoins.click();

		        // Verify the presence of 1 gram coin
		        WebElement oneGramCoin = driver.findElement(By.xpath("//span[text()='1 gram']"));
		        if (oneGramCoin.isDisplayed()) {
		            System.out.println("1 gram coin is displayed.");
		        } else {
		            System.out.println("1 gram coin is not displayed.");
		        }

		        // Close the browser
		        driver.quit();
		    }
		}


	}

}
