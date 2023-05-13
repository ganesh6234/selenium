package findElements;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.TakeScreenShotOfApp;

public class AllClick {
	public static void main(String[] args) throws IOException {
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	List<WebElement> checkbox = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));

	int numelement=checkbox.size();
	System.out.println(numelement);
	for(WebElement allcheck:checkbox)
	{
		allcheck.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
