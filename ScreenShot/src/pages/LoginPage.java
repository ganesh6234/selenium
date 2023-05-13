package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id='txtUsername']") 
	private WebElement username;
	
	@FindBy(xpath = "//*[@id='txtPassword']") 
	private WebElement password;
	
	@FindBy(xpath = "//*[@id='btnLogin']") 
	private WebElement submit;
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	public void logInToApp()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submit.click();
	}

}
