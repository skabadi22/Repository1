package POMPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMCLASSLOGIN {
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
				
		FileInputStream file1 = new FileInputStream("C:\\Selenium\\sheet2.xlsx");
		Sheet sh = (Sheet) WorkbookFactory.create(file1).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String username = sh.getRow(0).getCell(0).getStringCellValue();
	
		driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys(username);
	
						
	
	}
			
}
