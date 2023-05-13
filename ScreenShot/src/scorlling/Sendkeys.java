package scorlling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		WebElement username = driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']"));
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='ganesh',", username);
	}

}
