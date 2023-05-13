package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZerodhaCode {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("GY0965");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("India@1");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("230610");
	}

}
