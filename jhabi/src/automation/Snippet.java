package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Snippet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.saucedemo.com/");
    	WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.id("login-button"));
        login.click();
        
        
        Select find = new Select(driver.findElement(By.className("product_sort_container")));
        Thread.sleep(3000);
//        find.selectByIndex(2);
//        Thread.sleep(3000);
//        find.selectByValue("za");
//        Thread.sleep(3000);
        find.selectByVisibleText("Price (high to low)");
        Thread.sleep(3000);
        driver.close();
    
        
		
	}
}

