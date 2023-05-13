package browserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	
	
	
	}

}
