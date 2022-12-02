package POMPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 
{
	
	
				@Test
				public void Login() throws InterruptedException
				{
					Thread.sleep(4000);
					Reporter.log("Running Test Case1 ",true);
				}
				
				@Test(enabled=true)
				public void Login1()
				{
					
					Reporter.log("Running Test Case3",true);
				}
				
				@Test(enabled=true)
				public void Logout()
				{
					
					Reporter.log("Running Test Case2", true);
					
				}
				
												
}


