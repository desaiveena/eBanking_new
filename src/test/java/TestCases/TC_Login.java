package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class TC_Login extends BaseClass
{
	
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp =new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		int a = 10;
		a =a * a;
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);

		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
}
