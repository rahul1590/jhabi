package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.amazon.com/");
    //	driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    //	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]")).click();    	
    	
    //	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
    	
    //	driver.findElement(By.xpath("//*[contains(@data-testid,'royal_login_button')]")).click();
    //	driver.findElement(By.xpath("//*[contains(@id,'_0_5')]")).click();
    //	driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();
    	
    //	driver.findElement(By.xpath("//*[contains(text(),'Customer Service') and @tabindex='0']")).click();
    //	driver.findElement(By.xpath("//*[contains(text(),'Customer Service') or @data-csa-c-id='hwai95-l4jrj9-ysx1ph-je3015']")).click();
    //	driver.findElement(By.xpath("//*[starts-with(@id,'u_0_5')]")).click();
    	driver.findElement(By.xpath("//*[text()='Customer Service']")).click();
	}
	
}
