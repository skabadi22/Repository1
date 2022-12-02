package integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstocksLogin1 {
	
	
			@FindBy(xpath = "//input[@name='userId']") private WebElement UN;
			@FindBy(xpath = "//input[@name='password']") private WebElement PWD;
			@FindBy(xpath = "//button") private WebElement btn;
			
			public UpstocksLogin1(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}

			
			
			public void InputUpstocksUsername(String username)
			{
				UN.sendKeys(username);
				
			}
			
			public void InputUpstocksPassword(String password)
			{
				PWD.sendKeys(password);
			}
			
			public void InputUpstocksLoginbtn()
			{
				
				btn.click();
			}
			
			
}
