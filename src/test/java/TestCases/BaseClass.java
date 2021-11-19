package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public String baseURL="http://demo.guru99.com/v3/index.php";
	public String username="mngr367271";
	public String password="AjEnUjU";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","/Users/veenadesai/eclipse-workspace/eBanking/Driver/chromedriver");
		driver =new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
