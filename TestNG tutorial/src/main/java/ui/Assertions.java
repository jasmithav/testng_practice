package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	@BeforeTest
	static void setup() {
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public void assertions() throws Exception {
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle= driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		Thread.sleep(2000);
		driver.close();
	}
}
