package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Hardassert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
		String expected_title = "Swag Labs";
		String Actual_title=driver.getTitle();
		
		Assert.assertEquals(expected_title,Actual_title);
	}

}
