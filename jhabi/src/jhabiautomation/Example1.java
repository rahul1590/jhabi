package jhabiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/browser-windows");
		String expectedresult="Amazon.com";
		String actualresult=driver.getTitle();
		if(actualresult.equals(expectedresult))
		{
			System.out.println("We are on correct page test case passed");
		}
		else
		{
			System.out.println("We are on wrong page test case failed");
		}
		
		String expected="https://www.amazon.com/ref=nav_logo";
		String actual =driver.getCurrentUrl();
		if(actual.equals(expected))
		{
			System.out.println("We are on correct page URL is same");
		}
		else
		{
			System.out.println("We are on wrong page URL is different");
		}
		
		driver.findElement(By.cssSelector("button#tabButton")).click();
	}

}
