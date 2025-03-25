package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://youtube.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();

	}
}
