package condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
        
       // driver.navigate().to("https://www.facebook.com/");
       driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

//       
//      
  //      driver.findElement(By.name("user-name")).clear();
//        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        Thread.sleep(3000);
//        String names = driver.findElement(By.name("login-button")).getText();
     //   System.out.println(names);
    //    System.out.println(driver.findElement(By.name("user-name")).getAttribute("value"));
        driver.findElement(By.id("login-button")).click();

	}

}
