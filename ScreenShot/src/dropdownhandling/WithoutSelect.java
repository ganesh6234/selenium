package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelect {
	public static void main(String[] args) throws InterruptedException {
		
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://zoom.us/signup");
	
	driver.findElement(By.xpath("//*[@id='select-0']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id='select-item-select-0-10']")).click();
	}
}
