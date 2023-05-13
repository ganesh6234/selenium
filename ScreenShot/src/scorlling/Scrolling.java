package scorlling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,800)");
		
		
		
		
	}

}
