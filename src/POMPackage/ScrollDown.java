package POMPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {
	
	
	
			@Test
			public void ScrollDown() throws InterruptedException
			{
				
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				
				Thread.sleep(2000);
				
				
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
				
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
				
				Thread.sleep(2000);
				driver.close();
				
				
			}

}
