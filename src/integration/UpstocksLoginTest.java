package integration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class UpstocksLoginTest {
	
			int a;
			WebDriver driver;
			Sheet sh;
			UpstocksLogin1 Login1;
			UpstocksLogin2 Login2;
	
	
		
			@BeforeClass
			public void openBrowser() throws EncryptedDocumentException, IOException
			{
				FileInputStream file = new FileInputStream("C:\\Selenium\\sheet2.xlsx");
				sh = WorkbookFactory.create(file).getSheet("Sheet1");
				System.setProperty("WebDriver.chrome.Driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://login-v2.upstox.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				Login1 = new UpstocksLogin1(driver);
				Login2 = new UpstocksLogin2();
				
				a=10;
				
			}
			
			@BeforeMethod
			public void LogintoApp()
			{
				
				System.out.println(a);
				Login1.InputUpstocksUsername(sh.getRow(0).getCell(0).getStringCellValue());
				Login1.InputUpstocksPassword(sh.getRow(0).getCell(1).getStringCellValue());
				Login1.InputUpstocksLoginbtn();
			}
	

				
			

}
