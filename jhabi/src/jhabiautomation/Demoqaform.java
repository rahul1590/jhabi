package jhabiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqaform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Kunal");
		driver.findElement(By.id("lastName")).sendKeys("Chachra");
		driver.findElement(By.id("userEmail")).sendKeys("kunal@gmail.com");
		//driver.findElement(By.id("gender-radio-1")).click();
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year =driver.findElement(By.className("react-datepicker__year-select"));
		year.click();
		Select year_select= new Select(year);
		year_select.selectByVisibleText("2026");
		
		WebElement month =driver.findElement(By.className("react-datepicker__month-select"));
		month.click();
		Select month_select= new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month_select.selectByValue("6");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		
	}

}
