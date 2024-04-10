package jhabiautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
//		driver.findElement((By.xpath("//*[@id='alertButton']"))).click();
//		Thread.sleep(3000);
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Alert alert =driver.switchTo().alert();
		
//		alert.accept();
//		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
//		System.out.println(alert.getText());
//		Thread.sleep(3000);
//		alert.dismiss();
//		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2250)","");
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Thread.sleep(3000);
		alert.sendKeys("Swapnil");
		Thread.sleep(3000);
		driver.quit();
	}

}
