package waitsss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=maha&rlz=1C1GGRV_enIN957IN957&oq=maha&aqs=chrome..69i57j46i131i433i512j46i131i199i291i433i512j0i433i512j46i433i512j0i433i512j46i433i512j0i131i433i512j0i512j0i271.1881j0j15&sourceid=chrome&ie=UTF-8");
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
	
		WebElement ms = driver.findElement(By.xpath("//*[text()='Maharashtra State Board of Secondary and Higher Secondary ...']"));
		wait.until(ExpectedConditions.elementToBeClickable(ms));
	        ms.click();
	}

}
