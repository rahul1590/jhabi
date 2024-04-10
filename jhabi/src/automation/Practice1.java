package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.saucedemo.com/");
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();
       
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i7 laptop");
       
       driver.findElement(By.id("nav-search-submit-button")).click();
       
       driver.findElement(By.id("a-autoid-0-announce")).click();
       
       driver.findElement(By.id("s-result-sort-select_3")).click();
       
       Thread.sleep(8000);
       
       driver.close();
    //   driver.quit();
	}

}
