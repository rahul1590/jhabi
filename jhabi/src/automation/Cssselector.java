package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("secret_sauce");
		driver.navigate().to("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a.analystic[data-toggle='tab']")).click();
	}

}
