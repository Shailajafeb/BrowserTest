package package2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.interactions.*;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);	
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		
	//	driver.findElement(By.xpath("//*[@id=\'APjFqb\']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.linkText("About")).click();
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);	
		if (driver.findElement(By.partialLinkText("Gm")).isDisplayed())
						{
			System.out.println("Webpage Google loaded successfully");
		}
		else
	 {
		 System.out.println("HA HA HA");
	}
		driver.findElement(By.linkText("Gmail")).click();
		driver.quit();
	}
	}
