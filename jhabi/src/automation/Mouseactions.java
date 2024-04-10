package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://demoqa.com/buttons");
    	
    	Actions act = new Actions(driver);
    	WebElement dc = driver.findElement(By.id("doubleClickBtn"));    	
    	
    	act.moveToElement(dc).doubleClick(dc).build().perform();

    
    	WebElement rc = driver.findElement(By.id("rightClickBtn")); 
    	act.contextClick(rc).perform();
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,250)", "");
    	
    	Thread.sleep(3000);
    	driver.get("https://demoqa.com/droppable");
    	
    	WebElement dragme =driver.findElement(By.id("draggable"));
    	WebElement drophere =driver.findElement(By.id("droppable"));
    	
    	act.dragAndDrop(dragme, drophere).perform();
    	
    	Thread.sleep(3000);
    	driver.get("https://demoqa.com/tool-tips");
    	WebElement mousehover =driver.findElement(By.id("toolTipButton"));
    	
    	act.moveToElement(mousehover).perform();
    	
    	
//    	WebElement cc = driver.findElement(By.xpath("//*[@id=\"fpChq\"]"));
//    	act.click(cc).perform();

	}

}
