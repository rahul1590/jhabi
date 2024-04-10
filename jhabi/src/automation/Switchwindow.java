package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		String parent =driver.getWindowHandle();
		
		System.out.println("parent window id-"+parent);
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> I1 = s.iterator();
		
		while(I1.hasNext())
		{
			String child_window = I1.next();
			
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}

}
