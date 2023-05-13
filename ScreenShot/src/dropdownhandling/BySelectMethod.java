package dropdownhandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.TakeScreenShotOfApp;

public class BySelectMethod {

public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	WebElement userRole = driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']"));
	userRole.click();

	
	Select sel= new Select(userRole);
	sel.selectByVisibleText("ESS");
	
	TakeScreenShotOfApp.captureSS(driver, "first");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}
