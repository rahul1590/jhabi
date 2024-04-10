package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
//    	driver.get("https://www.amazon.com/Portable-Relaxing-Soothing-Charging-Auto-Off/dp/B00A2JBMRE/?_encoding=UTF8&pd_rd_w=WSlEu&content-id=amzn1.sym.223027c6-8030-47e4-a6f7-fd0fd07387a6&pf_rd_p=223027c6-8030-47e4-a6f7-fd0fd07387a6&pf_rd_r=FBV0QZF5VXR5D9YV3MEC&pd_rd_wg=5gZFh&pd_rd_r=f79c0f5f-3cf9-4d83-ab2e-cb2f95af9a20&ref_=pd_gw_unk&th=1");
//    	
//    	driver.findElement(By.linkText("Visit the Homedics Store")).click();

//    	driver.get("https://www.saucedemo.com/");
//    	
//    	driver.findElement(By.name("user-name")).sendKeys("swapnil");
//    	Thread.sleep(5000);
//    	driver.findElement(By.name("user-name")).clear();
//    	
//    	String name =driver.findElement(By.id("login-button")).getText();
//    	System.out.println(name);
    	
    	driver.get("https://www.amazon.com/ref=nav_logo");
    	driver.navigate().refresh();
    	driver.findElement(By.linkText("Customer Service")).click();
    	String cs = driver.getTitle();
    	String cu = driver.getCurrentUrl();
        System.out.println("current title is"+cs);
        System.out.println("current url is"+cu);
    	
    	driver.findElement(By.linkText("Sell")).click();
    	driver.navigate().back();
    	Thread.sleep(3000);
    	driver.navigate().forward();
    	Thread.sleep(3000);
    	driver.navigate().refresh();
    	driver.close();
	}

}
