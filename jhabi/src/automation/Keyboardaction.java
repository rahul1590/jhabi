package automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://en.key-test.ru/");
    	
    	Actions act = new Actions(driver);

    	act.sendKeys(Keys.ENTER).perform();
    	act.sendKeys(Keys.SPACE).perform();
    	act.sendKeys(Keys.NUMPAD5).perform();
    	
    	
    
    	
    	}

}
