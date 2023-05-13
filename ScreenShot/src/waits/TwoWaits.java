package waits;

import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWaits {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/search?q=nsdl&rlz=1C1GGRV_enIN957IN957&oq=&aqs=chrome.5.35i39i362l8...8.638251611j0j7&sourceid=chrome&ie=UTF-8");
	
	
	
	}

}
