package testNGPractice;

import org.testng.annotations.Test;

public class Keywords {
	
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("login from keywords");
	}
	

	@Test(priority=2)
	public void dashboard()
	{
		System.out.println("dashboard from keywords");
	}
	

	@Test(priority=3)
	public void profile()
	{
		System.out.println("profile from keywords");
	}
	

	@Test(priority=4)
	public void logout()
	{
		System.out.println("logout from keywords");
	}
	
	

	
	
	
}
