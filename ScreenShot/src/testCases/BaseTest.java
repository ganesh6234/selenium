package testCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;

public class BaseTest {
	
	static WebDriver driver;
	LoginPage lp;
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
		
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
			}
	
	@BeforeClass
	public void createObject()
	{
	         lp= new LoginPage(driver) ;
		
	}
	
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
