package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
    	driver.switchTo().frame("");
    	WebElement name =driver.findElement(By.xpath("//*[@id=\"id_form\"]"));
    	name.clear();
    	name.sendKeys("Swapnil");
    	
	}

}
